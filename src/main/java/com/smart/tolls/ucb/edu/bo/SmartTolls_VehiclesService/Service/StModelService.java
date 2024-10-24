package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StModelService {

    @Autowired
    private StModelRepository stModelRepository;

    public List<StModelEntity> getAllModels(){
        return stModelRepository.findAll();
    }

    public StModelEntity getModelsById(Long id){
        return stModelRepository.findById(id).get();
    }

    public StModelEntity createModels(StModelEntity stModelEntity){
        return stModelRepository.save(stModelEntity);
    }

    public StModelEntity updateModel(Long id, StModelEntity stModelEntity){
        StModelEntity model = stModelRepository.findById(id).orElseThrow(() -> new RuntimeException( "Model was not found"));
        model.setModelName(stModelEntity.getModelName());
        model.setModelDescription(stModelEntity.getModelDescription());
        return stModelRepository.save(model);
    }

    public void deleteModel(Long id){
        stModelRepository.deleteById(id);
    }
}
