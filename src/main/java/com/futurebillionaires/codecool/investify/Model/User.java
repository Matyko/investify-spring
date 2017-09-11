package com.futurebillionaires.codecool.investify.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.List;

/**
 * Created by flowerpower on 2017. 06. 21..
 */
@Entity(name="Users")
public class User {

    /**
     * @param id  of the User.
     * @param name Username for the user.
     * @param password password for the user.
     * @param email of the user.
     * @param cash the amount of virtual money of the User.
     * @param active will be false if user want to delete the account.
     */


    private final static Logger logger = LoggerFactory.getLogger(User.class);

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;

    public String getUsername() {
        return username;
    }

    private String username;
    private String password;
    private String email;
    private int cash;
    private boolean active;
    @OneToMany
    private List<Investment> investment;
    @OneToMany
    private List<Sharehold> shareholds;

    public User() {}

    public User(String firstName, String lastName, String username, String password, String email) {
        logger.info("Creating User Object | Name: "+firstName + " " + lastName+", password: *****, Email: "+email);

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.cash = 0;
        this.active = true;
    }

    /**
     * Basic getters and setters for the User.
     */

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCash() {
        return cash;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }
}
