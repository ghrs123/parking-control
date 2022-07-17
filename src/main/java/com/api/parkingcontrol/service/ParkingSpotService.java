package com.api.parkingcontrol.service;

import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.repository.ParkingControlRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class ParkingSpotService {

    final ParkingControlRepository parkingControlRepository;

    public Page<ParkingSpotModel> findAll(Pageable pageable){
        return parkingControlRepository.findAll(pageable);
    };

    public ParkingSpotService(ParkingControlRepository parkingControlRepository) {
        this.parkingControlRepository = parkingControlRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingControlRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar){
        return parkingControlRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber){
        return parkingControlRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block){
        return parkingControlRepository.existsByApartmentAndBlock(apartment,block);
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingControlRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingControlRepository.delete(parkingSpotModel);
    }
}
