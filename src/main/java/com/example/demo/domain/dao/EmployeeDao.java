package com.example.demo.domain.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.entity.Employee;

@Dao
@ConfigAutowireable
public interface EmployeeDao {

	@Select
	List<Employee> selectAll();

	@Select
	Optional<Employee> selectById(Integer id);

	@Select
	Optional<Employee> selectOne(Integer employeeId);
	@Insert
	int insert(Employee employee);

	@Update
	int update(Employee employee);

	@Delete(sqlFile = true)
	int deleteById(Integer employeeId);



}
