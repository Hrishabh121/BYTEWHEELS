package com.hrishabh;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = DateValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValiddate {

	String message() default "Please Provide a valid date in the format of dd/mm/yyyy";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
