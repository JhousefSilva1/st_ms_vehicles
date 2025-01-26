package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StBrandRepository;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StBrandService;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private StBrandRepository stBrandRepository;

    @GetMapping("/all")
    public ApiResponse<List<StBrandEntity>> getAllBrands(){
        ApiResponse<List<StBrandEntity>> response = new ApiResponse<>();
        try {
            if (!stBrandService.isServiceAvailable()) {
                response.setStatus(HttpStatus.SERVICE_UNAVAILABLE.value());
                response.setMessage("The brand service is currently unavailable");
                return logApiResponse(response);
            }

            List<StBrandEntity> brands = stBrandService.getAllBrands();
            if(brands == null || brands.isEmpty()){
                response.setStatus(HttpStatus.NO_CONTENT.value());
                response.setMessage("No brands found");
                return logApiResponse(response);
            }
            response.setData(brands);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
            log.error(e.getMessage(), e);
        }
        return logApiResponse(response);
    }

    @GetMapping
    public ApiResponse<List<StBrandEntity>> getAllBrandsByStatus(){
        ApiResponse<List<StBrandEntity>> response = new ApiResponse<>();
        List<StBrandEntity> brands = stBrandService.getAllBrandByStatus();
        response.setData(brands);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping("/{id}")
    public ApiResponse<StBrandEntity> getBrandById(@PathVariable Long id){
        ApiResponse<StBrandEntity> response = new ApiResponse<>();
        try {
            Optional<StBrandEntity> brand = stBrandService.getBrandById(id);
            if (brand.isPresent()) {
                response.setData(brand.get());
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
    public ApiResponse<Optional<StBrandEntity>> createBrand(@RequestBody StBrandEntity stBrandEntity){
        ApiResponse<Optional<StBrandEntity>> response = new ApiResponse<>();
        try {
            Optional<StBrandEntity> brand = stBrandService.createBrand(stBrandEntity);
            response.setData(brand);
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
    public ApiResponse<Optional<StBrandEntity>> updateBrand(@PathVariable Long id, @RequestBody StBrandEntity stBrandEntity){
        ApiResponse<Optional<StBrandEntity>> response = new ApiResponse<>();
        try {
            Optional<StBrandEntity> brand = stBrandService.updateBrand(id, stBrandEntity);
            response.setData(brand);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }
    @DeleteMapping("/{id}")
    public ApiResponse<Optional<StBrandEntity>> deleteBrand(@PathVariable Long id){
        ApiResponse<Optional<StBrandEntity>> response = new ApiResponse<>();
        try {
            Optional<StBrandEntity> brand = stBrandService.deleteBrand(id);
            response.setData(brand);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }
}
