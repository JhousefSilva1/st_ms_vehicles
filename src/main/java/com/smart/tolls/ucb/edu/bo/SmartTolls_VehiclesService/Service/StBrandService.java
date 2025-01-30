package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StBrandRepository;
import org.slf4j.LoggerFactory;
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
        if (stBrandEntity.getAudit() == null) {
            stBrandEntity.setAudit(new Audit<>());
        }
        stBrandEntity.getAudit().setCurrentValue(stBrandEntity.toString());
        return Optional.of(stBrandRepository.save(stBrandEntity));
    }

    public Optional<StBrandEntity> updateBrand(Long id, StBrandEntity stBrandEntity){
        StBrandEntity brand = stBrandRepository.findByIdAndByStatus(id, 1L);
        brand.getAudit().setPreviousValue(brand.toString()); // Aquí puedes personalizar el valor que deseas auditar
        brand.setBrandName(stBrandEntity.getBrandName());
        brand.setBrandDescription(stBrandEntity.getBrandDescription());
        brand.setBrandManufacturingCountry(stBrandEntity.getBrandManufacturingCountry());
        brand.getAudit().setCurrentValue(brand.toString());
        return Optional.of(stBrandRepository.save(brand));
    }

    public Optional<StBrandEntity> deleteBrand(Long id){
        StBrandEntity brand = stBrandRepository.findByIdAndByStatus(id, 1L);
        brand.setStatus(0);
        return Optional.of(stBrandRepository.save(brand));
    }

    public boolean isServiceAvailable() {
        try {
            stBrandRepository.count();
            return true;
        } catch (Exception e) {
            LoggerFactory.getLogger(StBrandService.class).error("Database is not available", e);
            return false;
        }
    }
}
