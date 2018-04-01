package com.hrishabh.daoImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hrishabh.UtilityClass;
import com.hrishabh.dao.ListOfCarDAO;
import com.hrishabh.model.Bill;
import com.hrishabh.model.Car;

@Repository
public class ListOfCarsDAOImpl implements ListOfCarDAO {

	static List<Car> cars = new ArrayList<Car>();

	public ListOfCarsDAOImpl() throws ParseException {

		String date1 = "2018/04/07";
		String date2 = "2018/04/06";
		String date3 = "2018/04/08";
		String date4 = "2018/04/01";
		String date5 = "2018/04/02";
		String date6 = "2018/04/03";
		String date7 = "2018/04/04";
		String date8 = "2018/04/05";

		cars.add(new Car("FordFiesta", 20, "Compact", new SimpleDateFormat("yyyy/MM/dd").parse(date1), "2"));
		cars.add(new Car("FordFocus", 20, "Compact", new SimpleDateFormat("yyyy/MM/dd").parse(date2), "2"));
		cars.add(new Car("ChevroletMalib", 30, "Full", new SimpleDateFormat("yyyy/MM/dd").parse(date3), "2"));
		cars.add(new Car("VolkswagenJetta", 30, "Full", new SimpleDateFormat("yyyy/MM/dd").parse(date4), "2"));
		cars.add(new Car("FordEdge", 40, "Large", new SimpleDateFormat("yyyy/MM/dd").parse(date5), "2"));
		cars.add(new Car("FordEscape", 40, "Large", new SimpleDateFormat("yyyy/MM/dd").parse(date6), "2"));
		cars.add(new Car("BMW328i", 50, "Luxury", new SimpleDateFormat("yyyy/MM/dd").parse(date7), "2"));
		cars.add(new Car("BMWX5", 50, "Luxury", new SimpleDateFormat("yyyy/MM/dd").parse(date8), "2"));
	}

	@Override
	public List<Car> getlistofcars(Date start, Date end) {
		
		
		Date startdate=UtilityClass.oneDayBeforeDate(start);
		Date enddate=UtilityClass.oneDayAfterDate(end);
		
		List<Car> filtercar = new ArrayList<Car>();
		for (Car car : cars) {
			if (car.getDate().after(startdate) && car.getDate().before(enddate)) {
				filtercar.add(car);
			}
		}
		return filtercar;

	}


	@Override
	public List<Car> getlistofcars(Date start, Date end, String type) {
		
		Date startdate=UtilityClass.oneDayBeforeDate(start);
		Date enddate=UtilityClass.oneDayAfterDate(end);
		
		List<Car> filtercar = new ArrayList<Car>();

		for (Car car : cars) {
			if (car.getDate().after(startdate) && car.getDate().before(enddate) && car.getType().equals(type)) {
				filtercar.add(car);
			}
		}
		return filtercar;
	}

	@Override
	public Bill generateBill(Car car) {
		float totalbill = car.getCost() * car.getNoOfCarsSelected() * car.getNoOfDaysSelected();

		Bill bill = new Bill();
		bill.setCostofVehicle(car.getCost());
		bill.setNoofvehicle(car.getNoOfCarsSelected());
		bill.setNoofDaysselected(car.getNoOfDaysSelected());
		bill.setTotalbill(totalbill);

		updateAvailableCar(car);

		return bill;
	}

	private void updateAvailableCar(Car car) {
		String Model = car.getModel();
		for (Car car1 : cars) {
			if (car1.getModel().equals(Model) && car1.getAvailableCar() != "NOT AVAILABLE") {
				Integer selectedcar = car.getNoOfCarsSelected();
				Integer availablecar = Integer.parseInt(car.getAvailableCar());
				Integer result = availablecar - selectedcar;
				if (result > 0)
					car1.setAvailableCar(String.valueOf(result));
				else
					car1.setAvailableCar("NOT AVAILABLE");
			}
		}
	}
	
	

}
