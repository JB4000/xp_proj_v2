package com.bowl.xp_proj_v2.controller;

import com.bowl.xp_proj_v2.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ReservationController {


    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @GetMapping("/")
    public String showStartPage(Model model) {

        model.addAttribute("reservations", reservationService.getAllReservationsSorted());
        return "index";
    }

}

