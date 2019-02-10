package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = DeptListener.class)
@Table(name = "dept")
public class Dept {

    /** */
    @Id
    @Column(name = "deptno")
    String deptno;

    /** */
    @Column(name = "dname")
    String dname;

    /** */
    @Column(name = "mgr")
    String mgr;

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
     * Returns the dname.
     * 
     * @return the dname
     */
    public String getDname() {
        return dname;
    }

    /** 
     * Sets the dname.
     * 
     * @param dname the dname
     */
    public void setDname(String dname) {
        this.dname = dname;
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
}