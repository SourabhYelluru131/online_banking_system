package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.*;
public class AdminValidator implements ConstraintValidator<ValidateIsAdmin,Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		List<Integer> adminType = Arrays.asList(0,1);
		return adminType.contains(value);
	}

	

}
