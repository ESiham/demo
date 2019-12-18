package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Light {
    // enum Status{ON,OFF};
    private Long id;
    @Id
    // 3.
    @Column(nullable = false)
    private Integer level;

    // 4.
    @NotNull
    @Enumerated(EnumType.STRING) // Mettre le EnumType.String pour donner au sql ability de reconnaitre les string
    private Status status;
    @ManyToOne
    private Room room;

    public Light() {
    }

    public Light(Integer level, Status status, Room room) {
        this.level = level;
        this.status = status;
        this.room = room;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
