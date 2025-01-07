package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StVehiclesService {

    @Autowired
    private StVehicleRepository stVehicleRepository;

    public List<StVehicleEntity> getAllVehicles(){
        return stVehicleRepository.findAll();
    }

    public List<StVehicleEntity> getAllVehiclesByStatus(){
        return stVehicleRepository.findAllByStatus();
    }

    public Optional<StVehicleEntity> getVehiclesById(Long id){
        return Optional.of(stVehicleRepository.findByIdAndByStatus(id, 1L));
    }

    public Optional<StVehicleEntity> createVehicle(StVehicleEntity stVehicleEntity){
        return Optional.of(stVehicleRepository.save(stVehicleEntity));
    }

    public Optional<StVehicleEntity> updateVehicle(Long id, StVehicleEntity stVehicleEntity){
        StVehicleEntity vehicle = stVehicleRepository.findByIdAndByStatus(id, 1L);
        vehicle.setLicensePlate(stVehicleEntity.getLicensePlate());
        vehicle.setChassisNumber(stVehicleEntity.getChassisNumber());
        vehicle.setEngineNumber(stVehicleEntity.getEngineNumber());
        vehicle.setManufacturingYear(stVehicleEntity.getManufacturingYear());
        vehicle.setWeight(stVehicleEntity.getWeight());
        vehicle.setFuelTypes(stVehicleEntity.getFuelTypes());
        vehicle.setVehiclesColors(stVehicleEntity.getVehiclesColors());
        vehicle.setVehiclesType(stVehicleEntity.getVehiclesType());
        return Optional.of(stVehicleRepository.save(vehicle));
    }

    public Optional<StVehicleEntity> deleteVehicle(Long id){
        StVehicleEntity vehicle = stVehicleRepository.findByIdAndByStatus(id, 1L);
        vehicle.setStatus(0);
        return Optional.of(stVehicleRepository.save(vehicle));
    }
}
