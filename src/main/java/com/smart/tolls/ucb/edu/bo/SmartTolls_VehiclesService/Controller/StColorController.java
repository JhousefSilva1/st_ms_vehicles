package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StColorService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/colors")
public class StColorController extends ApiController {

    @Autowired
    private StColorService stColorService;

    @GetMapping("/all")
    public ApiResponse<List<StColorEntity>> getAllColors(){
        ApiResponse<List<StColorEntity>> response = new ApiResponse<>();
        List<StColorEntity> colors = stColorService.getAllColors();
        response.setData(colors);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping
    public ApiResponse<List<StColorEntity>> getAllColorsByStatus(){
        ApiResponse<List<StColorEntity>> response = new ApiResponse<>();
        List<StColorEntity> colors = stColorService.getAllColorsByStatus();
        response.setData(colors);
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @GetMapping("/{id}")
    public ApiResponse<StColorEntity> getColorById(@PathVariable Long id){
        ApiResponse<StColorEntity> response = new ApiResponse<>();
        try {
            Optional<StColorEntity> color = stColorService.getColorById(id);
            if (color.isPresent()) {
                response.setData(color.get());
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
    public ApiResponse<Optional<StColorEntity>> createColor(@RequestBody StColorEntity stColorEntity){
        ApiResponse<Optional<StColorEntity>> response = new ApiResponse<>();
        try {
            Optional<StColorEntity> color = stColorService.createColor(stColorEntity);
            response.setData(color);
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
    public ApiResponse<Optional<StColorEntity>> updateColor(@PathVariable Long id, @RequestBody StColorEntity stColorEntity ){
        ApiResponse<Optional<StColorEntity>> response = new ApiResponse<>();
        try {
            Optional<StColorEntity> color = stColorService.updateColor(id, stColorEntity);
            response.setData(color);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Optional<StColorEntity>> deleteColor(@PathVariable Long id){
        ApiResponse<Optional<StColorEntity>> response = new ApiResponse<>();
        try {
            Optional<StColorEntity> color = stColorService.deleteColor(id);
            response.setData(color);
            response.setStatus(HttpStatus.OK.value());
            response.setMessage(HttpStatus.OK.getReasonPhrase());
        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(HttpStatus.BAD_REQUEST.getReasonPhrase());
        }
        return logApiResponse(response);
    }



}
