package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = PoptblListener.class)
@Table(name = "poptbl")
public class Poptbl {

    /** */
    @Column(name = "pref_name")
    String prefName;

    /** */
    @Column(name = "population")
    Integer population;

    /** 
     * Returns the prefName.
     * 
     * @return the prefName
     */
    public String getPrefName() {
        return prefName;
    }

    /** 
     * Sets the prefName.
     * 
     * @param prefName the prefName
     */
    public void setPrefName(String prefName) {
        this.prefName = prefName;
    }

    /** 
     * Returns the population.
     * 
     * @return the population
     */
    public Integer getPopulation() {
        return population;
    }

    /** 
     * Sets the population.
     * 
     * @param population the population
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }
}