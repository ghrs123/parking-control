package com.api.parkingcontrol.service;

import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.repository.ParkingControlRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {

    final ParkingControlRepository parkingControlRepository;

    public ParkingSpotService(ParkingControlRepository parkingControlRepository) {
        this.parkingControlRepository = parkingControlRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingControlRepository.save(parkingSpotModel);
    }
}
