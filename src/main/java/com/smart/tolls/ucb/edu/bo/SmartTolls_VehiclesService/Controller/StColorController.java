package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
public class StColorController {

    @Autowired
    private StColorService stColorService;

    @GetMapping
    public List<StColorEntity> getAllColors(){
        return stColorService.getAllColors();
    }

    @GetMapping("/{id}")
    public StColorEntity getColorById(@PathVariable Long id){
        return stColorService.getColorById(id);
    }

    @PostMapping
    public StColorEntity createColor(@RequestBody StColorEntity stColorEntity){
        return stColorService.createColor(stColorEntity);
    }

    @PutMapping("/{id}")
    public StColorEntity updateColor(@PathVariable Long id, @RequestBody StColorEntity stColorEntity ){
        return stColorService.updateColor(id, stColorEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <String> deleteColor(@PathVariable Long id){
        stColorService.deleteColor(id);
        return ResponseEntity.ok("Color eliminado Correctamente");
    }



}
