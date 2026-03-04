package com.bowl.xp_proj_v2.model;

import java.util.Comparator;

public class LaneReservationSortComparator implements Comparator<LaneReservation> {

    public int compare(LaneReservation lr1, LaneReservation lr2) {

        if (!lr1.getDate().equals(lr2.getDate())) {
            return lr1.getDate().compareTo(lr2.getDate());
        }

        return lr1.getTime().compareTo(lr2.getTime());

    }

}
