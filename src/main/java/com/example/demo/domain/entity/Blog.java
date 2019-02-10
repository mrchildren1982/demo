package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = BlogListener.class)
@Table(name = "blog")
public class Blog {

    /** */
    @Column(name = "state")
    String state;

    /** */
    @Column(name = "title")
    String title;

    /** */
    @Column(name = "author_name")
    String authorName;

    /** */
    @Column(name = "featured")
    String featured;

    /** 
     * Returns the state.
     * 
     * @return the state
     */
    public String getState() {
        return state;
    }

    /** 
     * Sets the state.
     * 
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /** 
     * Returns the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Sets the title.
     * 
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * Returns the authorName.
     * 
     * @return the authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /** 
     * Sets the authorName.
     * 
     * @param authorName the authorName
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /** 
     * Returns the featured.
     * 
     * @return the featured
     */
    public String getFeatured() {
        return featured;
    }

    /** 
     * Sets the featured.
     * 
     * @param featured the featured
     */
    public void setFeatured(String featured) {
        this.featured = featured;
    }
}