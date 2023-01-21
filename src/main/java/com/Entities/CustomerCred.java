package com.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customercred")
public class CustomerCred {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CustomerCred(){

    }

    @Override
    public String toString() {
        return "CustomerCred{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public CustomerCred(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
