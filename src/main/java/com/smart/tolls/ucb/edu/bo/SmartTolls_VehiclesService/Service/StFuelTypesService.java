package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StFuelTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StFuelTypesService {


    @Autowired
    private StFuelTypeRepository stFuelTypeRepository;

    public List<StFuelTypesEntity>getAllFuelTypes(){
        return stFuelTypeRepository.findAll();
    }

    public StFuelTypesEntity getFuelTypesById(Long id){
        return stFuelTypeRepository.findById(id).get();
    }

    public StFuelTypesEntity createFuelType(StFuelTypesEntity stFuelTypesEntity){
        return stFuelTypeRepository.save(stFuelTypesEntity);
    }

    public StFuelTypesEntity updateFuelType(Long id, StFuelTypesEntity stFuelTypesEntity){
        StFuelTypesEntity fuelTypes = stFuelTypeRepository.findById(id).orElseThrow(() -> new RuntimeException("Fuel typee was not found"));
        fuelTypes.setFuelTypeFuel(stFuelTypesEntity.getFuelTypeFuel());
        return stFuelTypeRepository.save(fuelTypes);
    }

    public void deleteFuelType(Long id){
        stFuelTypeRepository.deleteById(id);
    }


}
