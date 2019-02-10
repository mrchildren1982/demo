package com.example.demo.domain.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 * pairingsテーブル
 */
@Entity(listener = PairingsListener.class)
@Table(name = "pairings")
public class Pairings {

    /** ID */
    @Column(name = "id")
    Integer id;

    /** キックオフ日時 */
    @Column(name = "kickoff")
    LocalDate kickoff;

    /** 対戦国1 */
    @Column(name = "my_country_id")
    Integer myCountryId;

    /** 対戦国2 */
    @Column(name = "enemy_country_id")
    Integer enemyCountryId;

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
     * Returns the kickoff.
     * 
     * @return the kickoff
     */
    public LocalDate getKickoff() {
        return kickoff;
    }

    /** 
     * Sets the kickoff.
     * 
     * @param kickoff the kickoff
     */
    public void setKickoff(LocalDate kickoff) {
        this.kickoff = kickoff;
    }

    /** 
     * Returns the myCountryId.
     * 
     * @return the myCountryId
     */
    public Integer getMyCountryId() {
        return myCountryId;
    }

    /** 
     * Sets the myCountryId.
     * 
     * @param myCountryId the myCountryId
     */
    public void setMyCountryId(Integer myCountryId) {
        this.myCountryId = myCountryId;
    }

    /** 
     * Returns the enemyCountryId.
     * 
     * @return the enemyCountryId
     */
    public Integer getEnemyCountryId() {
        return enemyCountryId;
    }

    /** 
     * Sets the enemyCountryId.
     * 
     * @param enemyCountryId the enemyCountryId
     */
    public void setEnemyCountryId(Integer enemyCountryId) {
        this.enemyCountryId = enemyCountryId;
    }
}