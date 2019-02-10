package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TblBListener.class)
@Table(name = "tbl_b")
public class TblB {

    /** */
    @Column(name = "key")
    String key;

    /** */
    @Column(name = "col_1")
    Integer col1;

    /** */
    @Column(name = "col_2")
    Integer col2;

    /** */
    @Column(name = "col_3")
    Integer col3;

    /** 
     * Returns the key.
     * 
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /** 
     * Sets the key.
     * 
     * @param key the key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /** 
     * Returns the col1.
     * 
     * @return the col1
     */
    public Integer getCol1() {
        return col1;
    }

    /** 
     * Sets the col1.
     * 
     * @param col1 the col1
     */
    public void setCol1(Integer col1) {
        this.col1 = col1;
    }

    /** 
     * Returns the col2.
     * 
     * @return the col2
     */
    public Integer getCol2() {
        return col2;
    }

    /** 
     * Sets the col2.
     * 
     * @param col2 the col2
     */
    public void setCol2(Integer col2) {
        this.col2 = col2;
    }

    /** 
     * Returns the col3.
     * 
     * @return the col3
     */
    public Integer getCol3() {
        return col3;
    }

    /** 
     * Sets the col3.
     * 
     * @param col3 the col3
     */
    public void setCol3(Integer col3) {
        this.col3 = col3;
    }
}