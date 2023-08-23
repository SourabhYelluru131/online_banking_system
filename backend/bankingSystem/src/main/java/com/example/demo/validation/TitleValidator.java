package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.*;
public class TitleValidator implements ConstraintValidator<ValidateTitle,String> {

	@Override
	public boolean isValid(String title, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		List<String> titleType = Arrays.asList("Mr","Mrs","Ms");
		return titleType.contains(title);
		
	}

}
