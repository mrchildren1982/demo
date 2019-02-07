package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	public void initBinder(WebDataBinder binder) {


	}

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "customer", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<CustomerDto> getCustomers() {

		return customerService.getCustomers();
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<CustomerDto> getCusomersByResorce(@RequestBody CustomerDto customerDto) {

		return customerService.getCustomersByResource(customerDto);

	}



}
