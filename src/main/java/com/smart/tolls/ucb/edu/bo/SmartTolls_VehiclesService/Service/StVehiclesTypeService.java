package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StVehiclesTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StVehiclesTypeService {
    @Autowired
    private StVehiclesTypeRepository stVehiclesTypeRepository;

    public List<StVehicleTypeEntity> getAllTypeVehicle(){
        return stVehiclesTypeRepository.findAll();
    }

    public List<StVehicleTypeEntity> getAllTypeVehicleByStatus(){
        return stVehiclesTypeRepository.findAllByStatus();
    }

    public Optional<StVehicleTypeEntity> getVehicleTypeById(Long id){
        return Optional.of(stVehiclesTypeRepository.findByIdAndByStatus(id, 1L));
    }

    public Optional<StVehicleTypeEntity> createVehiclesType(StVehicleTypeEntity stVehicleTypeEntity){
        return Optional.of(stVehiclesTypeRepository.save(stVehicleTypeEntity));
    }

    public Optional<StVehicleTypeEntity> updateVehiclesType (Long id, StVehicleTypeEntity stVehicleTypeEntity){
        StVehicleTypeEntity vehicleType = stVehiclesTypeRepository.findByIdAndByStatus(id, 1L);
        vehicleType.setVehiclesTypes(stVehicleTypeEntity.getVehiclesTypes());
        return Optional.of(stVehiclesTypeRepository.save(vehicleType));
    }

    public Optional<StVehicleTypeEntity> deleteVehicleType(Long id){
        StVehicleTypeEntity vehicleType = stVehiclesTypeRepository.findByIdAndByStatus(id, 1L);
        vehicleType.setStatus(0);
        return Optional.of(stVehiclesTypeRepository.save(vehicleType));
    }
}
