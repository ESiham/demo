package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotNull
    private int floor;
    @OneToMany(mappedBy = "room")
    private Set<Light> lights;

    public Room() {
    }

    public Room(int id, @NotNull String name, @NotNull int floor) {
        this.id = id;
        this.name = name;
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFloor() {
        return floor;
    }

    public Set<Light> getLights() {
        return lights;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setLights(Set<Light> lights) {
        this.lights = lights;
    }
}
