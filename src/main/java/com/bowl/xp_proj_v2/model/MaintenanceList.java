package com.bowl.xp_proj_v2.model;

public class MaintenanceList {

    private String title;
    private String date;
    private String description;

    public MaintenanceList(String titel, String date, String description) {
        this.title = titel;
        this.date = date;
        this.description = description;
    }

    public String getTitel() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

}