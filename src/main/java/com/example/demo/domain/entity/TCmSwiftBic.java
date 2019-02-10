package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TCmSwiftBicListener.class)
@Table(name = "t_cm_swift_bic")
public class TCmSwiftBic {

    /** */
    @Id
    @Column(name = "bank_code")
    String bankCode;

    /** */
    @Column(name = "swift_code")
    String swiftCode;

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
     * Returns the swiftCode.
     * 
     * @return the swiftCode
     */
    public String getSwiftCode() {
        return swiftCode;
    }

    /** 
     * Sets the swiftCode.
     * 
     * @param swiftCode the swiftCode
     */
    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }
}