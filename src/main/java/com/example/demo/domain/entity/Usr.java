package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = UsrListener.class)
@Table(name = "usr")
public class Usr {

    /** */
    @Id
    @Column(name = "user_id")
    String userId;

    /** */
    @Column(name = "first_name")
    String firstName;

    /** */
    @Column(name = "last_name")
    String lastName;

    /** */
    @Column(name = "password")
    String password;

    /** */
    @Column(name = "role_name")
    String roleName;

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

    /** 
     * Returns the firstName.
     * 
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * Sets the firstName.
     * 
     * @param firstName the firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * Returns the lastName.
     * 
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /** 
     * Sets the lastName.
     * 
     * @param lastName the lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** 
     * Returns the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /** 
     * Sets the password.
     * 
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** 
     * Returns the roleName.
     * 
     * @return the roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /** 
     * Sets the roleName.
     * 
     * @param roleName the roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}