package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = BowlingListener.class)
@Table(name = "bowling")
public class Bowling {

    /** */
    @Id
    @Column(name = "year")
    String year;

    /** */
    @Id
    @Column(name = "month")
    String month;

    /** */
    @Column(name = "syain_id")
    String syainId;

    /** */
    @Id
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "point1")
    Integer point1;

    /** */
    @Column(name = "point2")
    Integer point2;

    /** */
    @Column(name = "point")
    Integer point;

    /** 
     * Returns the year.
     * 
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /** 
     * Sets the year.
     * 
     * @param year the year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /** 
     * Returns the month.
     * 
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /** 
     * Sets the month.
     * 
     * @param month the month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /** 
     * Returns the syainId.
     * 
     * @return the syainId
     */
    public String getSyainId() {
        return syainId;
    }

    /** 
     * Sets the syainId.
     * 
     * @param syainId the syainId
     */
    public void setSyainId(String syainId) {
        this.syainId = syainId;
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
     * Returns the point1.
     * 
     * @return the point1
     */
    public Integer getPoint1() {
        return point1;
    }

    /** 
     * Sets the point1.
     * 
     * @param point1 the point1
     */
    public void setPoint1(Integer point1) {
        this.point1 = point1;
    }

    /** 
     * Returns the point2.
     * 
     * @return the point2
     */
    public Integer getPoint2() {
        return point2;
    }

    /** 
     * Sets the point2.
     * 
     * @param point2 the point2
     */
    public void setPoint2(Integer point2) {
        this.point2 = point2;
    }

    /** 
     * Returns the point.
     * 
     * @return the point
     */
    public Integer getPoint() {
        return point;
    }

    /** 
     * Sets the point.
     * 
     * @param point the point
     */
    public void setPoint(Integer point) {
        this.point = point;
    }
}