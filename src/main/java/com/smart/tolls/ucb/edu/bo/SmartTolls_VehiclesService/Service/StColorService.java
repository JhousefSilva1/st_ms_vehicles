package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StColorService {

    @Autowired
    private StColorRepository stColorRepository;

    public List<StColorEntity> getAllColors(){
        return stColorRepository.findAll();
    }

    public List<StColorEntity> getAllColorsByStatus(){
        return stColorRepository.findAllByStatus();
    }

    public Optional<StColorEntity> getColorById(Long id){
        return Optional.of(stColorRepository.findByIdAndByStatus(id, 1L));
    }

    public Optional<StColorEntity> createColor(StColorEntity stColorEntity){
        return Optional.of(stColorRepository.save(stColorEntity));
    }

    public Optional<StColorEntity> updateColor(Long id, StColorEntity stColorEntity){
        StColorEntity color = stColorRepository.findByIdAndByStatus(id, 1L);
        color.setColorName(stColorEntity.getColorName());
        color.setColorDescription(stColorEntity.getColorDescription());
        return Optional.of(stColorRepository.save(color));
    }

    public Optional<StColorEntity> deleteColor(Long id){
        StColorEntity color = stColorRepository.findByIdAndByStatus(id, 1L);
        color.setStatus(0);
        return Optional.of(stColorRepository.save(color));
    }
}
