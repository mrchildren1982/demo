package com.example.demo.domain.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = HotelroomsListener.class)
@Table(name = "hotelrooms")
public class Hotelrooms {

    /** */
    @Id
    @Column(name = "room_nbr")
    Integer roomNbr;

    /** */
    @Id
    @Column(name = "start_date")
    LocalDate startDate;

    /** */
    @Column(name = "end_date")
    LocalDate endDate;

    /** 
     * Returns the roomNbr.
     * 
     * @return the roomNbr
     */
    public Integer getRoomNbr() {
        return roomNbr;
    }

    /** 
     * Sets the roomNbr.
     * 
     * @param roomNbr the roomNbr
     */
    public void setRoomNbr(Integer roomNbr) {
        this.roomNbr = roomNbr;
    }

    /** 
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}