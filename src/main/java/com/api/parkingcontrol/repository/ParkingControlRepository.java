package com.api.parkingcontrol.repository;

import com.api.parkingcontrol.model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingControlRepository extends JpaRepository <ParkingSpotModel, UUID>{

    public boolean existsByLicensePlateCar  (String licensePlateCar);

    public boolean existsByParkingSpotNumber(String parkingSpotNumber);

    public boolean existsByApartmentAndBlock(String apartment, String block);
}
