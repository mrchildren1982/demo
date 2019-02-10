package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ItemsListener.class)
@Table(name = "items")
public class Items {

    /** */
    @Id
    @Column(name = "item_id")
    String itemId;

    /** */
    @Id
    @Column(name = "year")
    Integer year;

    /** */
    @Column(name = "item_name")
    String itemName;

    /** */
    @Column(name = "price_tax_ex")
    Integer priceTaxEx;

    /** */
    @Column(name = "price_tax_in")
    Integer priceTaxIn;

    /** 
     * Returns the itemId.
     * 
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /** 
     * Sets the itemId.
     * 
     * @param itemId the itemId
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /** 
     * Returns the year.
     * 
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /** 
     * Sets the year.
     * 
     * @param year the year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /** 
     * Returns the itemName.
     * 
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /** 
     * Sets the itemName.
     * 
     * @param itemName the itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /** 
     * Returns the priceTaxEx.
     * 
     * @return the priceTaxEx
     */
    public Integer getPriceTaxEx() {
        return priceTaxEx;
    }

    /** 
     * Sets the priceTaxEx.
     * 
     * @param priceTaxEx the priceTaxEx
     */
    public void setPriceTaxEx(Integer priceTaxEx) {
        this.priceTaxEx = priceTaxEx;
    }

    /** 
     * Returns the priceTaxIn.
     * 
     * @return the priceTaxIn
     */
    public Integer getPriceTaxIn() {
        return priceTaxIn;
    }

    /** 
     * Sets the priceTaxIn.
     * 
     * @param priceTaxIn the priceTaxIn
     */
    public void setPriceTaxIn(Integer priceTaxIn) {
        this.priceTaxIn = priceTaxIn;
    }
}