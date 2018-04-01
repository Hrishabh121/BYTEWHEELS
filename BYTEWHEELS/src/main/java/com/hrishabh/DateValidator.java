package com.hrishabh;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<IsValiddate, Date> {

	@Override
	public void initialize(IsValiddate constraintAnnotation) {

	}

	@Override
	public boolean isValid(Date date, ConstraintValidatorContext arg1) {

		return false;
	}

}
