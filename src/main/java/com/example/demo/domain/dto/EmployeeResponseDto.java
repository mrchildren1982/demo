package com.example.demo.domain.dto;

public class EmployeeResponseDto {

	String code;

	String message;

	EmployeeAndDepartmentDto employeeAndDepartment;

	public String getCode() {

		return this.code;

	}

	public void setCode(String code) {
		this.code = code;

	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeAndDepartmentDto getEmployeeAndDepartment() {
		return this.employeeAndDepartment;
	}

	public void setEmployeeAndDepartment(EmployeeAndDepartmentDto dto) {

		this.employeeAndDepartment = dto;
	}
}
