package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = DigitsListener.class)
@Table(name = "digits")
public class Digits {

    /** */
    @Column(name = "digit")
    Integer digit;

    /** 
     * Returns the digit.
     * 
     * @return the digit
     */
    public Integer getDigit() {
        return digit;
    }

    /** 
     * Sets the digit.
     * 
     * @param digit the digit
     */
    public void setDigit(Integer digit) {
        this.digit = digit;
    }
}