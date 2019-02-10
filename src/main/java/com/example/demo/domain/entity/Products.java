package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ProductsListener.class)
@Table(name = "products")
public class Products {

    /** */
    @Id
    @Column(name = "prodno")
    String prodno;

    /** */
    @Column(name = "pname")
    String pname;

    /** */
    @Column(name = "price")
    Integer price;

    /** 
     * Returns the prodno.
     * 
     * @return the prodno
     */
    public String getProdno() {
        return prodno;
    }

    /** 
     * Sets the prodno.
     * 
     * @param prodno the prodno
     */
    public void setProdno(String prodno) {
        this.prodno = prodno;
    }

    /** 
     * Returns the pname.
     * 
     * @return the pname
     */
    public String getPname() {
        return pname;
    }

    /** 
     * Sets the pname.
     * 
     * @param pname the pname
     */
    public void setPname(String pname) {
        this.pname = pname;
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