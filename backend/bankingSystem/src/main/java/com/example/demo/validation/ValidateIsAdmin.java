package com.example.demo.validation;
import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AdminValidator.class)
public @interface ValidateIsAdmin {
	public String message() default "invalid admin type. It should be 0 for no and 1 for yes";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
