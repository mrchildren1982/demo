package com.example.demo.domain.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = OpencoursesListener.class)
@Table(name = "opencourses")
public class Opencourses {

    /** */
    @Column(name = "month")
    LocalDate month;

    /** */
    @Column(name = "course_id")
    String courseId;

    /** 
     * Returns the month.
     * 
     * @return the month
     */
    public LocalDate getMonth() {
        return month;
    }

    /** 
     * Sets the month.
     * 
     * @param month the month
     */
    public void setMonth(LocalDate month) {
        this.month = month;
    }

    /** 
     * Returns the courseId.
     * 
     * @return the courseId
     */
    public String getCourseId() {
        return courseId;
    }

    /** 
     * Sets the courseId.
     * 
     * @param courseId the courseId
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}