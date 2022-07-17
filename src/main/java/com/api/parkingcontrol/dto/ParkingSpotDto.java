package com.api.parkingcontrol.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;

    @NotBlank
    @Size(max = 7)
    private String licensePlateCar;

    @NotBlank
    private String brandCar;

    @NotBlank
    private String modelCar;

    @NotBlank
    private String colorCar;

    @NotBlank
    private String responsibleName;

    @NotBlank
    private String apartment;

    @NotBlank
    private String block;


}
