package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Client.CountryCityClient;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CityDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CountryDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.*;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.StVehicleRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.StVehicleResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.*;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehicles")
public class StVehiclesController extends ApiController {
    @Autowired
    public StColorService stColorService;

    @Autowired
    public StFuelTypesService stFuelTypesService;

    @Autowired
    public StModelService stModelService;

    @Autowired
    public StVehiclesService stVehiclesService;

    @Autowired
    public StVehiclesTypeService stVehiclesTypeService;

    @Autowired
    public CountryCityClient countryCityClient;

    @GetMapping("/all")
    public ApiResponse<List<StVehicleEntity>> getAllVehicles(){
        ApiResponse<List<StVehicleEntity>> response = new ApiResponse<>();
        List<StVehicleEntity> vehicles = stVehiclesService.getAllVehicles();
        response.setData(vehicles);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping
    public ApiResponse<List<StVehicleResponse>> getAllVehiclesByStatus(){
        ApiResponse<List<StVehicleResponse>> response = new ApiResponse<>();
        List<StVehicleEntity> vehicles = stVehiclesService.getAllVehiclesByStatus();
        List<StVehicleResponse> vehiclesResponse = new ArrayList<>();
        for (StVehicleEntity vehicle : vehicles) {
            ApiResponse<CityDto> cityResponse = countryCityClient.getCityById(vehicle.getIdCity());
            if(cityResponse.getStatus() != HttpStatus.OK.value()) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro la ciudad");
                return logApiResponse(response);
            }
            ApiResponse<CountryDto> countryResponse = countryCityClient.getCountryById(vehicle.getIdCountry());
            if(countryResponse.getStatus() != HttpStatus.OK.value()) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro el pais");
                return logApiResponse(response);
            }

            StVehicleResponse vehicleResponse = new StVehicleResponse();
            vehicleResponse.setIdVehicle(vehicle.getIdVehicle());
            vehicleResponse.setLicensePlate(vehicle.getLicensePlate());
            vehicleResponse.setChassisNumber(vehicle.getChassisNumber());
            vehicleResponse.setEngineNumber(vehicle.getEngineNumber());
            vehicleResponse.setManufacturingYear(vehicle.getManufacturingYear());
            vehicleResponse.setWeight(vehicle.getWeight());
            vehicleResponse.setFuelTypes(vehicle.getFuelTypes());
            vehicleResponse.setVehiclesColors(vehicle.getVehiclesColors());
            vehicleResponse.setVehiclesModels(vehicle.getVehiclesModels());
            vehicleResponse.setVehiclesType(vehicle.getVehiclesType());
            vehicleResponse.setCountry(countryResponse.getData());
            vehicleResponse.setCity(cityResponse.getData());
            vehicleResponse.setIdPerson(vehicle.getIdPerson());
            vehiclesResponse.add(vehicleResponse);
        }
        response.setData(vehiclesResponse);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping("/{id}")
    public ApiResponse<StVehicleEntity> getVehiclesById(@PathVariable Long id){
        ApiResponse<StVehicleEntity> response = new ApiResponse<>();
        try {
            Optional<StVehicleEntity> vehicle = stVehiclesService.getVehiclesById(id);
            if (vehicle.isPresent()) {
                response.setData(vehicle.get());
                response.setStatus(HttpStatus.OK.value());
                response.setMessage(HttpStatus.OK.getReasonPhrase());
            } else {
                response.setStatus(HttpStatus.NOT_FOUND.value());
                response.setMessage(HttpStatus.NOT_FOUND.getReasonPhrase());
            }
        } catch (NullPointerException e) {
            response.setStatus(HttpStatus.NOT_FOUND.value());
            response.setMessage(HttpStatus.NOT_FOUND.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }

    @PostMapping
    public ApiResponse<Optional<StVehicleEntity>> createVehicles(@RequestBody StVehicleRequest stVehicleRequest){
        ApiResponse<Optional<StVehicleEntity>> response = new ApiResponse<>();
        try {
            Optional<StFuelTypesEntity> fuelTypes = stFuelTypesService.getFuelTypesById(stVehicleRequest.getIdFuelTypes());
            if(fuelTypes.isEmpty()) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro el tipo de combustible");
                return logApiResponse(response);
            }
            Optional<StColorEntity> color = stColorService.getColorById(stVehicleRequest.getIdVehiclesColors());
            if(color.isEmpty()) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro el color");
                return logApiResponse(response);
            }
            Optional<StModelEntity> model = stModelService.getModelsById(stVehicleRequest.getIdVehiclesModels());
            if(model.isEmpty()) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro el modelo");
                return logApiResponse(response);
            }
            Optional<StVehicleTypeEntity> vehicleType = stVehiclesTypeService.getVehicleTypeById(stVehicleRequest.getIdVehiclesType());
            if(vehicleType.isEmpty()) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro el tipo de vehiculo");
                return logApiResponse(response);
            }

            ApiResponse<CityDto> city = countryCityClient.getCityById(stVehicleRequest.getIdCity());
            if(city.getStatus() != HttpStatus.OK.value()) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro la ciudad");
                return logApiResponse(response);
            }
            if(city.getData() == null) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro la ciudad");
                return logApiResponse(response);
            }

            ApiResponse<CountryDto> country = countryCityClient.getCountryById(stVehicleRequest.getIdCountry());
            if(country.getStatus() != HttpStatus.OK.value()) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro el pais");
                return logApiResponse(response);
            }

            if(country.getData() == null) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("No se encontro el pais");
                return logApiResponse(response);
            }

            StVehicleEntity vehicleEntity = new StVehicleEntity();
            vehicleEntity.setLicensePlate(stVehicleRequest.getLicensePlate());
            vehicleEntity.setChassisNumber(stVehicleRequest.getChassisNumber());
            vehicleEntity.setEngineNumber(stVehicleRequest.getEngineNumber());
            vehicleEntity.setManufacturingYear(stVehicleRequest.getManufacturingYear());
            vehicleEntity.setWeight(stVehicleRequest.getWeight());
            vehicleEntity.setFuelTypes(fuelTypes.get());
            vehicleEntity.setVehiclesColors(color.get());
            vehicleEntity.setVehiclesModels(model.get());
            vehicleEntity.setVehiclesType(vehicleType.get());
            vehicleEntity.setIdCountry(stVehicleRequest.getIdCountry());
            vehicleEntity.setIdCity(stVehicleRequest.getIdCity());
            vehicleEntity.setIdPerson(stVehicleRequest.getIdPerson());

            Optional<StVehicleEntity> vehicle = stVehiclesService.createVehicle(vehicleEntity);
            response.setData(vehicle);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (ConstraintViolationException e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }

    @PutMapping("/{id}")
    public ApiResponse<Optional<StVehicleEntity>> updateVehicle(@PathVariable Long id, @RequestBody StVehicleEntity stVehicleEntity){
        ApiResponse<Optional<StVehicleEntity>> response = new ApiResponse<>();
        try {
            Optional<StVehicleEntity> vehicle = stVehiclesService.updateVehicle(id, stVehicleEntity);
            response.setData(vehicle);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Optional<StVehicleEntity>> deleteVehicle(@PathVariable Long id){
        ApiResponse<Optional<StVehicleEntity>> response = new ApiResponse<>();
        try {
            Optional<StVehicleEntity> vehicle = stVehiclesService.deleteVehicle(id);
            response.setData(vehicle);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }



}
