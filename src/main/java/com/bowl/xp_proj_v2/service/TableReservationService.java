package com.bowl.xp_proj_v2.service;


import com.bowl.xp_proj_v2.model.LaneReservation;
import com.bowl.xp_proj_v2.model.LaneReservationDto;
import com.bowl.xp_proj_v2.model.LaneType;
import com.bowl.xp_proj_v2.model.TableReservationDto;
import com.bowl.xp_proj_v2.repository.LaneReservationRepository;
import com.bowl.xp_proj_v2.repository.TableReservationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import com.bowl.xp_proj_v2.model.TableReservation;
import com.bowl.xp_proj_v2.model.TableReservationDto;
import com.bowl.xp_proj_v2.repository.TableReservationRepository;
import org.springframework.stereotype.Service;


@Service
public class TableReservationService {

    public void savetableReservation(TableReservationDto tableReservationDto) {

        TableReservation newTableReservation = new TableReservation(
                LocalDate.parse(tableReservationDto.getDate()),
                LocalTime.parse(tableReservationDto.getTime()),
                tableReservationDto.getName(),
                tableReservationDto.getNumberOfPeople(),
                tableReservationDto.getEmail()
        );

        TableReservationRepository tableReservationRepository = new TableReservationRepository();
        tableReservationRepository.saveTableReservation(newTableReservation);
    }
}