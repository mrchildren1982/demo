package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = CustomersListener.class)
@Table(name = "customers")
public class Customers {

    /** */
    @Id
    @Column(name = "custno")
    String custno;

    /** */
    @Column(name = "cname")
    String cname;

    /** */
    @Column(name = "address")
    String address;

    /** */
    @Column(name = "phone")
    String phone;

    /** */
    @Column(name = "credit_rating")
    String creditRating;

    /** 
     * Returns the custno.
     * 
     * @return the custno
     */
    public String getCustno() {
        return custno;
    }

    /** 
     * Sets the custno.
     * 
     * @param custno the custno
     */
    public void setCustno(String custno) {
        this.custno = custno;
    }

    /** 
     * Returns the cname.
     * 
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /** 
     * Sets the cname.
     * 
     * @param cname the cname
     */
    public void setCname(String cname) {
        this.cname = cname;
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

    /** 
     * Returns the phone.
     * 
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Sets the phone.
     * 
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Returns the creditRating.
     * 
     * @return the creditRating
     */
    public String getCreditRating() {
        return creditRating;
    }

    /** 
     * Sets the creditRating.
     * 
     * @param creditRating the creditRating
     */
    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }
}