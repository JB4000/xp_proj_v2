package com.bowl.xp_proj_v2.service;

import com.bowl.xp_proj_v2.model.LaneReservation;
import com.bowl.xp_proj_v2.model.LaneReservationSortComparator;
import com.bowl.xp_proj_v2.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService (ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<LaneReservation> getAllReservationsSorted() {

        List<LaneReservation> listForSort = new ArrayList<>();

        listForSort = reservationRepository.getAllReservations();

        listForSort.sort(new LaneReservationSortComparator());

        return listForSort;

    }


}
