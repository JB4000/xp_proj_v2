package com.bowl.xp_proj_v2.controller;

import com.bowl.xp_proj_v2.model.LaneReservationDto;
import com.bowl.xp_proj_v2.service.LaneReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LaneReservationController {


    private final LaneReservationService laneReservationService;

    public LaneReservationController(LaneReservationService laneReservationService) {
        this.laneReservationService = laneReservationService;
    }


    @GetMapping("/")
    public String showStartPage(Model model) {

        model.addAttribute("reservations", laneReservationService.getAllReservationsSorted());
        return "index";
    }

    @GetMapping("/lanes")
    public String showLaneBookingForm() {
        return "bookbane";
    }



    @PostMapping("/lanes")
    public String laneReservationSave(@ModelAttribute LaneReservationDto laneReservationDto) {
        laneReservationService.saveLaneReservation(laneReservationDto);
        return "redirect:/";
    }

}

