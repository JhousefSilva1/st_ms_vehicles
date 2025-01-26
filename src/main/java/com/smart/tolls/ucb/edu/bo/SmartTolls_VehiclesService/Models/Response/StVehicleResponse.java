package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CityDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CountryDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import lombok.Data;

@Data
public class StVehicleResponse {
    private Long idVehicle;
    private String licensePlate;
    private String chassisNumber;
    private String engineNumber;
    private String manufacturingYear;
    private Double weight;
    private StFuelTypesEntity fuelTypes;
    private StColorEntity vehiclesColors;
    private StModelEntity vehiclesModels;
    private StVehicleTypeEntity vehiclesType;
    private Long idPerson;
    private CityDto city;
    private CountryDto country;

}
