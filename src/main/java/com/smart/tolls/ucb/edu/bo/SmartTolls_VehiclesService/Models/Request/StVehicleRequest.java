package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request;


import lombok.Data;

@Data
public class StVehicleRequest {
    private Long idVehicle;
    private String licensePlate;
    private String chassisNumber;
    private String engineNumber;
    private String manufacturingYear;
    private Double weight;
    private Long idFuelTypes;
    private Long idVehiclesColors;
    private Long idVehiclesModels;
    private Long idVehiclesType;
    private Long idVehiclesBrand;
    private Long idPerson;
    private Long idCity;
    private Long idCountry;

}
