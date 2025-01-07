package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StFuelTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StFuelTypesService {


    @Autowired
    private StFuelTypeRepository stFuelTypeRepository;

    public List<StFuelTypesEntity>getAllFuelTypes(){
        return stFuelTypeRepository.findAll();
    }

    public List<StFuelTypesEntity>getAllFuelTypesByStatus(){
        return stFuelTypeRepository.findAllByStatus();
    }

    public Optional<StFuelTypesEntity> getFuelTypesById(Long id){
        return Optional.of(stFuelTypeRepository.findByIdAndByStatus(id, 1L));
    }

    public Optional<StFuelTypesEntity> createFuelType(StFuelTypesEntity stFuelTypesEntity){
        return Optional.of(stFuelTypeRepository.save(stFuelTypesEntity));
    }

    public Optional<StFuelTypesEntity> updateFuelType(Long id, StFuelTypesEntity stFuelTypesEntity){
        StFuelTypesEntity fuelTypes = stFuelTypeRepository.findByIdAndByStatus(id, 1L);
        fuelTypes.setFuelTypeFuel(stFuelTypesEntity.getFuelTypeFuel());
        return Optional.of(stFuelTypeRepository.save(fuelTypes));
    }

    public Optional<StFuelTypesEntity> deleteFuelType(Long id){
        StFuelTypesEntity fuelTypes = stFuelTypeRepository.findByIdAndByStatus(id, 1L);
        fuelTypes.setStatus(0);
        return Optional.of(stFuelTypeRepository.save(fuelTypes));
    }


}
