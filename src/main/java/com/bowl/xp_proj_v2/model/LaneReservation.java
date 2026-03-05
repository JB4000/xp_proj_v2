package com.bowl.xp_proj_v2.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class LaneReservation {

    private LocalDate date;
    private LocalTime time;
    private String lanes;
    private String name;
    private String phone;
    private String email;
    private String note;
    private LaneType type;

    public LaneReservation(LocalDate date, LocalTime time, String lanes, String name, String phone, String email, String note, LaneType type) {
        this.date = date;
        this.time = time;
        this.lanes = lanes;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.note = note;
        this.type = type;
    }

    public LaneReservation(LocalDate parse, LocalTime parse1, int numberOfPeople, String name, String email) {
    }

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

    public String getLanes() {
        return lanes;
    }

    public void setLanes(String lanes) {
        this.lanes = lanes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LaneType getType() {
        return type;
    }

    public void setType(LaneType type) {
        this.type = type;
    }
}
