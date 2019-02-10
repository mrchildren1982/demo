package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = SalgradesListener.class)
@Table(name = "salgrades")
public class Salgrades {

    /** */
    @Id
    @Column(name = "grade")
    String grade;

    /** */
    @Column(name = "losal")
    Integer losal;

    /** */
    @Column(name = "hisal")
    Integer hisal;

    /** 
     * Returns the grade.
     * 
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /** 
     * Sets the grade.
     * 
     * @param grade the grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /** 
     * Returns the losal.
     * 
     * @return the losal
     */
    public Integer getLosal() {
        return losal;
    }

    /** 
     * Sets the losal.
     * 
     * @param losal the losal
     */
    public void setLosal(Integer losal) {
        this.losal = losal;
    }

    /** 
     * Returns the hisal.
     * 
     * @return the hisal
     */
    public Integer getHisal() {
        return hisal;
    }

    /** 
     * Sets the hisal.
     * 
     * @param hisal the hisal
     */
    public void setHisal(Integer hisal) {
        this.hisal = hisal;
    }
}