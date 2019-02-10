package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ArraytblListener.class)
@Table(name = "arraytbl")
public class Arraytbl {

    /** */
    @Column(name = "key")
    String key;

    /** */
    @Column(name = "col1")
    Integer col1;

    /** */
    @Column(name = "col2")
    Integer col2;

    /** */
    @Column(name = "col3")
    Integer col3;

    /** */
    @Column(name = "col4")
    Integer col4;

    /** */
    @Column(name = "col5")
    Integer col5;

    /** */
    @Column(name = "col6")
    Integer col6;

    /** */
    @Column(name = "col7")
    Integer col7;

    /** */
    @Column(name = "col8")
    Integer col8;

    /** */
    @Column(name = "col9")
    Integer col9;

    /** */
    @Column(name = "col10")
    Integer col10;

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

    /** 
     * Returns the col4.
     * 
     * @return the col4
     */
    public Integer getCol4() {
        return col4;
    }

    /** 
     * Sets the col4.
     * 
     * @param col4 the col4
     */
    public void setCol4(Integer col4) {
        this.col4 = col4;
    }

    /** 
     * Returns the col5.
     * 
     * @return the col5
     */
    public Integer getCol5() {
        return col5;
    }

    /** 
     * Sets the col5.
     * 
     * @param col5 the col5
     */
    public void setCol5(Integer col5) {
        this.col5 = col5;
    }

    /** 
     * Returns the col6.
     * 
     * @return the col6
     */
    public Integer getCol6() {
        return col6;
    }

    /** 
     * Sets the col6.
     * 
     * @param col6 the col6
     */
    public void setCol6(Integer col6) {
        this.col6 = col6;
    }

    /** 
     * Returns the col7.
     * 
     * @return the col7
     */
    public Integer getCol7() {
        return col7;
    }

    /** 
     * Sets the col7.
     * 
     * @param col7 the col7
     */
    public void setCol7(Integer col7) {
        this.col7 = col7;
    }

    /** 
     * Returns the col8.
     * 
     * @return the col8
     */
    public Integer getCol8() {
        return col8;
    }

    /** 
     * Sets the col8.
     * 
     * @param col8 the col8
     */
    public void setCol8(Integer col8) {
        this.col8 = col8;
    }

    /** 
     * Returns the col9.
     * 
     * @return the col9
     */
    public Integer getCol9() {
        return col9;
    }

    /** 
     * Sets the col9.
     * 
     * @param col9 the col9
     */
    public void setCol9(Integer col9) {
        this.col9 = col9;
    }

    /** 
     * Returns the col10.
     * 
     * @return the col10
     */
    public Integer getCol10() {
        return col10;
    }

    /** 
     * Sets the col10.
     * 
     * @param col10 the col10
     */
    public void setCol10(Integer col10) {
        this.col10 = col10;
    }
}