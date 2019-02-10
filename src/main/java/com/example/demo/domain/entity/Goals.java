package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = GoalsListener.class)
@Table(name = "goals")
public class Goals {

    /** ID */
    @Column(name = "id")
    Integer id;

    /** 対戦国ID */
    @Column(name = "pairing_id")
    Integer pairingId;

    /** 選手ID */
    @Column(name = "player_in")
    Integer playerIn;

    /** ゴール時間 */
    @Column(name = "goal_time")
    String goalTime;

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
     * Returns the pairingId.
     * 
     * @return the pairingId
     */
    public Integer getPairingId() {
        return pairingId;
    }

    /** 
     * Sets the pairingId.
     * 
     * @param pairingId the pairingId
     */
    public void setPairingId(Integer pairingId) {
        this.pairingId = pairingId;
    }

    /** 
     * Returns the playerIn.
     * 
     * @return the playerIn
     */
    public Integer getPlayerIn() {
        return playerIn;
    }

    /** 
     * Sets the playerIn.
     * 
     * @param playerIn the playerIn
     */
    public void setPlayerIn(Integer playerIn) {
        this.playerIn = playerIn;
    }

    /** 
     * Returns the goalTime.
     * 
     * @return the goalTime
     */
    public String getGoalTime() {
        return goalTime;
    }

    /** 
     * Sets the goalTime.
     * 
     * @param goalTime the goalTime
     */
    public void setGoalTime(String goalTime) {
        this.goalTime = goalTime;
    }
}