package com.example.demo.domain.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.dao.CustomerRepository;
import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.entity.Customer;

@Transactional
@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	private static ModelMapper modelMapper = new ModelMapper();

	public List<CustomerDto> getCustomers() {

		List<Customer> customers = customerRepository.selectAll();

		List<CustomerDto> customerDtos = new ArrayList<>();

		customers.stream().forEach(customer -> {
			CustomerDto dto = modelMapper.map(customer, CustomerDto.class);
			customerDtos.add(dto);
		});
		return customerDtos;

	}

	public List<CustomerDto> getCustomersByResource(CustomerDto customerDto) {

		List<Customer> customers = customerRepository.selectByCustomer(customerDto);

		List<CustomerDto> customerDtos = new ArrayList<>();
		customers.stream().forEach(customer -> {
			CustomerDto dto = modelMapper.map(customer, CustomerDto.class);
			customerDtos.add(dto);
		});
		return customerDtos;
	}

}
