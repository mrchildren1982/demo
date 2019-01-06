package com.example.demo.domain.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class EmployeeDto {

	/** 氏名 */
	private Integer id;

	/** 氏名 */
	private String name;
	/** 年齢*/
	private Integer age;

	/** 給料 */
	private Integer salary;

	/** 職種 */
	private String jobType;

	/** 雇用日 */
	private LocalDateTime hiredate;

	/** 部署ID*/
	private Integer departmentId;

	/** 登録日時 */
	private LocalDateTime insertTimeStamp;

	/** 更新日時 */
	private LocalDateTime updateTimeStamp;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return salary
	 */
	public Integer getSalary() {
		return salary;
	}

	/**
	 * @param salary セットする salary
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	/**
	 * @return jobType
	 */
	public String getJobType() {
		return jobType;
	}

	/**
	 * @param jobType セットする jobType
	 */
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	/**
	 * @return hiredate
	 */
	public LocalDateTime getHiredate() {
		return hiredate;
	}

	/**
	 * @param hiredate セットする hiredate
	 */
	public void setHiredate(LocalDateTime hiredate) {
		this.hiredate = hiredate;
	}

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
	 * @return insertTimeStamp
	 */
	public LocalDateTime getInsertTimeStamp() {
		return insertTimeStamp;
	}

	/**
	 * @param insertTimeStamp セットする insertTimeStamp
	 */
	public void setInsertTimeStamp(LocalDateTime insertTimeStamp) {
		this.insertTimeStamp = insertTimeStamp;
	}

	/**
	 * @return updateTimeStamp
	 */
	public LocalDateTime getUpdateTimeStamp() {
		return updateTimeStamp;
	}

	/**
	 * @param updateTimeStamp セットする updateTimeStamp
	 */
	public void setUpdateTimeStamp(LocalDateTime updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}



}
