//package com.bowl.xp_proj_v2.controller;
//
//import com.bowl.xp_proj_v2.model.LaneReservationDto;
//import com.bowl.xp_proj_v2.model.Maintenance;
//import com.bowl.xp_proj_v2.service.LaneReservationService;
//import com.bowl.xp_proj_v2.service.MaintenanceService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class MaintenanceController {
//
//    //private final MaintenanceService maintenanceService;
//
//    @PostMapping("/maintenance")
//    public String saveMaintenance(@ModelAttribute Maintenance maintenance){
//        //maintenanceService.saveMaintenance(maintenance);
//        return "maintenance";
//    }
//
//
//
//
////    @PostMapping("/lanes")
////    public String laneReservationSave(@ModelAttribute LaneReservationDto laneReservationDto) {
////        laneReservationService.saveLaneReservation(laneReservationDto);
////        return "redirect:/";
////    }
//
//
//}
package com.bowl.xp_proj_v2.controller;

import com.bowl.xp_proj_v2.model.Maintenance;
import com.bowl.xp_proj_v2.service.MaintenanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/maintenance")
public class MaintenanceController {

    private final MaintenanceService maintenanceService;

    public MaintenanceController(MaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    // GET: hent/vis alle maintenance
    @GetMapping
    public String showMaintenanceList(Model model) {
        List<Maintenance> maintenanceList = maintenanceService.getMaintenanceList();
        model.addAttribute("maintenanceList", maintenanceList);
        return "maintenance"; // Thymeleaf HTML-side: maintenance.html
    }

    // POST: gem ny maintenance
    @PostMapping
    public String addMaintenance(@ModelAttribute Maintenance maintenance) {
        maintenanceService.saveMaintenance(maintenance);
        return "redirect:/maintenance";
    }

    // GET: slet maintenance
    @GetMapping("/delete/{id}")
    public String deleteMaintenance(@PathVariable int id) {
        maintenanceService.deleteMaintenance(id);
        return "redirect:/maintenance";
    }
}