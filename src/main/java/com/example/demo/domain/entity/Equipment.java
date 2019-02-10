package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = EquipmentListener.class)
@Table(name = "equipment")
public class Equipment {

    /** */
    @Id
    @Column(name = "equipment_id")
    String equipmentId;

    /** */
    @Id
    @Column(name = "room_id")
    String roomId;

    /** */
    @Column(name = "equipment_name")
    String equipmentName;

    /** */
    @Column(name = "equipment_count")
    Integer equipmentCount;

    /** */
    @Column(name = "equipment_remarks")
    String equipmentRemarks;

    /** 
     * Returns the equipmentId.
     * 
     * @return the equipmentId
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /** 
     * Sets the equipmentId.
     * 
     * @param equipmentId the equipmentId
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

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
     * Returns the equipmentName.
     * 
     * @return the equipmentName
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /** 
     * Sets the equipmentName.
     * 
     * @param equipmentName the equipmentName
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    /** 
     * Returns the equipmentCount.
     * 
     * @return the equipmentCount
     */
    public Integer getEquipmentCount() {
        return equipmentCount;
    }

    /** 
     * Sets the equipmentCount.
     * 
     * @param equipmentCount the equipmentCount
     */
    public void setEquipmentCount(Integer equipmentCount) {
        this.equipmentCount = equipmentCount;
    }

    /** 
     * Returns the equipmentRemarks.
     * 
     * @return the equipmentRemarks
     */
    public String getEquipmentRemarks() {
        return equipmentRemarks;
    }

    /** 
     * Sets the equipmentRemarks.
     * 
     * @param equipmentRemarks the equipmentRemarks
     */
    public void setEquipmentRemarks(String equipmentRemarks) {
        this.equipmentRemarks = equipmentRemarks;
    }
}