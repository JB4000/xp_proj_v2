package com.bowl.xp_proj_v2.service;

import com.bowl.xp_proj_v2.model.LaneReservation;
import com.bowl.xp_proj_v2.model.LaneReservationDto;
import com.bowl.xp_proj_v2.model.LaneReservationSortComparator;
import com.bowl.xp_proj_v2.model.LaneType;
import com.bowl.xp_proj_v2.repository.LaneReservationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class LaneReservationService {

    private final LaneReservationRepository laneReservationRepository;

    public LaneReservationService(LaneReservationRepository laneReservationRepository) {
        this.laneReservationRepository = laneReservationRepository;
    }

    public List<LaneReservation> getAllReservationsSorted() {

        List<LaneReservation> listForSort = new ArrayList<>();

        listForSort = laneReservationRepository.getAllReservations();

        listForSort.sort(new LaneReservationSortComparator());

        return listForSort;

    }

    public void saveLaneReservation(LaneReservationDto laneReservationDto) {

        LaneReservation newLaneReservation = new LaneReservation(
                LocalDate.parse(laneReservationDto.getDate()),
                LocalTime.parse(laneReservationDto.getTime()),
                laneReservationDto.getLanes(),
                laneReservationDto.getName(),
                laneReservationDto.getTel(),
                laneReservationDto.getEmail(),
                laneReservationDto.getNote(),
                LaneType.valueOf(laneReservationDto.getType()));

        laneReservationRepository.saveLaneReservation(newLaneReservation);
    }


}
