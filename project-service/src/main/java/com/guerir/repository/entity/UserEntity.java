package com.project.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
@Entity(
        name = "USERS")
public class UserEntity {
    @Id
    @GeneratedValue(
            generator = "USERS_KEY_SEQ",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "USERS_KEY_SEQ",
    sequenceName = "USERS_ID_KEY_SEQ",
            allocationSize = 1)
    @Column(
            name = "USER_ID")
    private Long id;

    @Column(
            name = "FIRST_NAME")
    private String firstName;

    @Column(
            name = "LAST_NAME")
    private String lastName;

    @Column(
            name = "USERNAME")
    private String userName;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(final String userName) {
        this.userName = userName;
    }
}