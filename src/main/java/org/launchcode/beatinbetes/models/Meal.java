package org.launchcode.beatinbetes.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Meal {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    private String carbCount;




    public Meal(String name, String description, String carbCount) {
        this.name = name;
        this.description = description;
    }

    public Meal() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCarbCount() {
        return carbCount;
    }

    public void setCarbCount(String carbCount) {
        this.carbCount = carbCount;
    }
}