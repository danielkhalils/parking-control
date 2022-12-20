package io.github.danielkhalils.parkingcontrol.DTOs;

import jakarta.validation.constraints.NotBlank;

public class ParkingSpotDTO {

    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
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
