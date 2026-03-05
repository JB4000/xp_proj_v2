package com.bowl.xp_proj_v2.model;

import java.time.LocalDate;

public class Maintenance {


    private int id;

    private String title;
    private LocalDate date;
    private String description;

    public Maintenance(int id, String title, LocalDate date, String description) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public Maintenance() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
