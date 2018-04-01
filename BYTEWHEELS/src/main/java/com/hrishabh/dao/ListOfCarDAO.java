package com.hrishabh.dao;

import java.util.Date;
import java.util.List;

import com.hrishabh.model.Bill;
import com.hrishabh.model.Car;

public interface ListOfCarDAO {

	List<Car> getlistofcars(Date start, Date end);

	List<Car> getlistofcars(Date start, Date end, String type);

	Bill generateBill(Car car);

}
