package com.example.demo.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.dto.EmployeeAndDepartmentDto;
import com.example.demo.domain.entity.Department;
import com.example.demo.domain.entity.Employee;
import com.example.demo.domain.repository.DepartmentRepository;
import com.example.demo.domain.repository.EmployeeRepository;
import com.example.demo.exception.BusinessException;


@Service
@Transactional
public class EmployeeService {

	private static final Logger logger  = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private MessageSource messageSource;

	/** 従業員テーブルリポジトリインタフェース */
	@Autowired
	private EmployeeRepository employeeRepository;


	/** 部署情報テーブル リポジトリインタフェース */
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<EmployeeAndDepartmentDto> getAll() throws NoSuchMessageException, BusinessException {

		//従業員情報全件検索
		List<Employee> employees  = employeeRepository.findAll();
		//データ存在チェック
		if (employees == null || employees.size() == 0) {
			throw new BusinessException( messageSource.getMessage("exception.nodata", new String[] {null}, Locale.JAPAN));
		}

		//部署マスタ検索
		List<Department> departments = departmentRepository.findAll();

		List<EmployeeAndDepartmentDto> retVal = new ArrayList<>();

		for (Employee employee: employees) {

			EmployeeAndDepartmentDto dto = new EmployeeAndDepartmentDto();
			BeanUtils.copyProperties(employee,dto );
			for (Department department : departments) {

				Integer deptIdOfEmp = employee.getDepartmentId();
				Integer deptIdOfDept = department.getId();
				if (deptIdOfEmp  != null && deptIdOfDept != null && deptIdOfEmp.compareTo(deptIdOfDept) == 0) {
					dto.setDepartmentName(department.getName());
				}
			}
			retVal.add(dto);
		}
		return retVal;





	}

}
