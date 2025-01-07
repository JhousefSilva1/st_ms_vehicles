package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StVehiclesTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vehicleType")
public class StVehicleTypeController {

    @Autowired
    public StVehiclesTypeService stVehiclesTypeService;

    @GetMapping
    public List<StVehicleTypeEntity> getAllTypeVehicle(){
        return stVehiclesTypeService.getAllTypeVehicle();
    }

    @GetMapping("/{id}")
    public StVehicleTypeEntity getVehicleTypeById(@PathVariable Long id){
        return stVehiclesTypeService.getVehicleTypeById(id);
    }

    @PostMapping
    public StVehicleTypeEntity createVehiclesType(@RequestBody StVehicleTypeEntity stVehicleTypeEntity){
        return stVehiclesTypeService.createVehiclesType(stVehicleTypeEntity);
    }

    @PutMapping("/{id}")
    public StVehicleTypeEntity updateVehiclesType (@PathVariable Long id, @RequestBody StVehicleTypeEntity stVehicleTypeEntity){
        return stVehiclesTypeService.updateVehiclesType(id, stVehicleTypeEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <String> deleteVehicleType(@PathVariable Long id){
        stVehiclesTypeService.deleteVehicleType(id);
        return ResponseEntity.ok("Vehicle Type was deleted successfully");
    }
}
