package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StVehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class StVehiclesController {

    @Autowired
    public StVehiclesService stVehiclesService;

    @GetMapping
    public List<StVehicleEntity> getAllVehicles(){
        return stVehiclesService.getAllVehicles();
    }
    @GetMapping("/{id}")
    public StVehicleEntity getVehiclesById(@PathVariable Long id){
        return stVehiclesService.getVehiclesById(id);
    }

    @PostMapping
    public StVehicleEntity createVehicles(@RequestBody StVehicleEntity stVehicleEntity){
        return stVehiclesService.createVehicle(stVehicleEntity);
    }

    @PutMapping("/{id}")
    public StVehicleEntity updateVehicle(@PathVariable Long id, @RequestBody StVehicleEntity stVehicleEntity){
        return stVehiclesService.updateVehicle(id, stVehicleEntity);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity <String> deleteVehicle(@PathVariable Long id){
        stVehiclesService.deleteVehicle(id);
        return ResponseEntity.ok("Vehicle was deleted successfully");
    }



}
