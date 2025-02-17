package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.StModelRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StBrandService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StModelService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/models")
public class StModelController extends ApiController {

    @Autowired
    private StModelService stModelService;

    @Autowired
    private StBrandService stBrandService;
//    this endpoint is to use for admin role
    @GetMapping("/all")
    public ApiResponse<List<StModelEntity>> getAllModels(){
        ApiResponse<List<StModelEntity>> response = new ApiResponse<>();
        List<StModelEntity> models = stModelService.getAllModels();
        response.setData(models);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping
    public ApiResponse<List<StModelEntity>> getAllModelsByStatus(){
        ApiResponse<List<StModelEntity>> response = new ApiResponse<>();
        List<StModelEntity> models = stModelService.getAllModelsByStatus();
        response.setData(models);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping("/{id}")
    public ApiResponse<StModelEntity> getModelsById(@PathVariable Long id){
        ApiResponse<StModelEntity> response = new ApiResponse<>();
        try {
            Optional<StModelEntity> model = stModelService.getModelsById(id);
            if(model.isPresent()){
                response.setData(model.get());
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

    @GetMapping("/byBrand/{id}")
    public ApiResponse<List<StModelEntity>> getModelsByBrandId(@PathVariable Long id){
        ApiResponse<List<StModelEntity>> response = new ApiResponse<>();
        try {
            List<StModelEntity> model = stModelService.getModelsByBrandId(id);
            response.setData(model);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
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
    public ApiResponse<Optional<StModelEntity>> createModels(@RequestBody StModelRequest stModelRequest) {
        {
            ApiResponse<Optional<StModelEntity>> response = new ApiResponse<>();
            try {
                Optional<StBrandEntity> brand = stBrandService.getBrandById(stModelRequest.getIdBrand());
                if (brand.isPresent()) {
                    StModelEntity modelEntity = new StModelEntity();
                    modelEntity.setModelName(stModelRequest.getModelName());
                    modelEntity.setBrand(brand.get());
                    modelEntity.setModelDescription(stModelRequest.getModelDescription());
                    Optional<StModelEntity> model = stModelService.createModels(modelEntity);
                    response.setData(model);
                    response.setStatus(HttpStatus.OK.value());
                    response.setMessage(HttpStatus.OK.getReasonPhrase());
                } else {
                    response.setStatus(HttpStatus.NOT_FOUND.value());
                    response.setMessage(HttpStatus.NOT_FOUND.getReasonPhrase());
                }

            } catch (ConstraintViolationException e) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
            } catch (Exception e) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
            }
            return logApiResponse(response);
        }
    }
    @PutMapping("/{id}")
    public ApiResponse<Optional<StModelEntity>> updateModels(@PathVariable Long id, @RequestBody StModelEntity stModelEntity){
        ApiResponse<Optional<StModelEntity>> response =  new ApiResponse<>();
        try {
            Optional<StModelEntity> model = stModelService.updateModel(id, stModelEntity);
            response.setData(model);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Optional<StModelEntity>> deleteModels(@PathVariable Long id){
        ApiResponse<Optional<StModelEntity>> response = new ApiResponse<>();
        try {
            Optional<StModelEntity> model = stModelService.deleteModel(id);
            response.setData(model);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }
}
