package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = MeetingsListener.class)
@Table(name = "meetings")
public class Meetings {

    /** */
    @Column(name = "meeting")
    String meeting;

    /** */
    @Column(name = "person")
    String person;

    /** 
     * Returns the meeting.
     * 
     * @return the meeting
     */
    public String getMeeting() {
        return meeting;
    }

    /** 
     * Sets the meeting.
     * 
     * @param meeting the meeting
     */
    public void setMeeting(String meeting) {
        this.meeting = meeting;
    }

    /** 
     * Returns the person.
     * 
     * @return the person
     */
    public String getPerson() {
        return person;
    }

    /** 
     * Sets the person.
     * 
     * @param person the person
     */
    public void setPerson(String person) {
        this.person = person;
    }
}