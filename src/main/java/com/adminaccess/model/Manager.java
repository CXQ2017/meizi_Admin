package com.adminaccess.model;

import javax.persistence.*;

/**
 * Created by sunbo on 16/5/26.
 */
@Entity
@Table(name = "manager")
public class Manager {
    @Id
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="password")
    private String password;


    public Manager(){
    }

    public Manager(String name, String password) {
        this.name=name;
        this.password=password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
