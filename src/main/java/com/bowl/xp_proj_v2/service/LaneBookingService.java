package com.bowl.xp_proj_v2.service;

import com.bowl.xp_proj_v2.model.LaneBooking;
import com.bowl.xp_proj_v2.repository.LaneBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaneBookingService {

    private final LaneBookingRepository repository;

    public LaneBookingService(LaneBookingRepository repository) {
        this.repository = repository;
    }


}