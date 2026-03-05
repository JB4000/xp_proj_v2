//package com.bowl.xp_proj_v2.service;
//
//import com.bowl.xp_proj_v2.model.LaneReservation;
//import com.bowl.xp_proj_v2.model.LaneReservationDto;
//import com.bowl.xp_proj_v2.model.LaneType;
//import com.bowl.xp_proj_v2.model.Maintenance;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
//
//@Service
//public class MaintenanceService {
//
//
//
//
//    public void saveMaintenance(Maintenance maintenance){
//
////        Maintenance newMaintenance = new Maintenance(
////                maintenance.getId().setId(),)
////
////
//
//    }
//}

package com.bowl.xp_proj_v2.service;

import com.bowl.xp_proj_v2.model.Maintenance;
import com.bowl.xp_proj_v2.repository.MaintenanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    public MaintenanceService(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    public List<Maintenance> getMaintenanceList() {
        return maintenanceRepository.findAll();
    }

    public Optional<Maintenance> getMaintenanceById(int id) {
        return maintenanceRepository.findById(id);
    }

    public void saveMaintenance(Maintenance maintenance) {
        maintenanceRepository.save(maintenance);
    }

    public boolean deleteMaintenance(int id) {
        return maintenanceRepository.deleteById(id);
    }
}