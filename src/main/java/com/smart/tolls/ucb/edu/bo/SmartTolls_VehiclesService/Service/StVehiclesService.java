package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StVehiclesService {

    @Autowired
    private StVehicleRepository stVehicleRepository;

    public List<StVehicleEntity> getAllVehicles(){
        return stVehicleRepository.findAll();
    }

    public StVehicleEntity getVehiclesById(Long id){
        return stVehicleRepository.findById(id).get();
    }

    public StVehicleEntity createVehicle(StVehicleEntity stVehicleEntity){
        return stVehicleRepository.save(stVehicleEntity);
    }

    public StVehicleEntity updateVehicle(Long id, StVehicleEntity stVehicleEntity){
        StVehicleEntity vehicle = stVehicleRepository.findById(id).orElseThrow(()-> new RuntimeException("Vehicle was not found"));
        vehicle.setLicensePlate(stVehicleEntity.getLicensePlate());
        return stVehicleRepository.save(vehicle);
    }

    public void deleteVehicle(Long id){
        stVehicleRepository.deleteById(id);
    }

}
