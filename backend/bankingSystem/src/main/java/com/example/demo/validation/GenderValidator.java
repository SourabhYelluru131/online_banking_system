package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.*;
public class GenderValidator implements ConstraintValidator<ValidateGender,String> {

	@Override
	public boolean isValid(String gender, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		List<String> genderType = Arrays.asList("Male","Female","Other","male","female","other");
		return genderType.contains(gender);
		
	}

}
