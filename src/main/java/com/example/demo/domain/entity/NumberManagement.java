package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = NumberManagementListener.class)
@Table(name = "number_management")
public class NumberManagement {

    /** */
    @Column(name = "id")
    String id;

    /** */
    @Column(name = "number")
    Integer number;

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