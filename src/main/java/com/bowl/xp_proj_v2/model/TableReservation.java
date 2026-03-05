package com.bowl.xp_proj_v2.model;

import java.time.LocalDate;
import java.time.LocalTime;


public class TableReservation {

public LocalDate date;
public LocalTime time;
public String name;
public int numberOfPeople;
public String email;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TableReservation(LocalDate date, LocalTime time, String name, int numberOfPeople, String email) {
        this.date = date;
        this.time = time;
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.email = email;
    }
    @Override
    public String toString() {
        return "TableReservation{" +
                "date=" + date +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", email='" + email + '\'' +
                '}';
    }
}
