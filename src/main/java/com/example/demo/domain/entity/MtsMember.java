package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MtsMemberListener.class)
@Table(name = "mts_member")
public class MtsMember {

    /** */
    @Id
    @Column(name = "id")
    Integer id;

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "team")
    String team;

    /** */
    @Column(name = "sex")
    String sex;

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
     * Returns the team.
     * 
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /** 
     * Sets the team.
     * 
     * @param team the team
     */
    public void setTeam(String team) {
        this.team = team;
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
}