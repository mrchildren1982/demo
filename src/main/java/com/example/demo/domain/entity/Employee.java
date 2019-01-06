package com.example.demo.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

	/** 氏名 */
	@Id
	@Column(name = "id")
	private Integer id;

	/** 氏名 */
	@Column(name = "name")
	private String name;
	/** 年齢*/
	@Column(name = "age")
	private Integer age;

	/** 給料 */
	@Column(name = "salary")
	private Integer salary;

	/** 職種 */
	@Column(name = "jobType")
	private String jobType;

	/** 雇用日 */
	@Column(name = "hiredate")
	private LocalDateTime hiredate;

	/** 部署ID*/
	@Column(name = "departmentId")
	private Integer departmentId;

	/** バージョン情報 */
	@Column(name = "version")
	@Version
	private Long version;

	/** 登録日時 */
	@Column(name = "insertTimeStamp")
	private LocalDateTime insertTimeStamp;

	/** 更新日時 */
	@Column(name = "updateTimeStamp")
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
	 * @return version
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * @param version セットする version
	 */
	public void setVersion(Long version) {
		this.version = version;
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
