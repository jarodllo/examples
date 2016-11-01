package com.example.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public final class Expense implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column
    private String description;

    @Column
    private Double value;

    @Column
    private Date date;

    public Expense(String description, Double value) {
        this.description = description;
        this.value = value;
        this.date = new Date();
    }

    public Expense(){

    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }
}
