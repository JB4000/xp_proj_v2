package com.bowl.xp_proj_v2.controller;

import com.bowl.xp_proj_v2.service.TableBookingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tablebooking")
public class TableBookingController {

    private final TableBookingService tableBookingService;

    public TableBookingController(TableBookingService tableBookingService) {
        this.tableBookingService = tableBookingService;
    }

    @GetMapping
    public String showTableBookingPage() {
        return "tableBooking";
    }
}