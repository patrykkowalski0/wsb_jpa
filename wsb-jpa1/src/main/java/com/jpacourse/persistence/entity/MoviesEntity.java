package com.jpacourse.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
//@Table(name = "MOVIES")
public class MoviesEntity {
    @Id
    @GeneratedValue
    private long id;


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
