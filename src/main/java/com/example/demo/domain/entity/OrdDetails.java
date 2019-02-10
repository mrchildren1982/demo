package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = OrdDetailsListener.class)
@Table(name = "ord_details")
public class OrdDetails {

    /** */
    @Id
    @Column(name = "ordno")
    String ordno;

    /** */
    @Column(name = "prodno")
    String prodno;

    /** */
    @Column(name = "quantity")
    Integer quantity;

    /** 
     * Returns the ordno.
     * 
     * @return the ordno
     */
    public String getOrdno() {
        return ordno;
    }

    /** 
     * Sets the ordno.
     * 
     * @param ordno the ordno
     */
    public void setOrdno(String ordno) {
        this.ordno = ordno;
    }

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
     * Returns the quantity.
     * 
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /** 
     * Sets the quantity.
     * 
     * @param quantity the quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}