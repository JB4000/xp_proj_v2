package com.bowl.xp_proj_v2.repository;

import com.bowl.xp_proj_v2.model.TableReservation;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Repository
public class TableReservationRepository {

    private final List<TableReservation> bookingList;

    public TableReservationRepository() {
        this.bookingList = new ArrayList<>();
        initTableReservations();
    }

    public void saveTableReservation(TableReservation newTableReservation) {
    }

    private void initTableReservations() {
        bookingList.add(new TableReservation(
                LocalDate.of(2026, 3, 10),
                LocalTime.of(17, 30),
                "Mads",
                4,
                "mads@example.com"
        ));

        bookingList.add(new TableReservation(
                LocalDate.of(2026, 3, 10),
                LocalTime.of(19, 0),
                "Sara",
                2,
                "sara@example.com"
        ));

        bookingList.add(new TableReservation(
                LocalDate.of(2026, 3, 12),
                LocalTime.of(18, 15),
                "Jonas",
                6,
                "jonas@example.com"
        ));

        bookingList.add(new TableReservation(
                LocalDate.of(2026, 3, 15),
                LocalTime.of(20, 0),
                "Aisha",
                3,
                "aisha@example.com"
        ));

        bookingList.add(new TableReservation(
                LocalDate.of(2026, 3, 21),
                LocalTime.of(16, 45),
                "Lene",
                8,
                "lene@example.com"


        ));
        System.out.println("Dummy table reservations: " + bookingList);
    }
}