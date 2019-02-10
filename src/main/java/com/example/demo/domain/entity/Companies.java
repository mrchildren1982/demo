package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = CompaniesListener.class)
@Table(name = "companies")
public class Companies {

    /** */
    @Id
    @Column(name = "co_cd")
    String coCd;

    /** */
    @Column(name = "district")
    String district;

    /** 
     * Returns the coCd.
     * 
     * @return the coCd
     */
    public String getCoCd() {
        return coCd;
    }

    /** 
     * Sets the coCd.
     * 
     * @param coCd the coCd
     */
    public void setCoCd(String coCd) {
        this.coCd = coCd;
    }

    /** 
     * Returns the district.
     * 
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /** 
     * Sets the district.
     * 
     * @param district the district
     */
    public void setDistrict(String district) {
        this.district = district;
    }
}