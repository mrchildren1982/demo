package com.example.demo.domain.dto;

import lombok.Data;

@Data
public class EmployeeAndDepartmentDto extends EmployeeDto{

	private Integer departmentId;

	private String departmentName;

	/**
	 * @return departmentId
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId セットする departmentId
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName セットする departmentName
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


}
