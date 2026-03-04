package com.bowl.xp_proj_v2.controller;

import com.bowl.xp_proj_v2.service.LaneBookingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LaneBookingController {


    private final LaneBookingService service;

    public LaneBookingController(LaneBookingService service) {
        this.service = service;
    }

    @GetMapping("/lanes")
    public String showLaneBookingForm() {
        return "bookbane";
    }




}
