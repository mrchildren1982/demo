package com.example.demo.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dto.EmployeeAndDepartmentDto;
import com.example.demo.domain.dto.EmployeeResponseDto;
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

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addCustomFormatter(new DateFormatter("yyyyMMdd"), "targetDate");

//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//		format.setLenient(false);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, false));

	}

	/**
	 * 従業員情報全件取得メソッド
	 *
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

	/**
	 * 従業員情報 従業員ID検索
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<EmployeeResponseDto> getById(@PathVariable Integer id) throws Exception {

		EmployeeResponseDto employeeAndResponseDto = new EmployeeResponseDto();
		employeeAndResponseDto.setCode(messageSource.getMessage("OK_CODE", null, Locale.JAPAN));
		employeeAndResponseDto.setMessage(messageSource.getMessage("OK_MESSAGE", null, Locale.JAPAN));

		EmployeeAndDepartmentDto employeeAndDepartment = employeeService.getById(id);
		employeeAndResponseDto.setEmployeeAndDepartment(employeeAndDepartment);

		return ResponseEntity.ok(employeeAndResponseDto);

	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<EmployeeResponseDto> insert(@Validated @RequestBody EmployeeAndDepartmentDto employeeADepartmentDto)
			throws Exception {
		EmployeeAndDepartmentDto dto = employeeService.insert(employeeADepartmentDto);
		EmployeeResponseDto employeeAndResponseDto = new EmployeeResponseDto();

		employeeAndResponseDto.setCode(messageSource.getMessage("CREATED_CODE", null, Locale.JAPAN));
		employeeAndResponseDto.setMessage(messageSource.getMessage("CREATED_MESSAGE", null, Locale.JAPAN));
		employeeAndResponseDto.setEmployeeAndDepartment(dto);

		return ResponseEntity.ok(employeeAndResponseDto);

	}

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<EmployeeAndDepartmentDto> updateEmployee(@Validated @RequestBody EmployeeAndDepartmentDto dto ,@RequestParam("version") Long version) {

		EmployeeAndDepartmentDto retVal = employeeService.update(dto, version);
		return ResponseEntity.ok(retVal);


	}

	@RequestMapping(method  = RequestMethod.DELETE, value ="/{employeeId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteEmployee(@PathVariable("employeeId") Integer employeeId) {

	employeeService.deleteEmployee(employeeId);

	}


}
