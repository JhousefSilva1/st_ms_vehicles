package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StBrandService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class StModelController {

    @Autowired
    private StModelService stModelService;

    @GetMapping
    public List<StModelEntity> getAllModels(){
        return stModelService.getAllModels();
    }

    @GetMapping("/{id}")
    public StModelEntity getModelsById(@PathVariable Long id){
        return stModelService.getModelsById(id);
    }

    @PostMapping
    public StModelEntity createModels(@RequestBody StModelEntity stModelEntity){
        return stModelService.createModels(stModelEntity);
    }

    @PutMapping("/{id}")
    public StModelEntity updateModels(@PathVariable Long id, @RequestBody StModelEntity stModelEntity){
        return stModelService.updateModel(id, stModelEntity);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity <String> deleteModels(@PathVariable Long id){
        stModelService.deleteModel(id);
        return ResponseEntity.ok("Model was delete successfully");
    }




}
