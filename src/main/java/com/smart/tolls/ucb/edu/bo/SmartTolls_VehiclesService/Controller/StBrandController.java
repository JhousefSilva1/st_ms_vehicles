package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StBrandService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class StBrandController {

    @Autowired
    private StBrandService stBrandService;


    @GetMapping
    public List<StBrandEntity> getAllBrands(){
        return stBrandService.getAllBrands();
    }

    @GetMapping("/{id}")
    public StBrandEntity getBrandById(@PathVariable Long id){
        return stBrandService.getBrandById(id);
    }

    @PostMapping
    public StBrandEntity createBrand(@RequestBody StBrandEntity stBrandEntity){
        return stBrandService.createBrand(stBrandEntity);
    }
    @PutMapping("/{id}")
    public StBrandEntity updateBrand(@PathVariable Long id, @RequestBody StBrandEntity stBrandEntity){
        return stBrandService.updateBrnd(id, stBrandEntity);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity <String> deleteBrand(@PathVariable Long id){
        stBrandService.deleteBrand(id);
        return ResponseEntity.ok("Brand deleted successfully");
    }
}
