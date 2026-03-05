//package com.bowl.xp_proj_v2.repository;
//
//public class MaintenanceRepository {
//
//}

package com.bowl.xp_proj_v2.repository;

import com.bowl.xp_proj_v2.model.Maintenance;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MaintenanceRepository {

    private final List<Maintenance> maintenanceList = new ArrayList<>();

    // Hent alle
    public List<Maintenance> findAll() {
        return new ArrayList<>(maintenanceList);
    }

    // Find efter id
    public Optional<Maintenance> findById(int id) {
        return maintenanceList.stream()
                .filter(m -> m.getId() == id)
                .findFirst();
    }

    // Gem eller opdater
    public void save(Maintenance maintenance) {
        findById(maintenance.getId()).ifPresentOrElse(existing -> {
            existing.setTitle(maintenance.getTitle());
            existing.setDate(maintenance.getDate());
            existing.setDescription(maintenance.getDescription());
        }, () -> maintenanceList.add(maintenance));
    }

    // Slet
    public boolean deleteById(int id) {
        return maintenanceList.removeIf(m -> m.getId() == id);
    }
}