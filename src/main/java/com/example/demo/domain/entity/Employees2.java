package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = Employees2Listener.class)
@Table(name = "employees2")
public class Employees2 {

    /** */
    @Id
    @Column(name = "emp_id")
    String empId;

    /** */
    @Column(name = "emp_name")
    String empName;

    /** */
    @Column(name = "dept_id")
    String deptId;

    /** 
     * Returns the empId.
     * 
     * @return the empId
     */
    public String getEmpId() {
        return empId;
    }

    /** 
     * Sets the empId.
     * 
     * @param empId the empId
     */
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    /** 
     * Returns the empName.
     * 
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /** 
     * Sets the empName.
     * 
     * @param empName the empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /** 
     * Returns the deptId.
     * 
     * @return the deptId
     */
    public String getDeptId() {
        return deptId;
    }

    /** 
     * Sets the deptId.
     * 
     * @param deptId the deptId
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}