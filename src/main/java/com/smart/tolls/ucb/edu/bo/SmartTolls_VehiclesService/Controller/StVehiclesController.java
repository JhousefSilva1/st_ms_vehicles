package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StVehiclesService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehicles")
public class StVehiclesController extends ApiController {

    @Autowired
    public StVehiclesService stVehiclesService;

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
    public ApiResponse<List<StVehicleEntity>> getAllVehiclesByStatus(){
        ApiResponse<List<StVehicleEntity>> response = new ApiResponse<>();
        List<StVehicleEntity> vehicles = stVehiclesService.getAllVehiclesByStatus();
        response.setData(vehicles);
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
    public ApiResponse<Optional<StVehicleEntity>> createVehicles(@RequestBody StVehicleEntity stVehicleEntity){
        ApiResponse<Optional<StVehicleEntity>> response = new ApiResponse<>();
        try {
            Optional<StVehicleEntity> vehicle = stVehiclesService.createVehicle(stVehicleEntity);
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
