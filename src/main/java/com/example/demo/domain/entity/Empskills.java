package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = EmpskillsListener.class)
@Table(name = "empskills")
public class Empskills {

    /** */
    @Column(name = "emp")
    String emp;

    /** */
    @Column(name = "skill")
    String skill;

    /** 
     * Returns the emp.
     * 
     * @return the emp
     */
    public String getEmp() {
        return emp;
    }

    /** 
     * Sets the emp.
     * 
     * @param emp the emp
     */
    public void setEmp(String emp) {
        this.emp = emp;
    }

    /** 
     * Returns the skill.
     * 
     * @return the skill
     */
    public String getSkill() {
        return skill;
    }

    /** 
     * Sets the skill.
     * 
     * @param skill the skill
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }
}