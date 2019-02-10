package com.example.demo.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

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
import com.example.demo.exception.InsertFailureException;

@Service
@Transactional
public class EmployeeService {

	/** ロガークラス */
	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	/** メッセージソース */
	@Autowired
	private MessageSource messageSource;

	/** 従業員テーブルリポジトリインタフェース */
	@Autowired
	private EmployeeRepository employeeRepository;

	/** 部署情報テーブル リポジトリインタフェース */
	@Autowired
	private DepartmentRepository departmentRepository;

	/**
	 * 従業員テーブルに存在する全データを取得する
	 *
	 * @return 従業員DTO
	 * @throws NoSuchMessageException
	 * @throws BusinessException
	 *             業務例外
	 */
	public List<EmployeeAndDepartmentDto> getAll() throws NoSuchMessageException, BusinessException {

		// 従業員情報全件検索
		List<Employee> employees = employeeRepository.findAll();
		// データ存在チェック
		if (employees == null || employees.size() == 0) {
			throw new BusinessException(
					// データが存在しません。
					messageSource.getMessage(Messages.getString("EmployeeService.0"), new String[] { null }, //$NON-NLS-1$
							Locale.JAPAN));
		}

		// 部署マスタ全件検索
		List<Department> departments = departmentRepository.findAll();

		List<EmployeeAndDepartmentDto> retVal = new ArrayList<>();

		// 検索結果エンティティ→DTO
		// 従業員テーブルの取得結果のレコードに部署IDに紐付いた部署名を設定する
		for (Employee employee : employees) {

			EmployeeAndDepartmentDto dto = new EmployeeAndDepartmentDto();
			BeanUtils.copyProperties(employee, dto);
			setDepartmentToEmployeeDto(departments, employee, dto);
			retVal.add(dto);
		}
		return retVal;

	}

	/**
	 * 従業員テーブルID検索
	 *
	 * @param id
	 *            従業員テーブル.ID
	 * @return 検索結果DTO
	 * @throws Exception
	 */
	public EmployeeAndDepartmentDto getById(Integer id) throws Exception {

		// 従業員テーブルID検索
		Optional<Employee> employeeOpt = employeeRepository.findById(id);
		// 存在チェック
		if (!employeeOpt.isPresent()) {

			throw new BusinessException(messageSource.getMessage(Messages.getString("EmployeeService.1"), //$NON-NLS-1$
					new String[] { null }, Locale.JAPAN));
		}

		List<Department> departments = departmentRepository.findAll();

		EmployeeAndDepartmentDto dto = new EmployeeAndDepartmentDto();

		BeanUtils.copyProperties(employeeOpt.get(), dto);

		setDepartmentToEmployeeDto(departments, employeeOpt.get(), dto);

		return dto;

	}

	public EmployeeAndDepartmentDto insert(EmployeeAndDepartmentDto dto)
			throws NoSuchMessageException, InsertFailureException {

		// 従業員テーブル
		Employee employee = new Employee();
		BeanUtils.copyProperties(dto, employee);
		employee.setId(dto.getId());
		employee.setVersion(1);

		try {
			// 登録
			employeeRepository.save(employee);

		} catch (Exception e) {
			throw new InsertFailureException(
					messageSource.getMessage(Messages.getString("EmployeeService.2"), null, Locale.JAPAN)); //$NON-NLS-1$
		}

		// 部署マスタ
		Department department = new Department();
		BeanUtils.copyProperties(dto, department);
		department.setId(dto.getDepartmentId());
		department.setVersion(1L);

		try {
			// 登録

			departmentRepository.save(department);

		} catch (Exception e) {

			throw new InsertFailureException(
					messageSource.getMessage(Messages.getString("EmployeeService.3"), null, Locale.JAPAN)); //$NON-NLS-1$
		}

		return dto;

	}

	/**
	 *
	 * @param dto
	 * @param version
	 * @return
	 */
	public EmployeeAndDepartmentDto update(EmployeeAndDepartmentDto dto, int version) {

		Employee employee = new Employee();
		BeanUtils.copyProperties(dto, employee);
		employee.setVersion(version);

		// Optional<Employee> nowRecord = employeeRepository.findById(dto.getId());
		// if (nowRecord.isPresent()) {
		// 更新
		// レポジトリクラスのsaveメソッドはデータがない場合、insert、データが存在するときはupdateする仕様であるため、データの存在チェックは不要
		employeeRepository.save(employee);
		// }

		Department department = new Department();
		BeanUtils.copyProperties(dto, department);
		department.setVersion((long)version);
		departmentRepository.save(department);

		return dto;

	}

	/**
	 * @return
	 * @see org.springframework.data.repository.CrudRepository#count()
	 */
	public long count() {
		return departmentRepository.count();
	}

	/**
	 * @param entity
	 * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Object)
	 */
	public void delete(Department entity) {


		try {

			departmentRepository.delete(entity);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/**
	 * 従業員情報の部署IDをキーに部署マスタの検索結果を照合して、部署名を求め、設定する
	 *
	 * @param departments
	 *            部署マスタ全レコード
	 * @param employee
	 *            従業員テーブルレコード
	 * @param dto
	 *            従業員DTO
	 */
	public void setDepartmentToEmployeeDto(List<Department> departments, Employee employee,
			EmployeeAndDepartmentDto dto) {
		for (Department department : departments) {

			Integer deptIdOfEmp = employee.getDepartmentId();
			Integer deptIdOfDept = department.getId();
			if (deptIdOfEmp != null && deptIdOfDept != null && deptIdOfEmp.compareTo(deptIdOfDept) == 0) {
				dto.setDepartmentName(department.getName());
			}
		}
	}

	public void deleteEmployee(Integer employeeId) {

		Employee employee = employeeRepository.getOne(employeeId);

		employeeRepository.deleteById(employeeId);
		// departmentRepository.deleteById(employee.getDepartmentId());
		// //部署マスタのレコードは削除しない

	}

}
