package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = PricebyageListener.class)
@Table(name = "pricebyage")
public class Pricebyage {

    /** */
    @Id
    @Column(name = "product_id")
    String productId;

    /** */
    @Id
    @Column(name = "low_age")
    Integer lowAge;

    /** */
    @Column(name = "high_age")
    Integer highAge;

    /** */
    @Column(name = "price")
    Integer price;

    /** 
     * Returns the productId.
     * 
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /** 
     * Sets the productId.
     * 
     * @param productId the productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /** 
     * Returns the lowAge.
     * 
     * @return the lowAge
     */
    public Integer getLowAge() {
        return lowAge;
    }

    /** 
     * Sets the lowAge.
     * 
     * @param lowAge the lowAge
     */
    public void setLowAge(Integer lowAge) {
        this.lowAge = lowAge;
    }

    /** 
     * Returns the highAge.
     * 
     * @return the highAge
     */
    public Integer getHighAge() {
        return highAge;
    }

    /** 
     * Sets the highAge.
     * 
     * @param highAge the highAge
     */
    public void setHighAge(Integer highAge) {
        this.highAge = highAge;
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