package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StVehiclesTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StVehiclesTypeService {
    @Autowired
    private StVehiclesTypeRepository stVehiclesTypeRepository;

    public List<StVehicleTypeEntity> getAllTypeVehicle(){
        return stVehiclesTypeRepository.findAll();
    }

    public StVehicleTypeEntity getVehicleTypeById(Long id){
        return stVehiclesTypeRepository.findById(id).get();
    }

    public StVehicleTypeEntity createVehiclesType(StVehicleTypeEntity stVehicleTypeEntity){
        return stVehiclesTypeRepository.save(stVehicleTypeEntity);
    }

    public StVehicleTypeEntity updateVehiclesType (Long id, StVehicleTypeEntity stVehicleTypeEntity){
        StVehicleTypeEntity vehicleType = stVehiclesTypeRepository.findById(id).orElseThrow(()-> new RuntimeException("Vehicle Type was not found"));
        return stVehiclesTypeRepository.save(vehicleType);

    }
    public void deleteVehicleType(Long id){
        stVehiclesTypeRepository.deleteById(id);
    }
}
