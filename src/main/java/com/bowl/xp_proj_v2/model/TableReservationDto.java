package com.bowl.xp_proj_v2.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class TableReservationDto {

    public String date;
    public String time;
    public String name;
    public int numberOfPeople;
    public String email;

    public String   getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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

    public TableReservationDto(String date, String time, String name, int numberOfPeople, String email) {
        this.date = date;
        this.time = time;
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.email = email;
    }
}
