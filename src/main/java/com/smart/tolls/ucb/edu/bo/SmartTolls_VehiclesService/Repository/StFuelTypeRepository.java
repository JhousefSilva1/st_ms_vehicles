package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StFuelTypeRepository extends JpaRepository<StFuelTypesEntity, Long> {
    @Query("select b from StFuelTypesEntity b where b.status = 1 order by b.idFuelType asc")
    List<StFuelTypesEntity> findAllByStatus();

    @Query("select b from StFuelTypesEntity b where b.idFuelType=?1 and b.status=?2")
    StFuelTypesEntity findByIdAndByStatus(Long id, long status);
}
