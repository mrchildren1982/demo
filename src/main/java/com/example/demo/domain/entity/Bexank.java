package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * ビーサンク
 */
@Entity(listener = BexankListener.class)
@Table(name = "bexank")
public class Bexank {

    /** 社員ID */
    @Id
    @Column(name = "id")
    String id;

    /** 社員名 */
    @Column(name = "name")
    String name;

    /** チーム決め優先度 */
    @Column(name = "priority")
    Integer priority;

    /** 参加フラグ */
    @Column(name = "sanka_flag")
    String sankaFlag;

    /** 新人チームフラグ */
    @Column(name = "sinjin_team_flag")
    String sinjinTeamFlag;

    /** チーム */
    @Column(name = "team")
    String team;

    /** */
    @Column(name = "zaiseki_flag")
    String zaisekiFlag;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(String id) {
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
     * Returns the priority.
     * 
     * @return the priority
     */
    public Integer getPriority() {
        return priority;
    }

    /** 
     * Sets the priority.
     * 
     * @param priority the priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /** 
     * Returns the sankaFlag.
     * 
     * @return the sankaFlag
     */
    public String getSankaFlag() {
        return sankaFlag;
    }

    /** 
     * Sets the sankaFlag.
     * 
     * @param sankaFlag the sankaFlag
     */
    public void setSankaFlag(String sankaFlag) {
        this.sankaFlag = sankaFlag;
    }

    /** 
     * Returns the sinjinTeamFlag.
     * 
     * @return the sinjinTeamFlag
     */
    public String getSinjinTeamFlag() {
        return sinjinTeamFlag;
    }

    /** 
     * Sets the sinjinTeamFlag.
     * 
     * @param sinjinTeamFlag the sinjinTeamFlag
     */
    public void setSinjinTeamFlag(String sinjinTeamFlag) {
        this.sinjinTeamFlag = sinjinTeamFlag;
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
     * Returns the zaisekiFlag.
     * 
     * @return the zaisekiFlag
     */
    public String getZaisekiFlag() {
        return zaisekiFlag;
    }

    /** 
     * Sets the zaisekiFlag.
     * 
     * @param zaisekiFlag the zaisekiFlag
     */
    public void setZaisekiFlag(String zaisekiFlag) {
        this.zaisekiFlag = zaisekiFlag;
    }
}