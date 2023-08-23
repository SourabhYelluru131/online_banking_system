package com.example.demo.validation;
import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TitleValidator.class)
public @interface ValidateTitle {
	public String message() default "invalid title type. It should be Mr/Mrs/Ms";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}