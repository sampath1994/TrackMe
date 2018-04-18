package com.trackme.dto;

import java.io.Serializable;

/**
 * Created by promod on 4/18/2018.
 */
public class UserDTO implements Serializable{


    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String telephone;

    public UserDTO()
    {}

    public UserDTO(String userName, String password, String firstName, String lastName, String telephone) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
