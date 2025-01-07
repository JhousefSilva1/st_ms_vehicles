package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StBrandService {

    @Autowired
    private StBrandRepository stBrandRepository;

    public List<StBrandEntity> getAllBrands(){
        return stBrandRepository.findAll();
    }

    public List<StBrandEntity> getAllBrandByStatus(){
        return stBrandRepository.findAllByStatus();
    }

    public Optional<StBrandEntity> getBrandById(Long id){
        return Optional.of(stBrandRepository.findByIdAndByStatus(id, 1L));
    }

    public Optional<StBrandEntity> createBrand(StBrandEntity stBrandEntity){
        return Optional.of(stBrandRepository.save(stBrandEntity));
    }

    public Optional<StBrandEntity> updateBrand(Long id, StBrandEntity stBrandEntity){
        StBrandEntity brand = stBrandRepository.findByIdAndByStatus(id, 1L);
        brand.setBrandName(stBrandEntity.getBrandName());
        brand.setBrandDescription(stBrandEntity.getBrandDescription());
        brand.setBrandManufacturingCountry(stBrandEntity.getBrandManufacturingCountry());
        return Optional.of(stBrandRepository.save(brand));
    }

    public Optional<StBrandEntity> deleteBrand(Long id){
        StBrandEntity brand = stBrandRepository.findByIdAndByStatus(id, 1L);
        brand.setStatus(0);
        return Optional.of(stBrandRepository.save(brand));
    }
}
