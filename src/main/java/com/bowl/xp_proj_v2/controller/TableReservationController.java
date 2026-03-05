package com.bowl.xp_proj_v2.controller;

import com.bowl.xp_proj_v2.model.TableReservationDto;
import com.bowl.xp_proj_v2.service.TableReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tableBooking")
public class TableReservationController {

    private final TableReservationService tableReservationService;

    public TableReservationController(TableReservationService tableReservationService) {
        this.tableReservationService = tableReservationService;
    }

    @GetMapping
    public String showTableBookingPage() {
        return "tableBooking";
    }

    @PostMapping
    public String tableReservationSave(@ModelAttribute TableReservationDto tableReservationDto) {
        tableReservationService.savetableReservation(tableReservationDto);
        return "redirect:/";
    }
}