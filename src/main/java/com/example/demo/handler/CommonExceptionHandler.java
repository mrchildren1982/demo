package com.example.demo.handler;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.exception.DataNotFoundException;



@ControllerAdvice
public class CommonExceptionHandler {

	@Autowired
	private MessageSource messageSource;

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler({ DataNotFoundException.class })
	@ResponseBody
	public Map<String, Object> handleDataNotFoundError() {

		Map<String, Object> errorMap = new HashMap<String, Object>();
		errorMap.put("message",messageSource.getMessage("datanotfoud", new String[] {null},Locale.JAPAN) );
		errorMap.put("status", HttpStatus.BAD_REQUEST);
		return errorMap;
	}
}
