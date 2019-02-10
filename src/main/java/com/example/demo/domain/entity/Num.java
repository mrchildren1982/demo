package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = NumListener.class)
@Table(name = "num")
public class Num {

    /** */
    @Column(name = "number")
    Integer number;

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