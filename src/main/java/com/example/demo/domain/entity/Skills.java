package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = SkillsListener.class)
@Table(name = "skills")
public class Skills {

    /** */
    @Column(name = "skill")
    String skill;

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