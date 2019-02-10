package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = DepartmentsListener.class)
@Table(name = "departments")
public class Departments {

    /** */
    @Column(name = "deptno")
    String deptno;

    /** */
    @Column(name = "dname")
    String dname;

    /** */
    @Column(name = "loc")
    String loc;

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
     * Returns the loc.
     * 
     * @return the loc
     */
    public String getLoc() {
        return loc;
    }

    /** 
     * Sets the loc.
     * 
     * @param loc the loc
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }
}