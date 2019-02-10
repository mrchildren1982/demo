package com.example.demo.domain.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = OrdersListener.class)
@Table(name = "orders")
public class Orders {

    /** */
    @Id
    @Column(name = "ordno")
    String ordno;

    /** */
    @Id
    @Column(name = "custno")
    String custno;

    /** */
    @Column(name = "date_ordered")
    LocalDate dateOrdered;

    /** */
    @Column(name = "date_shipped")
    LocalDate dateShipped;

    /** */
    @Column(name = "salesman_no")
    String salesmanNo;

    /** */
    @Column(name = "payment_type")
    String paymentType;

    /** 
     * Returns the ordno.
     * 
     * @return the ordno
     */
    public String getOrdno() {
        return ordno;
    }

    /** 
     * Sets the ordno.
     * 
     * @param ordno the ordno
     */
    public void setOrdno(String ordno) {
        this.ordno = ordno;
    }

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
     * Returns the dateOrdered.
     * 
     * @return the dateOrdered
     */
    public LocalDate getDateOrdered() {
        return dateOrdered;
    }

    /** 
     * Sets the dateOrdered.
     * 
     * @param dateOrdered the dateOrdered
     */
    public void setDateOrdered(LocalDate dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    /** 
     * Returns the dateShipped.
     * 
     * @return the dateShipped
     */
    public LocalDate getDateShipped() {
        return dateShipped;
    }

    /** 
     * Sets the dateShipped.
     * 
     * @param dateShipped the dateShipped
     */
    public void setDateShipped(LocalDate dateShipped) {
        this.dateShipped = dateShipped;
    }

    /** 
     * Returns the salesmanNo.
     * 
     * @return the salesmanNo
     */
    public String getSalesmanNo() {
        return salesmanNo;
    }

    /** 
     * Sets the salesmanNo.
     * 
     * @param salesmanNo the salesmanNo
     */
    public void setSalesmanNo(String salesmanNo) {
        this.salesmanNo = salesmanNo;
    }

    /** 
     * Returns the paymentType.
     * 
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /** 
     * Sets the paymentType.
     * 
     * @param paymentType the paymentType
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}