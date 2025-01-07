package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;


import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StFuelTypesService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fuel/types")
public class StFuelTypesController extends ApiController {

    @Autowired
    public StFuelTypesService stFuelTypesService;

    @GetMapping("/all")
    public ApiResponse<List<StFuelTypesEntity>> getAllFuelTypes(){
        ApiResponse<List<StFuelTypesEntity>> response = new ApiResponse<>();
        List<StFuelTypesEntity> fuelTypes = stFuelTypesService.getAllFuelTypes();
        response.setData(fuelTypes);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping
    public ApiResponse<List<StFuelTypesEntity>> getAllFuelTypesByStatus(){
        ApiResponse<List<StFuelTypesEntity>> response = new ApiResponse<>();
        List<StFuelTypesEntity> fuelTypes = stFuelTypesService.getAllFuelTypesByStatus();
        response.setData(fuelTypes);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping("/{id}")
    public ApiResponse<StFuelTypesEntity> getFuelTypesById(@PathVariable Long id){
        ApiResponse<StFuelTypesEntity> response = new ApiResponse<>();
        try {
            Optional<StFuelTypesEntity> fuelType = stFuelTypesService.getFuelTypesById(id);
            if (fuelType.isPresent()) {
                response.setData(fuelType.get());
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
    public ApiResponse<Optional<StFuelTypesEntity>> createFuelTypes(@RequestBody StFuelTypesEntity stFuelTypesEntity){
        ApiResponse<Optional<StFuelTypesEntity>> response = new ApiResponse<>();
        try {
            Optional<StFuelTypesEntity> fuelType = stFuelTypesService.createFuelType(stFuelTypesEntity);
            response.setData(fuelType);
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
    public ApiResponse<Optional<StFuelTypesEntity>> updateFuelType(@PathVariable Long id, @RequestBody StFuelTypesEntity stFuelTypesEntity){
        ApiResponse<Optional<StFuelTypesEntity>> response = new ApiResponse<>();
        try {
            Optional<StFuelTypesEntity> fuelType = stFuelTypesService.updateFuelType(id, stFuelTypesEntity);
            response.setData(fuelType);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Optional<StFuelTypesEntity>> deleteFuelType(@PathVariable Long id){
        ApiResponse<Optional<StFuelTypesEntity>> response = new ApiResponse<>();
        try {
            Optional<StFuelTypesEntity> fuelType = stFuelTypesService.deleteFuelType(id);
            response.setData(fuelType);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }



}
