package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = RoomListener.class)
@Table(name = "room")
public class Room {

    /** */
    @Id
    @Column(name = "room_id")
    String roomId;

    /** */
    @Column(name = "room_name")
    String roomName;

    /** */
    @Column(name = "capacity")
    Integer capacity;

    /** 
     * Returns the roomId.
     * 
     * @return the roomId
     */
    public String getRoomId() {
        return roomId;
    }

    /** 
     * Sets the roomId.
     * 
     * @param roomId the roomId
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /** 
     * Returns the roomName.
     * 
     * @return the roomName
     */
    public String getRoomName() {
        return roomName;
    }

    /** 
     * Sets the roomName.
     * 
     * @param roomName the roomName
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /** 
     * Returns the capacity.
     * 
     * @return the capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    /** 
     * Sets the capacity.
     * 
     * @param capacity the capacity
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}