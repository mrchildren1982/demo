package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ClassAListener.class)
@Table(name = "class_a")
public class ClassA {

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "age")
    Integer age;

    /** */
    @Column(name = "city")
    String city;

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

    /** 
     * Returns the city.
     * 
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /** 
     * Sets the city.
     * 
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }
}