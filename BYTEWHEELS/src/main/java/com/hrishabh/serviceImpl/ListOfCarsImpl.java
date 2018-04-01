package com.hrishabh.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hrishabh.daoImpl.ListOfCarsDAOImpl;
import com.hrishabh.model.Bill;
import com.hrishabh.model.Car;
import com.hrishabh.service.ListOfCars;

@Service
public class ListOfCarsImpl implements ListOfCars {

	@Autowired
	ListOfCarsDAOImpl daoimpl;

	@Autowired
	HttpSession session;

	@Override
	public List<Car> getlistofcars(Date start, Date end, String type) {

		selectedNoOfDays(start, end);

		List<Car> carlist = new ArrayList<>();

		if (type.equals("All"))
			carlist = daoimpl.getlistofcars(start, end);
		else {
			carlist = daoimpl.getlistofcars(start, end, type);
		}
		return carlist;
	}

	public Bill generateBill(Car car) {
		Bill bill = daoimpl.generateBill(car);
		return bill;
	}

	public void selectedNoOfDays(Date stdate, Date eddate) {
		long diff = eddate.getTime() - stdate.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);
		session.setAttribute("noofdays", diffDays);
	}

	public void getselectedNoOfDays(Car car) {
		long noofdaysselect = (long) session.getAttribute("noofdays");
		car.setNoOfDaysSelected(noofdaysselect);
	}

}
