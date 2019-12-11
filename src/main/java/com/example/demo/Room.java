package com.example.demo;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;

public class Room {
@GeneratedValue
 private int id;
 @NotNull
 private String name;
 @NotNull
 private  int floor;


    public Room(int id, @NotNull String name, @NotNull int floor) {
        this.id = id;
        this.name = name;
        this.floor = floor;
    }
}
