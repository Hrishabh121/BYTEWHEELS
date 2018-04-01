package com.hrishabh.model;

import java.util.Date;
import com.hrishabh.IsValiddate;

public class DateSelector {

	@IsValiddate
	private Date startdate;

	@IsValiddate
	private Date enddate;

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

}
