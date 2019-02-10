package com.example.demo.domain.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = EmployeesListener.class)
@Table(name = "employees")
public class Employees {

    /** */
    @Column(name = "empno")
    String empno;

    /** */
    @Column(name = "ename")
    String ename;

    /** */
    @Column(name = "yomi")
    String yomi;

    /** */
    @Column(name = "mgr")
    String mgr;

    /** */
    @Column(name = "hiredate")
    LocalDate hiredate;

    /** */
    @Column(name = "sal")
    Integer sal;

    /** */
    @Column(name = "comm")
    Integer comm;

    /** */
    @Column(name = "deptno")
    String deptno;

    /** */
    @Column(name = "job")
    String job;

    /** 
     * Returns the empno.
     * 
     * @return the empno
     */
    public String getEmpno() {
        return empno;
    }

    /** 
     * Sets the empno.
     * 
     * @param empno the empno
     */
    public void setEmpno(String empno) {
        this.empno = empno;
    }

    /** 
     * Returns the ename.
     * 
     * @return the ename
     */
    public String getEname() {
        return ename;
    }

    /** 
     * Sets the ename.
     * 
     * @param ename the ename
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /** 
     * Returns the yomi.
     * 
     * @return the yomi
     */
    public String getYomi() {
        return yomi;
    }

    /** 
     * Sets the yomi.
     * 
     * @param yomi the yomi
     */
    public void setYomi(String yomi) {
        this.yomi = yomi;
    }

    /** 
     * Returns the mgr.
     * 
     * @return the mgr
     */
    public String getMgr() {
        return mgr;
    }

    /** 
     * Sets the mgr.
     * 
     * @param mgr the mgr
     */
    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    /** 
     * Returns the hiredate.
     * 
     * @return the hiredate
     */
    public LocalDate getHiredate() {
        return hiredate;
    }

    /** 
     * Sets the hiredate.
     * 
     * @param hiredate the hiredate
     */
    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    /** 
     * Returns the sal.
     * 
     * @return the sal
     */
    public Integer getSal() {
        return sal;
    }

    /** 
     * Sets the sal.
     * 
     * @param sal the sal
     */
    public void setSal(Integer sal) {
        this.sal = sal;
    }

    /** 
     * Returns the comm.
     * 
     * @return the comm
     */
    public Integer getComm() {
        return comm;
    }

    /** 
     * Sets the comm.
     * 
     * @param comm the comm
     */
    public void setComm(Integer comm) {
        this.comm = comm;
    }

    /** 
     * Returns the deptno.
     * 
     * @return the deptno
     */
    public String getDeptno() {
        return deptno;
    }

    /** 
     * Sets the deptno.
     * 
     * @param deptno the deptno
     */
    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    /** 
     * Returns the job.
     * 
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /** 
     * Sets the job.
     * 
     * @param job the job
     */
    public void setJob(String job) {
        this.job = job;
    }
}