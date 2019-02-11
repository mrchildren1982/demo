package com.example.demo.domain.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 */
@Entity
@Table(name = "shain")
public class Shain {

    /** */
    @Id
    @Column(name = "id")
    Integer id;

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "exp")
    Integer exp;

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
     * Returns the exp.
     *
     * @return the exp
     */
    public Integer getExp() {
        return exp;
    }

    /**
     * Sets the exp.
     *
     * @param exp the exp
     */
    public void setExp(Integer exp) {
        this.exp = exp;
    }
}