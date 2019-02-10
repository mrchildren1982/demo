package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = PostalhistoryListener.class)
@Table(name = "postalhistory")
public class Postalhistory {

    /** */
    @Id
    @Column(name = "name")
    String name;

    /** */
    @Id
    @Column(name = "pcode")
    String pcode;

    /** */
    @Column(name = "new_pcode")
    String newPcode;

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
     * Returns the pcode.
     * 
     * @return the pcode
     */
    public String getPcode() {
        return pcode;
    }

    /** 
     * Sets the pcode.
     * 
     * @param pcode the pcode
     */
    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    /** 
     * Returns the newPcode.
     * 
     * @return the newPcode
     */
    public String getNewPcode() {
        return newPcode;
    }

    /** 
     * Sets the newPcode.
     * 
     * @param newPcode the newPcode
     */
    public void setNewPcode(String newPcode) {
        this.newPcode = newPcode;
    }
}