package com.hrishabh.model;

public class Bill {

	private long noofDaysselected;
	private int costofVehicle;
	private int noofvehicle;
	private float totalbill;

	public float getTotalbill() {
		return totalbill;
	}

	public void setTotalbill(float totalbill) {
		this.totalbill = totalbill;
	}

	public Bill() {
		super();
	}

	public Bill(int noofDaysselected, int costofVehicle, int noofvehicle) {
		super();
		this.noofDaysselected = noofDaysselected;
		this.costofVehicle = costofVehicle;
		this.noofvehicle = noofvehicle;
	}

	public long getNoofDaysselected() {
		return noofDaysselected;
	}

	public void setNoofDaysselected(long noofDaysselected) {
		this.noofDaysselected = noofDaysselected;
	}

	public int getCostofVehicle() {
		return costofVehicle;
	}

	public void setCostofVehicle(int costofVehicle) {
		this.costofVehicle = costofVehicle;
	}

	public int getNoofvehicle() {
		return noofvehicle;
	}

	public void setNoofvehicle(int noofvehicle) {
		this.noofvehicle = noofvehicle;
	}

}
