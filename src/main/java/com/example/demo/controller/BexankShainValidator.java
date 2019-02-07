package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.domain.dto.BexankShainDto;
import com.example.demo.domain.entity.BexankShain;

@Component
public class BexankShainValidator implements Validator {

	private static final String TOO_LITTLE_EXPERIENCE = "経験が浅すぎます";

	@Override
	public boolean supports(Class<?> clazz) {

		return BexankShainDto.class.isAssignableFrom(clazz) || List.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		if (target instanceof BexankShainDto) {

			BexankShainDto shain = BexankShainDto.class.cast(target);

			if (checkExperience(shain, 5)) {
				errors.rejectValue("experience", TOO_LITTLE_EXPERIENCE);
			}

		} else if (target instanceof List) {

			List<?> list = (List<?>)target;
			for (Object elem : list) {

				if (elem instanceof BexankShain) {

					BexankShainDto shain = BexankShainDto.class.cast(elem);

					if (checkExperience(shain, 5)) {
						errors.reject(TOO_LITTLE_EXPERIENCE);
					}
				}

			}


		}
	}

	/**
	 * 社員の経験年数をチェクする
	 *
	 * @param shain
	 * @return
	 */
	public boolean checkExperience(BexankShainDto shain, int n) {
		return shain.getExperience() < n;
	}

}
