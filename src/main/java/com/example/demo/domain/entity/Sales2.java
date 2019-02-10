package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = Sales2Listener.class)
@Table(name = "sales2")
public class Sales2 {

    /** */
    @Id
    @Column(name = "company")
    String company;

    /** */
    @Id
    @Column(name = "year")
    Integer year;

    /** */
    @Column(name = "sale")
    Integer sale;

    /** */
    @Column(name = "var")
    String var;

    /** 
     * Returns the company.
     * 
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /** 
     * Sets the company.
     * 
     * @param company the company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /** 
     * Returns the year.
     * 
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /** 
     * Sets the year.
     * 
     * @param year the year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /** 
     * Returns the sale.
     * 
     * @return the sale
     */
    public Integer getSale() {
        return sale;
    }

    /** 
     * Sets the sale.
     * 
     * @param sale the sale
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /** 
     * Returns the var.
     * 
     * @return the var
     */
    public String getVar() {
        return var;
    }

    /** 
     * Sets the var.
     * 
     * @param var the var
     */
    public void setVar(String var) {
        this.var = var;
    }
}