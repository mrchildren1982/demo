package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = CountriesListener.class)
@Table(name = "countries")
public class Countries {

    /** */
    @Column(name = "id")
    Integer id;

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "ranking")
    Integer ranking;

    /** */
    @Column(name = "group_name")
    String groupName;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /** 
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Returns the ranking.
     * 
     * @return the ranking
     */
    public Integer getRanking() {
        return ranking;
    }

    /** 
     * Sets the ranking.
     * 
     * @param ranking the ranking
     */
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    /** 
     * Returns the groupName.
     * 
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /** 
     * Sets the groupName.
     * 
     * @param groupName the groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}