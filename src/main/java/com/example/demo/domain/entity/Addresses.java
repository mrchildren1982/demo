package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = AddressesListener.class)
@Table(name = "addresses")
public class Addresses {

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "family_id")
    String familyId;

    /** */
    @Column(name = "address")
    String address;

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
     * Returns the familyId.
     * 
     * @return the familyId
     */
    public String getFamilyId() {
        return familyId;
    }

    /** 
     * Sets the familyId.
     * 
     * @param familyId the familyId
     */
    public void setFamilyId(String familyId) {
        this.familyId = familyId;
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
}