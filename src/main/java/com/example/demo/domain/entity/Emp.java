package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = EmpListener.class)
@Table(name = "emp")
public class Emp {

    /** */
    @Id
    @Column(name = "empno")
    String empno;

    /** */
    @Column(name = "ename")
    String ename;

    /** */
    @Column(name = "mgr")
    String mgr;

    /** */
    @Column(name = "deptno")
    String deptno;

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
}