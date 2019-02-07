package com.example.demo.annotation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.example.demo.annotation.Phone;

public class PhoneValidator implements ConstraintValidator<Phone, String>{

	@Override
	public void initialize(Phone phone) {

	}

	@Override
	public boolean isValid(String input, ConstraintValidatorContext cxt) {

		if (StringUtils.isEmpty(input)) {
			return false;
		}

		return input.matches("[0-9()-]*");

	}

}
