package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = PopulationListener.class)
@Table(name = "population")
public class Population {

    /** */
    @Column(name = "prefecture")
    String prefecture;

    /** */
    @Column(name = "sex")
    String sex;

    /** */
    @Column(name = "pop")
    Integer pop;

    /** 
     * Returns the prefecture.
     * 
     * @return the prefecture
     */
    public String getPrefecture() {
        return prefecture;
    }

    /** 
     * Sets the prefecture.
     * 
     * @param prefecture the prefecture
     */
    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    /** 
     * Returns the sex.
     * 
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /** 
     * Sets the sex.
     * 
     * @param sex the sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /** 
     * Returns the pop.
     * 
     * @return the pop
     */
    public Integer getPop() {
        return pop;
    }

    /** 
     * Sets the pop.
     * 
     * @param pop the pop
     */
    public void setPop(Integer pop) {
        this.pop = pop;
    }
}