package com.hrishabh.controller;


import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.hrishabh.model.Bill;
import com.hrishabh.model.Car;
import com.hrishabh.model.DateSelector;
import com.hrishabh.serviceImpl.ListOfCarsImpl;

@Controller
public class CarController {

	@Autowired
	ListOfCarsImpl cars;

	@Autowired
	HttpSession session;

	@Autowired
	ServletContext context;


	@ModelAttribute
	public void headerInit(Model model) {
		model.addAttribute("msg", "BYTEWHEELS");
	}

	@RequestMapping(value = "/DateSelector.html", method = RequestMethod.GET)
	public ModelAndView admissionFrom() {
		ModelAndView modelAndView = new ModelAndView("DateSelector");
		return modelAndView;
	}

	@RequestMapping(value = "/ListOfCars.html", method = RequestMethod.POST)
	public ModelAndView success(@Valid @ModelAttribute("selector") DateSelector selector, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView view = new ModelAndView("DateSelector");
			return view;
		}
		List<Car> carlist = cars.getlistofcars(selector.getStartdate(), selector.getEnddate(), selector.getType());
		ModelAndView view = new ModelAndView("ListOfCars");

		view.addObject("carlist", carlist);

		return view;
	}

	@RequestMapping(value = "/booking.html", method = RequestMethod.GET)
	public ModelAndView booking(@ModelAttribute("car") Car car) {

		cars.getselectedNoOfDays(car);

		ModelAndView view = new ModelAndView("Booking");
		view.addObject("car", car);

		return view;

	}

	@RequestMapping(value = "/generatebill.html", method = RequestMethod.POST)
	public ModelAndView generateBill(@RequestParam("emailId") String emailId, @ModelAttribute("car") Car car) {

		Bill bill = cars.generateBill(car);

		session.setAttribute("emailId", emailId);

		ModelAndView view = new ModelAndView("BillGeneration");
		view.addObject("bill", bill);

		return view;

	}

}
