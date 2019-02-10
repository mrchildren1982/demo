package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = SuppartsListener.class)
@Table(name = "supparts")
public class Supparts {

    /** */
    @Column(name = "sup")
    String sup;

    /** */
    @Column(name = "part")
    String part;

    /** 
     * Returns the sup.
     * 
     * @return the sup
     */
    public String getSup() {
        return sup;
    }

    /** 
     * Sets the sup.
     * 
     * @param sup the sup
     */
    public void setSup(String sup) {
        this.sup = sup;
    }

    /** 
     * Returns the part.
     * 
     * @return the part
     */
    public String getPart() {
        return part;
    }

    /** 
     * Sets the part.
     * 
     * @param part the part
     */
    public void setPart(String part) {
        this.part = part;
    }
}