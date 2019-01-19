package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dto.BexankShainDto;
import com.example.demo.domain.service.BexankShainService;
import com.example.demo.exception.BusinessException;

@RestController
@RequestMapping("/bexankShain")
public class BexankShainController {

	private static final String APPLICATION_JSON = "application/json";

	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(BexankShainController.class);

	@Autowired
	private BexankShainService service;

	@Autowired
	private BexankShainValidator validator;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(validator);
	}

	@GetMapping(value = "{id}", produces = APPLICATION_JSON)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<BexankShainDto> getShain(@PathVariable("id") Long id)
			throws BusinessException {

		BexankShainDto bexankShain = service.getById(id);

		return ResponseEntity.ok(bexankShain);
	}

	@GetMapping(produces = APPLICATION_JSON)
	@ResponseStatus(HttpStatus.OK)
	public List<BexankShainDto> getAllShains() {
		return service.selectAll();
	}

	@PutMapping(produces = APPLICATION_JSON, consumes = APPLICATION_JSON)
	@ResponseStatus(HttpStatus.OK)
	public void update(@Validated @RequestBody BexankShainDto shain) {
		service.updateShain(shain);
	}

	@PostMapping(path = "/insertAll", consumes = APPLICATION_JSON, produces = APPLICATION_JSON)
	@ResponseStatus(HttpStatus.CREATED)
	public void insertShain(@Validated @RequestBody BexankShainDto shain, @RequestParam(value="dummy",required=true) Integer dummy,
			BindingResult result) {

		if (result.hasErrors()) {
			throw new IllegalArgumentException("引数が不正です");
		}
		service.insertShain(shain);
	}

	@PostMapping(consumes = APPLICATION_JSON, produces = APPLICATION_JSON)
	@ResponseStatus(HttpStatus.CREATED)
	public void insertShains(@Validated @RequestBody List<BexankShainDto> shains,
			@RequestParam(value="dummy",required= true) Integer dummy, BindingResult result) {

		if (result.hasErrors()) {
			throw new IllegalArgumentException("引数が不正です");
		}

		service.insertShains(shains);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAllShains() {
		service.deleteAll();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void deleteById(@PathVariable("id") Long id) {
		service.deleteById(id);
	}

	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler({ HttpRequestMethodNotSupportedException.class })
	@ResponseBody
	public Map<String, Object> handleError() {

		Map<String, Object> errMap = new HashMap<>();
		errMap.put("message", "許可されないメソッド");
		errMap.put("status", HttpStatus.METHOD_NOT_ALLOWED);
		return errMap;
	}
}
