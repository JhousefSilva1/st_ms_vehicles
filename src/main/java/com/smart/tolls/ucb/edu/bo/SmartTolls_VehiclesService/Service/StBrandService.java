package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StBrandService {

    @Autowired
    private StBrandRepository stBrandRepository;

    public List<StBrandEntity> getAllBrands(){
        return stBrandRepository.findAll();
    }

    public StBrandEntity getBrandById(Long id){
        return stBrandRepository.findById(id).get();
    }

    public StBrandEntity createBrand(StBrandEntity stBrandEntity){
        return stBrandRepository.save(stBrandEntity);
    }
    public StBrandEntity updateBrnd(Long id, StBrandEntity stBrandEntity){
        StBrandEntity brand = stBrandRepository.findById(id).orElseThrow(() -> new RuntimeException("Brand was not found"));
        brand.setBrandName(stBrandEntity.getBrandName());
        return stBrandRepository.save(brand);
    }

    public void deleteBrand(Long id){
        stBrandRepository.deleteById(id);
    }
}
