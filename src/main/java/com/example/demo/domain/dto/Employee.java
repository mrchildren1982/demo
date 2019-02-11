package com.example.demo.domain.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


/**
 */
@Entity
@Table(name = "employee")
public class Employee {

    /** */
	@Id
    @Column(name = "id")
    Integer id;

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "age")
    Integer age;

    /** */
    @Column(name = "salary")
    Integer salary;

    /** */
    @Column(name = "job_type")
    String jobType;

    /** */
    @Column(name = "hiredate")
    LocalDateTime hiredate;

    /** */
    @Column(name = "department_id")
    Integer departmentId;

    /** */
    @Column(name = "version")
    Integer version;

    /** */
    @Column(name = "inserttimestamp")
    LocalDateTime inserttimestamp;

    /** */
    @Column(name = "updatetimestamp")
    LocalDateTime updatetimestamp;

    /** */
    @Column(name = "insert_time_stamp")
    LocalDateTime insertTimeStamp;

    /** */
    @Column(name = "update_time_stamp")
    LocalDateTime updateTimeStamp;

    /**
     * Returns the id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Returns the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age.
     *
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the age.
     *
     * @param age the age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Returns the salary.
     *
     * @return the salary
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * Sets the salary.
     *
     * @param salary the salary
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     * Returns the jobType.
     *
     * @return the jobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the jobType.
     *
     * @param jobType the jobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * Returns the hiredate.
     *
     * @return the hiredate
     */
    public LocalDateTime getHiredate() {
        return hiredate;
    }

    /**
     * Sets the hiredate.
     *
     * @param hiredate the hiredate
     */
    public void setHiredate(LocalDateTime hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * Returns the departmentId.
     *
     * @return the departmentId
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the departmentId.
     *
     * @param departmentId the departmentId
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version the version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * Returns the inserttimestamp.
     *
     * @return the inserttimestamp
     */
    public LocalDateTime getInserttimestamp() {
        return inserttimestamp;
    }

    /**
     * Sets the inserttimestamp.
     *
     * @param inserttimestamp the inserttimestamp
     */
    public void setInserttimestamp(LocalDateTime inserttimestamp) {
        this.inserttimestamp = inserttimestamp;
    }

    /**
     * Returns the updatetimestamp.
     *
     * @return the updatetimestamp
     */
    public LocalDateTime getUpdatetimestamp() {
        return updatetimestamp;
    }

    /**
     * Sets the updatetimestamp.
     *
     * @param updatetimestamp the updatetimestamp
     */
    public void setUpdatetimestamp(LocalDateTime updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    /**
     * Returns the insertTimeStamp.
     *
     * @return the insertTimeStamp
     */
    public LocalDateTime getInsertTimeStamp() {
        return insertTimeStamp;
    }

    /**
     * Sets the insertTimeStamp.
     *
     * @param insertTimeStamp the insertTimeStamp
     */
    public void setInsertTimeStamp(LocalDateTime insertTimeStamp) {
        this.insertTimeStamp = insertTimeStamp;
    }

    /**
     * Returns the updateTimeStamp.
     *
     * @return the updateTimeStamp
     */
    public LocalDateTime getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * Sets the updateTimeStamp.
     *
     * @param updateTimeStamp the updateTimeStamp
     */
    public void setUpdateTimeStamp(LocalDateTime updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }
}