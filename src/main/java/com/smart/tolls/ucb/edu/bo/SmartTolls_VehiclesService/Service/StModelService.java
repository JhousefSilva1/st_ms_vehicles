package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StModelService {

    @Autowired
    private StModelRepository stModelRepository;

    public List<StModelEntity> getAllModels(){
        return stModelRepository.findAll();
    }

    public List<StModelEntity> getAllModelsByStatus(){
        return stModelRepository.findAllByStatus();
    }

    public Optional<StModelEntity> getModelsById(Long id){
        return Optional.of(stModelRepository.findByIdAndByStatus(id, 1L));
    }

//    get brandId bay modelId
    public Optional<StModelEntity> getBrandIdByModelId(Long id){
        return Optional.ofNullable(stModelRepository.findBrandIdByModelId(id));
    }

    public List<StModelEntity> getModelsByBrandId(Long id){
        return stModelRepository.findByBrandAndByStatus(id);
    }

    public Optional<StModelEntity> createModels(StModelEntity stModelEntity){
        return Optional.of(stModelRepository.save(stModelEntity));
    }

    public Optional<StModelEntity> updateModel(Long id, StModelEntity stModelEntity){
        StModelEntity model = stModelRepository.findByIdAndByStatus(id, 1L);
        model.setModelName(stModelEntity.getModelName());
        model.setModelDescription(stModelEntity.getModelDescription());
        model.setBrand(stModelEntity.getBrand());
        return Optional.of(stModelRepository.save(model));
    }

    public Optional<StModelEntity> deleteModel(Long id){
        StModelEntity model = stModelRepository.findByIdAndByStatus(id, 1L);
        model.setStatus(0);
        return Optional.of(stModelRepository.save(model));
    }
}
