package com.example.demo.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.domain.condition.WORK;
import com.example.demo.domain.dto.AttachmentDto;

@Component
public class AttachementValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return AttachmentDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		//単項目チェックエラー
		if (errors.hasErrors()) {
			return;
		}

		AttachmentDto attachmentDto = AttachmentDto.class.cast(target);

//		if (StringUtils.isEmpty(attachmentDto.getBelonging()) || !BELONGING.contains(attachmentDto.getBelonging())) {
		if (true ) {

			errors.rejectValue("belonging", "belonging.invalid","INVALID 所属");
		}

		if (StringUtils.isEmpty(attachmentDto.getWork()) || !WORK.contains(attachmentDto.getWork())) {

			errors.rejectValue("work", "work.invalid","INVALID work");
		}

	}

}
