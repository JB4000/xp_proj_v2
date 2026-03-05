package com.bowl.xp_proj_v2.controller;

import com.bowl.xp_proj_v2.service.MaintenanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaintenanceListController {

    private final MaintenanceService maintenanceService;

    public MaintenanceListController(MaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    @GetMapping("/maintenancelist")
    public String showMaintenanceList(Model model) {

        model.addAttribute("maintenancelist",
                maintenanceService.getAllItems());

        return "maintenancelist";
    }
}