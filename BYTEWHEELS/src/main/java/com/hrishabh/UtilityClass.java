package com.hrishabh;

import java.util.Calendar;
import java.util.Date;

public class UtilityClass {
	
	public static Date oneDayBeforeDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR,-1);
		Date oneDayBefore= cal.getTime();
		return oneDayBefore;
	}
	
	public static Date oneDayAfterDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR,+1);
		Date oneDayAfter= cal.getTime();
		return oneDayAfter;
	}

}
