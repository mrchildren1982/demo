package com.example.demo.domain.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = BirthdayListener.class)
@Table(name = "birthday")
public class Birthday {

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "birthday")
    LocalDate birthday;

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
     * Returns the birthday.
     * 
     * @return the birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /** 
     * Sets the birthday.
     * 
     * @param birthday the birthday
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}