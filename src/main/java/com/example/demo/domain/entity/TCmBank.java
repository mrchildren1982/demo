package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCmBankListener.class)
@Table(name = "t_cm_bank")
public class TCmBank {

    /** */
    @Id
    @Column(name = "bank_code_bank")
    String bankCodeBank;

    /** */
    @Column(name = "bank_full_name1")
    String bankFullName1;

    /** */
    @Column(name = "bank_full_name2")
    String bankFullName2;

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
     * Returns the bankFullName1.
     * 
     * @return the bankFullName1
     */
    public String getBankFullName1() {
        return bankFullName1;
    }

    /** 
     * Sets the bankFullName1.
     * 
     * @param bankFullName1 the bankFullName1
     */
    public void setBankFullName1(String bankFullName1) {
        this.bankFullName1 = bankFullName1;
    }

    /** 
     * Returns the bankFullName2.
     * 
     * @return the bankFullName2
     */
    public String getBankFullName2() {
        return bankFullName2;
    }

    /** 
     * Sets the bankFullName2.
     * 
     * @param bankFullName2 the bankFullName2
     */
    public void setBankFullName2(String bankFullName2) {
        this.bankFullName2 = bankFullName2;
    }
}