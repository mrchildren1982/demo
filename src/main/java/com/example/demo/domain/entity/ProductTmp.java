package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ProductTmpListener.class)
@Table(name = "product_tmp")
public class ProductTmp {

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "price")
    Integer price;

    /** */
    @Column(name = "rowid")
    Integer rowid;

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

    /** 
     * Returns the rowid.
     * 
     * @return the rowid
     */
    public Integer getRowid() {
        return rowid;
    }

    /** 
     * Sets the rowid.
     * 
     * @param rowid the rowid
     */
    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }
}