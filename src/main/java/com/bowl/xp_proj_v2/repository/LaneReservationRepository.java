package com.bowl.xp_proj_v2.repository;

import com.bowl.xp_proj_v2.model.LaneReservation;
import com.bowl.xp_proj_v2.model.LaneType;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LaneReservationRepository {

    private final List<LaneReservation> reservationList;


    public LaneReservationRepository() {
        this.reservationList = new ArrayList<>();
        initDataReservations();


    }

    public List<LaneReservation> getAllReservations() {
        return new ArrayList<>(reservationList);
    }

    public void saveLaneReservation(LaneReservation laneReservation) {
        reservationList.add(laneReservation);

    }


    private void initDataReservations() {
        reservationList.add(new LaneReservation(LocalDate.of(2026,6,12), LocalTime.of(21, 0), "1, 5, 6, 8", "John", "21245588", "john@ofir.dk", "Fødselsdag", LaneType.BOWLING));
        reservationList.add(new LaneReservation(LocalDate.of(2026,3,13), LocalTime.of(20, 0), "3", "Anders", "23244577", "dfd@gigo.dk", "", LaneType.AIRHOCKEY));
        reservationList.add(new LaneReservation(LocalDate.of(2026,3,14), LocalTime.of(19, 0), "2, 3", "Lone", "33267566", "343@ofir.dk", "", LaneType.BOWLING_KIDS));
        reservationList.add(new LaneReservation(LocalDate.of(2026,3,19), LocalTime.of(17, 0), "5, 6", "Julie", "21266566", "jj@tdc.dk", "", LaneType.BOWLING));
        reservationList.add(new LaneReservation(LocalDate.of(2026,3,21), LocalTime.of(18, 0), "1, 3", "Peter", "22248866", "pulxzx@hugo.dk", "Hund", LaneType.BOWLING_KIDS));
        reservationList.add(new LaneReservation(LocalDate.of(2026,4,5), LocalTime.of(19, 0), "2", "Jonna D", "25244566", "jons@sbsi.dk", "Crazy people", LaneType.AIRHOCKEY));
        reservationList.add(new LaneReservation(LocalDate.of(2026,4,5), LocalTime.of(20, 0), "2, 3", "Zuna", "29253366", "zz55@yahoo.dk", "", LaneType.BOWLING));

    }




}
