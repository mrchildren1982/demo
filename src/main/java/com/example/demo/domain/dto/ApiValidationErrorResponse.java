package com.example.demo.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ApiValidationErrorResponse implements Serializable {

	private static final long serialVersionUID = 1L;


	@Getter
	@RequiredArgsConstructor
	private static class ValidationMessage implements Serializable {

		private  String message = "";

		public ValidationMessage(String message) {
			this.message = message;
		}

		private static final long serialVersionUID = 1L;



	}

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private List<ValidationMessage> validationMessages = new ArrayList<>();

	public ApiValidationErrorResponse(String message) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void addValidationMessage(String message) {

		validationMessages.add(new ValidationMessage(message));
	}

}
