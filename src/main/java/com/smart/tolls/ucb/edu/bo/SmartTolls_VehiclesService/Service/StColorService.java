package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StColorService {

    @Autowired
    private StColorRepository stColorRepository;

    public List<StColorEntity>getAllColors(){
        return stColorRepository.findAll();
    }

    public StColorEntity getColorById(Long id){
        return stColorRepository.findById(id).get();
    }

    public StColorEntity createColor(StColorEntity stColorEntity){
        return stColorRepository.save(stColorEntity);
    }

    public StColorEntity updateColor(Long id, StColorEntity stColorEntity){
        StColorEntity color = stColorRepository.findById(id).orElseThrow(() -> new RuntimeException("Color not Found"));
        color.setColorName(stColorEntity.getColorName());
        return stColorRepository.save(color);
    }

    public void deleteColor(Long id){
        stColorRepository.deleteById(id);
    }
}
