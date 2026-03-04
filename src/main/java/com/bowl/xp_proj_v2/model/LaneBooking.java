package com.bowl.xp_proj_v2.model;

public class LaneBooking {

    private Long id;
    private String customerName;
    private int laneNumber;

    public LaneBooking() {
    }

    public LaneBooking(Long id, String customerName, int laneNumber) {
        this.id = id;
        this.customerName = customerName;
        this.laneNumber = laneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getLaneNumber() {
        return laneNumber;
    }

    public void setLaneNumber(int laneNumber) {
        this.laneNumber = laneNumber;
    }
}