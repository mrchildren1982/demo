package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ShopsListener.class)
@Table(name = "shops")
public class Shops {

    /** */
    @Id
    @Column(name = "co_cd")
    String coCd;

    /** */
    @Id
    @Column(name = "shop_id")
    String shopId;

    /** */
    @Column(name = "emp_nbr")
    Integer empNbr;

    /** */
    @Column(name = "main_flg")
    String mainFlg;

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
     * Returns the shopId.
     * 
     * @return the shopId
     */
    public String getShopId() {
        return shopId;
    }

    /** 
     * Sets the shopId.
     * 
     * @param shopId the shopId
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    /** 
     * Returns the empNbr.
     * 
     * @return the empNbr
     */
    public Integer getEmpNbr() {
        return empNbr;
    }

    /** 
     * Sets the empNbr.
     * 
     * @param empNbr the empNbr
     */
    public void setEmpNbr(Integer empNbr) {
        this.empNbr = empNbr;
    }

    /** 
     * Returns the mainFlg.
     * 
     * @return the mainFlg
     */
    public String getMainFlg() {
        return mainFlg;
    }

    /** 
     * Sets the mainFlg.
     * 
     * @param mainFlg the mainFlg
     */
    public void setMainFlg(String mainFlg) {
        this.mainFlg = mainFlg;
    }
}