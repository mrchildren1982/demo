package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dto.EmployeeAndDepartmentDto;
import com.example.demo.domain.service.EmployeeService;
import com.example.demo.exception.BusinessException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	/** ロガー */
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private MessageSource messageSource;

	/** Employeeテーブルサービス */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * 従業員情報全件取得メソッド
	 
	 * @return
	 * @throws NoSuchMessageException
	 * @throws BusinessException
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<EmployeeAndDepartmentDto>> getAll() throws NoSuchMessageException, BusinessException {

		List<EmployeeAndDepartmentDto> employeeAndDepartment = employeeService.getAll();

		return ResponseEntity.ok(employeeAndDepartment);

	}



}
