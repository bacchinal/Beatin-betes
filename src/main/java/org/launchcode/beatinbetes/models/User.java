package org.launchcode.beatinbetes.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity


public class User {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3,max=15)
    private String name;

    @NotNull
    @Size(min=6,max=15)
    private String password;
    private String verify;



    public User() {}

    public User(String name, String password, String verify){
        this.name = name;
        this.password = password;
        this.verify = verify;
    }


    public int getId() {
        return id;
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

    public String getVerify() {
        return verify;
    }

    public void setVerify(String salt) {
        this.verify = salt;
    }
}
