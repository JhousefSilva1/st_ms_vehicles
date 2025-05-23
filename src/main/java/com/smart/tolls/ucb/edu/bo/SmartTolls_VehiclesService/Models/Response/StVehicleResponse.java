package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CityDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CountryDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.PersonsDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.*;
import lombok.Data;

@Data
public class StVehicleResponse {
    private Long idVehicle;
    private String licensePlate;
    private String chassisNumber;
    private String engineNumber;
    private String manufacturingYear;
    private Double weight;
    private StWalletEntity wallet;
    private StFuelTypesEntity fuelTypes;
    private StColorEntity vehiclesColors;
    private StModelEntity vehiclesModels;
    private StVehicleTypeEntity vehiclesType;
    private CityDto city;
    private CountryDto country;
    private PersonsDto persons;
    private Integer Vehiclestatus;

}
