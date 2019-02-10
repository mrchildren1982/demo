package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = SeqtblListener.class)
@Table(name = "seqtbl")
public class Seqtbl {

    /** */
    @Column(name = "seq")
    Integer seq;

    /** */
    @Column(name = "name")
    String name;

    /** 
     * Returns the seq.
     * 
     * @return the seq
     */
    public Integer getSeq() {
        return seq;
    }

    /** 
     * Sets the seq.
     * 
     * @param seq the seq
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

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
}