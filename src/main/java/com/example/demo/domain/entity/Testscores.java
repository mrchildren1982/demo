package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = TestscoresListener.class)
@Table(name = "testscores")
public class Testscores {

    /** */
    @Column(name = "student_id")
    String studentId;

    /** */
    @Column(name = "subject")
    String subject;

    /** */
    @Column(name = "score")
    Integer score;

    /** 
     * Returns the studentId.
     * 
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /** 
     * Sets the studentId.
     * 
     * @param studentId the studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /** 
     * Returns the subject.
     * 
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /** 
     * Sets the subject.
     * 
     * @param subject the subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /** 
     * Returns the score.
     * 
     * @return the score
     */
    public Integer getScore() {
        return score;
    }

    /** 
     * Sets the score.
     * 
     * @param score the score
     */
    public void setScore(Integer score) {
        this.score = score;
    }
}