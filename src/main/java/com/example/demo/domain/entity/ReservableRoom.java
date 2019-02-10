package com.example.demo.domain.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ReservableRoomListener.class)
@Table(name = "reservable_room")
public class ReservableRoom {

    /** */
    @Column(name = "reserved_date")
    LocalDate reservedDate;

    /** */
    @Column(name = "room_id")
    Integer roomId;

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
}