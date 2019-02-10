package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = Products2Listener.class)
@Table(name = "products2")
public class Products2 {

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "price")
    Integer price;

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
     * Returns the price.
     * 
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /** 
     * Sets the price.
     * 
     * @param price the price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}