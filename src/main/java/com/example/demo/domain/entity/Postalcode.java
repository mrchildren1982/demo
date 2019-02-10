package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = PostalcodeListener.class)
@Table(name = "postalcode")
public class Postalcode {

    /** */
    @Id
    @Column(name = "pcode")
    String pcode;

    /** */
    @Column(name = "district_name")
    String districtName;

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
     * Returns the districtName.
     * 
     * @return the districtName
     */
    public String getDistrictName() {
        return districtName;
    }

    /** 
     * Sets the districtName.
     * 
     * @param districtName the districtName
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}