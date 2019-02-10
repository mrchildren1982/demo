package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = NonaggtblListener.class)
@Table(name = "nonaggtbl")
public class Nonaggtbl {

    /** */
    @Column(name = "id")
    String id;

    /** */
    @Column(name = "data_type")
    String dataType;

    /** */
    @Column(name = "data_1")
    Integer data1;

    /** */
    @Column(name = "data_2")
    Integer data2;

    /** */
    @Column(name = "data_3")
    Integer data3;

    /** */
    @Column(name = "data_4")
    Integer data4;

    /** */
    @Column(name = "data_5")
    Integer data5;

    /** */
    @Column(name = "data_6")
    Integer data6;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /** 
     * Returns the dataType.
     * 
     * @return the dataType
     */
    public String getDataType() {
        return dataType;
    }

    /** 
     * Sets the dataType.
     * 
     * @param dataType the dataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /** 
     * Returns the data1.
     * 
     * @return the data1
     */
    public Integer getData1() {
        return data1;
    }

    /** 
     * Sets the data1.
     * 
     * @param data1 the data1
     */
    public void setData1(Integer data1) {
        this.data1 = data1;
    }

    /** 
     * Returns the data2.
     * 
     * @return the data2
     */
    public Integer getData2() {
        return data2;
    }

    /** 
     * Sets the data2.
     * 
     * @param data2 the data2
     */
    public void setData2(Integer data2) {
        this.data2 = data2;
    }

    /** 
     * Returns the data3.
     * 
     * @return the data3
     */
    public Integer getData3() {
        return data3;
    }

    /** 
     * Sets the data3.
     * 
     * @param data3 the data3
     */
    public void setData3(Integer data3) {
        this.data3 = data3;
    }

    /** 
     * Returns the data4.
     * 
     * @return the data4
     */
    public Integer getData4() {
        return data4;
    }

    /** 
     * Sets the data4.
     * 
     * @param data4 the data4
     */
    public void setData4(Integer data4) {
        this.data4 = data4;
    }

    /** 
     * Returns the data5.
     * 
     * @return the data5
     */
    public Integer getData5() {
        return data5;
    }

    /** 
     * Sets the data5.
     * 
     * @param data5 the data5
     */
    public void setData5(Integer data5) {
        this.data5 = data5;
    }

    /** 
     * Returns the data6.
     * 
     * @return the data6
     */
    public Integer getData6() {
        return data6;
    }

    /** 
     * Sets the data6.
     * 
     * @param data6 the data6
     */
    public void setData6(Integer data6) {
        this.data6 = data6;
    }
}