package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;


import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StFuelTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fuel/types")
public class StFuelTypesController {

    @Autowired
    public StFuelTypesService stFuelTypesService;

    @GetMapping
    public List<StFuelTypesEntity>getAllFuelTypes(){
        return stFuelTypesService.getAllFuelTypes();
    }

    @GetMapping("/{id}")
    public StFuelTypesEntity getFuelTypesById(@PathVariable Long id){
        return stFuelTypesService.getFuelTypesById(id);

    }

    @PostMapping
    public StFuelTypesEntity createFuelTypes(@RequestBody StFuelTypesEntity stFuelTypesEntity){
        return stFuelTypesService.createFuelType(stFuelTypesEntity);
    }

    @PutMapping("/{id}")
    public StFuelTypesEntity updateFuelType(@PathVariable Long id, @RequestBody StFuelTypesEntity stFuelTypesEntity){
        return stFuelTypesService.updateFuelType(id,stFuelTypesEntity);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity <String> deleteFuelType(@PathVariable Long id){
        stFuelTypesService.deleteFuelType(id);
        return ResponseEntity.ok("Fuel type weas deleted Successfully");
    }



}
