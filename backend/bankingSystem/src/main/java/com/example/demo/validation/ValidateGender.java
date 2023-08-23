package com.example.demo.validation;

import java.lang.annotation.ElementType;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GenderValidator.class)
public @interface ValidateGender {
	
	public String message() default "invalid gender type. It should be male/female/other";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}