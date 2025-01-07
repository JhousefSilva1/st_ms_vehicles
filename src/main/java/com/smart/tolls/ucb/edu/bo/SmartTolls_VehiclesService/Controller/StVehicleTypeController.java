package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StVehiclesTypeService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/vehicleType")
public class StVehicleTypeController extends ApiController {

    @Autowired
    public StVehiclesTypeService stVehiclesTypeService;

    @GetMapping("/all")
    public ApiResponse<List<StVehicleTypeEntity>> getAllTypeVehicle(){
        ApiResponse<List<StVehicleTypeEntity>> response = new ApiResponse<>();
        List<StVehicleTypeEntity> vehicleType = stVehiclesTypeService.getAllTypeVehicle();
        response.setData(vehicleType);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping
    public ApiResponse<List<StVehicleTypeEntity>> getAllTypeVehicleByStatus(){
        ApiResponse<List<StVehicleTypeEntity>> response = new ApiResponse<>();
        List<StVehicleTypeEntity> vehicleType = stVehiclesTypeService.getAllTypeVehicleByStatus();
        response.setData(vehicleType);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping("/{id}")
    public ApiResponse<StVehicleTypeEntity> getVehicleTypeById(@PathVariable Long id){
        ApiResponse<StVehicleTypeEntity> response = new ApiResponse<>();
        try {
            Optional<StVehicleTypeEntity> vehicleType = stVehiclesTypeService.getVehicleTypeById(id);
            if (vehicleType.isPresent()) {
                response.setData(vehicleType.get());
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
    public ApiResponse<Optional<StVehicleTypeEntity>> createVehiclesType(@RequestBody StVehicleTypeEntity stVehicleTypeEntity){
        ApiResponse<Optional<StVehicleTypeEntity>> response = new ApiResponse<>();
        try {
            Optional<StVehicleTypeEntity> vehicleType = stVehiclesTypeService.createVehiclesType(stVehicleTypeEntity);
            response.setData(vehicleType);
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
    public ApiResponse<Optional<StVehicleTypeEntity>> updateVehiclesType (@PathVariable Long id, @RequestBody StVehicleTypeEntity stVehicleTypeEntity){
        ApiResponse<Optional<StVehicleTypeEntity>> response = new ApiResponse<>();
        try {
            Optional<StVehicleTypeEntity> vehicleType = stVehiclesTypeService.updateVehiclesType(id, stVehicleTypeEntity);
            response.setData(vehicleType);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Optional<StVehicleTypeEntity>> deleteVehicleType(@PathVariable Long id){
        ApiResponse<Optional<StVehicleTypeEntity>> response = new ApiResponse<>();
        try {
            Optional<StVehicleTypeEntity> vehicleType = stVehiclesTypeService.deleteVehicleType(id);
            response.setData(vehicleType);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }
}
