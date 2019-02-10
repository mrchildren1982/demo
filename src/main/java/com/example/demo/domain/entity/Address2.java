package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = Address2Listener.class)
@Table(name = "address2")
public class Address2 {

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "phone_nbr")
    String phoneNbr;

    /** */
    @Column(name = "address")
    String address;

    /** */
    @Column(name = "sex")
    String sex;

    /** */
    @Column(name = "age")
    Integer age;

    /** 
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Returns the phoneNbr.
     * 
     * @return the phoneNbr
     */
    public String getPhoneNbr() {
        return phoneNbr;
    }

    /** 
     * Sets the phoneNbr.
     * 
     * @param phoneNbr the phoneNbr
     */
    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    /** 
     * Returns the address.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /** 
     * Sets the address.
     * 
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** 
     * Returns the sex.
     * 
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /** 
     * Sets the sex.
     * 
     * @param sex the sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /** 
     * Returns the age.
     * 
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /** 
     * Sets the age.
     * 
     * @param age the age
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}