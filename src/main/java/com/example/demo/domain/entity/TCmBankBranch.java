package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCmBankBranchListener.class)
@Table(name = "t_cm_bank_branch")
public class TCmBankBranch {

    /** */
    @Id
    @Column(name = "bank_code")
    String bankCode;

    /** */
    @Column(name = "bank_code_bank")
    String bankCodeBank;

    /** */
    @Column(name = "branch_name")
    String branchName;

    /** */
    @Column(name = "city_name")
    String cityName;

    /** 
     * Returns the bankCode.
     * 
     * @return the bankCode
     */
    public String getBankCode() {
        return bankCode;
    }

    /** 
     * Sets the bankCode.
     * 
     * @param bankCode the bankCode
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /** 
     * Returns the bankCodeBank.
     * 
     * @return the bankCodeBank
     */
    public String getBankCodeBank() {
        return bankCodeBank;
    }

    /** 
     * Sets the bankCodeBank.
     * 
     * @param bankCodeBank the bankCodeBank
     */
    public void setBankCodeBank(String bankCodeBank) {
        this.bankCodeBank = bankCodeBank;
    }

    /** 
     * Returns the branchName.
     * 
     * @return the branchName
     */
    public String getBranchName() {
        return branchName;
    }

    /** 
     * Sets the branchName.
     * 
     * @param branchName the branchName
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /** 
     * Returns the cityName.
     * 
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /** 
     * Sets the cityName.
     * 
     * @param cityName the cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}