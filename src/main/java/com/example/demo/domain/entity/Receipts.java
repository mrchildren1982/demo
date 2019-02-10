package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ReceiptsListener.class)
@Table(name = "receipts")
public class Receipts {

    /** */
    @Id
    @Column(name = "cust_id")
    String custId;

    /** */
    @Id
    @Column(name = "seq")
    Integer seq;

    /** */
    @Column(name = "price")
    Integer price;

    /** 
     * Returns the custId.
     * 
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /** 
     * Sets the custId.
     * 
     * @param custId the custId
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /** 
     * Returns the seq.
     * 
     * @return the seq
     */
    public Integer getSeq() {
        return seq;
    }

    /** 
     * Sets the seq.
     * 
     * @param seq the seq
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
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