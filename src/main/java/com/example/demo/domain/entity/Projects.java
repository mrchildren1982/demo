package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ProjectsListener.class)
@Table(name = "projects")
public class Projects {

    /** */
    @Column(name = "project_id")
    String projectId;

    /** */
    @Column(name = "step_nbr")
    String stepNbr;

    /** */
    @Column(name = "status")
    String status;

    /** 
     * Returns the projectId.
     * 
     * @return the projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /** 
     * Sets the projectId.
     * 
     * @param projectId the projectId
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /** 
     * Returns the stepNbr.
     * 
     * @return the stepNbr
     */
    public String getStepNbr() {
        return stepNbr;
    }

    /** 
     * Sets the stepNbr.
     * 
     * @param stepNbr the stepNbr
     */
    public void setStepNbr(String stepNbr) {
        this.stepNbr = stepNbr;
    }

    /** 
     * Returns the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Sets the status.
     * 
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}