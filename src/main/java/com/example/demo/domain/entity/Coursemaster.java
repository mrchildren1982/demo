package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = CoursemasterListener.class)
@Table(name = "coursemaster")
public class Coursemaster {

    /** */
    @Id
    @Column(name = "course_id")
    String courseId;

    /** */
    @Column(name = "course_name")
    String courseName;

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

    /** 
     * Returns the courseName.
     * 
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /** 
     * Sets the courseName.
     * 
     * @param courseName the courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}