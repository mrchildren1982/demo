package com.example.demo.annotation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.demo.annotation.CustomSize;

public class CustomSizeValidator implements ConstraintValidator<CustomSize, String> {

	private int max;

	@Override
	public void initialize(CustomSize customSize) {

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
