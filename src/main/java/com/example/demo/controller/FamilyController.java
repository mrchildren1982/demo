package com.example.demo.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dto.FamilyDto;
import com.example.demo.domain.service.FamilyService;
import com.example.demo.exception.BusinessException;

@RestController
@RequestMapping("/family")
public class FamilyController {

	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(FamilyController.class);

	@Autowired
	private MessageSource messageSource;

	@Autowired
	private FamilyService familyService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<FamilyDto>> getFamilyInfo() throws BusinessException{

		List<FamilyDto> familys =familyService.getFamilyData();

		String normalEndMessage = messageSource.getMessage("log.normal.end", new String[] {"FamilyController"}, Locale.JAPAN);
		logger.debug(normalEndMessage);
		return ResponseEntity.ok(familys);
	}

}
