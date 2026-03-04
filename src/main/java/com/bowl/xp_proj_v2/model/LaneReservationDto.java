package com.bowl.xp_proj_v2.model;

public class LaneReservationDto {

    private String type;
    private String date;
    private String time;
    private String lanes;
    private String name;
    private String tel;
    private String email;
    private String note;

    public LaneReservationDto(String type, String date, String time, String lanes, String name, String tel, String email, String note) {
        this.type = type;
        this.date = date;
        this.time = time;
        this.lanes = lanes;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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
}
