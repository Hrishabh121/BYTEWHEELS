package com.hrishabh;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<IsValiddate, Date> {

	@Override
	public void initialize(IsValiddate constraintAnnotation) {

	}

	@Override
	public boolean isValid(Date date, ConstraintValidatorContext arg1) {
		if(date==null) {
			return false;
		}
		else {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            String strDate = dateFormat.format(date);
           
            String regex ="^[0-3]?[0-9]/[0-3]?[0-9]/[1-9][0-9][0-9][0-9]$";
            
            if(strDate.matches(regex)) {
            	return true;
            }
 
            else {
            	return false;
            }	 
		}
		
	}

}
