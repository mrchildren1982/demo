package com.example.demo.domain.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 * playersテーブル
 */
@Entity(listener = PlayersListener.class)
@Table(name = "players")
public class Players {

    /** ID */
    @Column(name = "id")
    Integer id;

    /** 国テーブルID */
    @Column(name = "country_id")
    Integer countryId;

    /** 背番号 */
    @Column(name = "uniform_num")
    Integer uniformNum;

    /** ポジション */
    @Column(name = "position")
    String position;

    /** 名前 */
    @Column(name = "name")
    String name;

    /** 所属クラブ */
    @Column(name = "club")
    String club;

    /** 誕生日 */
    @Column(name = "birth")
    LocalDate birth;

    /** 身長 */
    @Column(name = "height")
    Integer height;

    /** 体重 */
    @Column(name = "weight")
    Integer weight;

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
     * Returns the countryId.
     * 
     * @return the countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /** 
     * Sets the countryId.
     * 
     * @param countryId the countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /** 
     * Returns the uniformNum.
     * 
     * @return the uniformNum
     */
    public Integer getUniformNum() {
        return uniformNum;
    }

    /** 
     * Sets the uniformNum.
     * 
     * @param uniformNum the uniformNum
     */
    public void setUniformNum(Integer uniformNum) {
        this.uniformNum = uniformNum;
    }

    /** 
     * Returns the position.
     * 
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Sets the position.
     * 
     * @param position the position
     */
    public void setPosition(String position) {
        this.position = position;
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
     * Returns the club.
     * 
     * @return the club
     */
    public String getClub() {
        return club;
    }

    /** 
     * Sets the club.
     * 
     * @param club the club
     */
    public void setClub(String club) {
        this.club = club;
    }

    /** 
     * Returns the birth.
     * 
     * @return the birth
     */
    public LocalDate getBirth() {
        return birth;
    }

    /** 
     * Sets the birth.
     * 
     * @param birth the birth
     */
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    /** 
     * Returns the height.
     * 
     * @return the height
     */
    public Integer getHeight() {
        return height;
    }

    /** 
     * Sets the height.
     * 
     * @param height the height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /** 
     * Returns the weight.
     * 
     * @return the weight
     */
    public Integer getWeight() {
        return weight;
    }

    /** 
     * Sets the weight.
     * 
     * @param weight the weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}