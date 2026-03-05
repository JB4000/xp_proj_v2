package com.bowl.xp_proj_v2.controller;//package com.bowl.xp_proj_v2.controller;
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


import com.bowl.xp_proj_v2.model.Maintenance;
import com.bowl.xp_proj_v2.model.MaintenanceList;
import com.bowl.xp_proj_v2.service.MaintenanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MaintenanceController {

    private final MaintenanceService maintenanceService;

    public MaintenanceController(MaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    @GetMapping("/maintenance")
    public String showMaintenanceForm() {
        return "maintenance";
    }

    @PostMapping("/maintenance")
    public String addMaintenanceItem(
            @RequestParam String title,
            @RequestParam String date,
            @RequestParam String description
    ) {
        MaintenanceList item = new MaintenanceList(title, date, description);
        maintenanceService.addItem(item);

        return "redirect:/maintenancelist";
    }
}