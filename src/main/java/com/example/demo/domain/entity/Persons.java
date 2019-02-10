package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = PersonsListener.class)
@Table(name = "persons")
public class Persons {

    /** */
    @Id
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "age")
    Integer age;

    /** */
    @Column(name = "height")
    Double height;

    /** */
    @Column(name = "weight")
    Double weight;

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
     * Returns the height.
     * 
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /** 
     * Sets the height.
     * 
     * @param height the height
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /** 
     * Returns the weight.
     * 
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /** 
     * Sets the weight.
     * 
     * @param weight the weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }
}