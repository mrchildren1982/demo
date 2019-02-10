package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TeamListener.class)
@Table(name = "team")
public class Team {

    /** */
    @Column(name = "teamname")
    String teamname;

    /** */
    @Column(name = "membername")
    String membername;

    /** 
     * Returns the teamname.
     * 
     * @return the teamname
     */
    public String getTeamname() {
        return teamname;
    }

    /** 
     * Sets the teamname.
     * 
     * @param teamname the teamname
     */
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    /** 
     * Returns the membername.
     * 
     * @return the membername
     */
    public String getMembername() {
        return membername;
    }

    /** 
     * Sets the membername.
     * 
     * @param membername the membername
     */
    public void setMembername(String membername) {
        this.membername = membername;
    }
}