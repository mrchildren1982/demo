package com.example.demo.domain.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.entity.Customer;

@Dao
@ConfigAutowireable
public interface CustomerRepository {

	@Select
	List<Customer> selectAll();

	@Select
	List<Customer> selectByCustomer(CustomerDto customer);

	@Select
	Optional<Customer> selectById(String id);


	@Select
	List<Customer> selectLikeName(String name);

}
