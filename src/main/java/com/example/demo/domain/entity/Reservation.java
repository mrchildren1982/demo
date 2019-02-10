package com.example.demo.domain.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ReservationListener.class)
@Table(name = "reservation")
public class Reservation {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    Integer reservationId;

    /** */
    @Column(name = "start_time")
    LocalTime startTime;

    /** */
    @Column(name = "end_time")
    LocalTime endTime;

    /** */
    @Column(name = "reserved_date")
    LocalDate reservedDate;

    /** */
    @Column(name = "room_id")
    Integer roomId;

    /** */
    @Column(name = "user_id")
    String userId;

    /** 
     * Returns the reservationId.
     * 
     * @return the reservationId
     */
    public Integer getReservationId() {
        return reservationId;
    }

    /** 
     * Sets the reservationId.
     * 
     * @param reservationId the reservationId
     */
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    /** 
     * Returns the startTime.
     * 
     * @return the startTime
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /** 
     * Sets the startTime.
     * 
     * @param startTime the startTime
     */
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    /** 
     * Returns the endTime.
     * 
     * @return the endTime
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    /** 
     * Sets the endTime.
     * 
     * @param endTime the endTime
     */
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    /** 
     * Returns the reservedDate.
     * 
     * @return the reservedDate
     */
    public LocalDate getReservedDate() {
        return reservedDate;
    }

    /** 
     * Sets the reservedDate.
     * 
     * @param reservedDate the reservedDate
     */
    public void setReservedDate(LocalDate reservedDate) {
        this.reservedDate = reservedDate;
    }

    /** 
     * Returns the roomId.
     * 
     * @return the roomId
     */
    public Integer getRoomId() {
        return roomId;
    }

    /** 
     * Sets the roomId.
     * 
     * @param roomId the roomId
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /** 
     * Returns the userId.
     * 
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /** 
     * Sets the userId.
     * 
     * @param userId the userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}