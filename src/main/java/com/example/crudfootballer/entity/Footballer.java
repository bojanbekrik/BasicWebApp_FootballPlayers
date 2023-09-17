package com.example.crudfootballer.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Footballer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    private int ranking;
    private int rating;

    public Footballer(int id, String fullName, int ranking, int rating) {
        this.id = id;
        this.fullName = fullName;
        this.ranking = ranking;
        this.rating = rating;
    }

    public Footballer() {
    }
}
