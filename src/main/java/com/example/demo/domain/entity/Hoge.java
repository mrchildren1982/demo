package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = HogeListener.class)
@Table(name = "hoge")
public class Hoge {

    /** */
    @Id
    @Column(name = "id")
    Integer id;

    /** */
    @Column(name = "value")
    String value;

    /** */
    @Column(name = "number")
    Integer number;

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
     * Returns the value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Sets the value.
     * 
     * @param value the value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Returns the number.
     * 
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }

    /** 
     * Sets the number.
     * 
     * @param number the number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
}