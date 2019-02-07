package com.example.demo.controller;

import java.util.Collections;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dto.AttachmentDto;
import com.example.demo.domain.service.AttachmentService;
import com.example.demo.exception.BusinessException;
import com.example.demo.exception.DataNotFoundException;

@RestController
@RequestMapping("/attachment")
public class AttachementController {


	private static final Logger logger = LoggerFactory.getLogger(AttachementController.class);

	@Autowired
	private AttachmentService attachementService;

	@Autowired
	private AttachementValidator attachmentValidator;


	@InitBinder
	public void initBinder(WebDataBinder binder) {

		binder.addValidators(attachmentValidator);
	}

	// @RequestMapping(method = RequestMethod.GET)
//	@GetMapping
//	@ResponseStatus(HttpStatus.OK)
//	public ResponseEntity<List<AttachmentDto>> getAllData() throws BusinessException {
//
//		List<AttachmentDto> response = attachementService.getAllData();
//		return ResponseEntity.ok(response);
//
//	}

	@RequestMapping(method = RequestMethod.GET,value = "{id}")
	public ResponseEntity<AttachmentDto> getById(@Validated @PathVariable(value ="id" , required = true)  String id, BindingResult result) throws BusinessException {

		if(result.hasErrors()) {
			throw new IllegalArgumentException("引数が不正です");
		}


		if (!isNum(id)) {
			throw new IllegalArgumentException("引数が不正です");
		}
		AttachmentDto attachmentDto = attachementService.getById(Integer.valueOf(id));

		return ResponseEntity.ok(attachmentDto);


	}

	@ExceptionHandler(DataNotFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String, String> handleException(DataNotFoundException ex) {

		//戻しコミットします
		logger.warn("handlerException", ex);
		Map<String, String> body = Collections.singletonMap("exeption'reason", "data not found");
		return body;
	}

	private boolean isNum(String target) {

		try {
			Integer.parseInt(target);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
}
