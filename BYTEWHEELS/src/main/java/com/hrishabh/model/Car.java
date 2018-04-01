package com.hrishabh.model;

import java.util.Date;

/**
 * @author hrraj
 *
 */
public class Car {

	private String model;
	private int cost;
	private String type;
	private Date date;
	private String availableCar;
	private int noOfCarsSelected;
	private long noOfDaysSelected;

	public Car() {
		super();
	}

	public Car(String model, int cost, String type, Date date, String availableCar) {
		super();
		this.model = model;
		this.cost = cost;
		this.type = type;
		this.date = date;
		this.availableCar = availableCar;
	}

	public String getAvailableCar() {
		return availableCar;
	}

	public void setAvailableCar(String availableCar) {
		this.availableCar = availableCar;
	}

	public int getNoOfCarsSelected() {
		return noOfCarsSelected;
	}

	public void setNoOfCarsSelected(int noOfCarsSelected) {
		this.noOfCarsSelected = noOfCarsSelected;
	}

	public long getNoOfDaysSelected() {
		return noOfDaysSelected;
	}

	public void setNoOfDaysSelected(long noOfDaysSelected) {
		this.noOfDaysSelected = noOfDaysSelected;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
