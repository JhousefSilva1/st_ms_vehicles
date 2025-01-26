package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StBrandService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/brands")
public class StBrandController extends ApiController {

    @Autowired
    private StBrandService stBrandService;

    @GetMapping("/all")
    public ApiResponse<List<StBrandEntity>> getAllBrands(){
        ApiResponse<List<StBrandEntity>> response = new ApiResponse<>();
        try {
            if (stBrandService.isServiceAvailable()) {
                response.setStatus(HttpStatus.SERVICE_UNAVAILABLE.value());
                response.setMessage("The brand service is currently unavailable");
                return logApiResponse(response);
            }

            List<StBrandEntity> brands = stBrandService.getAllBrands();
            validateBrand(response, brands);
        } catch (Exception e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
            log.error(e.getMessage(), e);
        }
        return logApiResponse(response);
    }

    private void validateBrand(ApiResponse<List<StBrandEntity>> response, List<StBrandEntity> brands) {
        if(brands == null || brands.isEmpty()){
            response.setStatus(HttpStatus.NO_CONTENT.value());
            response.setMessage("No brands found");
        } else {
            response.setData(brands);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        }
    }

    @GetMapping
    public ApiResponse<List<StBrandEntity>> getAllBrandsByStatus(){
        ApiResponse<List<StBrandEntity>> response = new ApiResponse<>();
        try {
            if (stBrandService.isServiceAvailable()) {
                response.setStatus(HttpStatus.SERVICE_UNAVAILABLE.value());
                response.setMessage("The brand service is currently unavailable");
                return logApiResponse(response);
            }
            List<StBrandEntity> brands = stBrandService.getAllBrandByStatus();
            validateBrand(response, brands);
        } catch (Exception e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
            log.error(e.getMessage(), e);
        }
        return logApiResponse(response);
    }

    @GetMapping("/{id}")
    public ApiResponse<StBrandEntity> getBrandById(@PathVariable Long id){
        ApiResponse<StBrandEntity> response = new ApiResponse<>();
        try {
            if(id == null || id <= 0){
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("Invalid id");
                return logApiResponse(response);
            }
            Optional<StBrandEntity> brand = stBrandService.getBrandById(id);
            if (brand.isPresent()) {
                response.setData(brand.get());
                response.setStatus(HttpStatus.OK.value());
                response.setMessage(HttpStatus.OK.getReasonPhrase());
            } else {
                response.setStatus(HttpStatus.NOT_FOUND.value());
                response.setMessage("Braand with ID: " + id + " not found");
            }
        } catch (NullPointerException e) {
            response.setStatus(HttpStatus.NOT_FOUND.value());
            response.setMessage("Brand with ID: " + id + " not found");
        } catch (DataAccessException e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage("Database error: " + e.getMessage());
            log.error("Database error while fetching brand with ID " + id, e);
        } catch (IllegalArgumentException e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("Invalid argument: " + e.getMessage());
            log.error("Invalid argument error for brand ID " + id, e);
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("An unexpected error occurred: " + e.getMessage());
        }
        return logApiResponse(response);
    }

    @PostMapping
    public ApiResponse<Optional<StBrandEntity>> createBrand(@RequestBody StBrandEntity stBrandEntity){
        ApiResponse<Optional<StBrandEntity>> response = new ApiResponse<>();
        try {
            if (validateFields(stBrandEntity, response)) return logApiResponse(response);
            Optional<StBrandEntity> brand = stBrandService.createBrand(stBrandEntity);
            response.setData(brand);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (ConstraintViolationException e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("Validation error: " + e.getMessage());
            log.error("Constraint violation during brand creation", e);
        } catch (DataIntegrityViolationException e) {
            response.setStatus(HttpStatus.CONFLICT.value());
            response.setMessage("Data integrity error: " + e.getMessage());
            log.error("Data integrity violation during brand creation", e);
        } catch (Exception e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage("An unexpected error occurred: " + e.getMessage());
            log.error("Unexpected error during brand creation", e);
        }
        return logApiResponse(response);
    }

    @PutMapping("/{id}")
    public ApiResponse<Optional<StBrandEntity>> updateBrand(@PathVariable Long id, @RequestBody StBrandEntity stBrandEntity){
        ApiResponse<Optional<StBrandEntity>> response = new ApiResponse<>();
        try {
            if(id == null || id <= 0){
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("Invalid id");
                return logApiResponse(response);
            }
            if (validateFields(stBrandEntity, response)) return logApiResponse(response);
            Optional<StBrandEntity> brand = stBrandService.updateBrand(id, stBrandEntity);
            response.setData(brand);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (EntityNotFoundException e) {
            response.setStatus(HttpStatus.NOT_FOUND.value());
            response.setMessage("Brand with ID " + id + " not found");
            log.error("Error: Brand with ID " + id + " not found", e);
        } catch (DataIntegrityViolationException e) {
            response.setStatus(HttpStatus.CONFLICT.value());
            response.setMessage("Data integrity error: " + e.getMessage());
            log.error("Data integrity violation while updating brand with ID " + id, e);
        } catch (ConstraintViolationException e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("Validation error: " + e.getMessage());
            log.error("Validation error while updating brand with ID " + id, e);
        } catch (Exception e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage("An unexpected error occurred: " + e.getMessage());
            log.error("Unexpected error while updating brand with ID " + id, e);
        }
        return logApiResponse(response);
    }

    private boolean validateFields(@RequestBody StBrandEntity stBrandEntity, ApiResponse<Optional<StBrandEntity>> response) {
        if(stBrandEntity.getBrandName() == null || stBrandEntity.getBrandName().isBlank()){
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("BrandName is required");
            return true;
        }
        if(stBrandEntity.getBrandDescription() == null || stBrandEntity.getBrandDescription().isBlank()){
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("BrandDescription is required");
            return true;
        }
        if(stBrandEntity.getBrandManufacturingCountry() == null || stBrandEntity.getBrandManufacturingCountry().isBlank()){
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("BrandManufacturingCountry is required");
            return true;
        }
        return false;
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Optional<StBrandEntity>> deleteBrand(@PathVariable Long id){
        ApiResponse<Optional<StBrandEntity>> response = new ApiResponse<>();
        try {
            if(id == null || id <= 0){
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage("Invalid id");
                return logApiResponse(response);
            }
            Optional<StBrandEntity> brand = stBrandService.deleteBrand(id);
            if(brand.isPresent()){
                response.setData(brand);
                response.setStatus(HttpStatus.OK.value());
                response.setMessage(HttpStatus.OK.getReasonPhrase());
            } else {
                response.setStatus(HttpStatus.NOT_FOUND.value());
                response.setMessage("Braand with ID: " + id + " not found");
            }
        } catch (Exception e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage("An unexpected error occurred: " + e.getMessage());
            log.error("Unexpected error while deleting brand with ID {}", id, e);
        }
        return logApiResponse(response);
    }
}
