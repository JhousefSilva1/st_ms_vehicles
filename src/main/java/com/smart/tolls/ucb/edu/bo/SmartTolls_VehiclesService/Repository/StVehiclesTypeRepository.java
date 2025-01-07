package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StVehiclesTypeRepository extends JpaRepository<StVehicleTypeEntity, Long> {
    @Query("select b from StVehicleTypeEntity b where b.status = 1 order by b.idVehiclesType asc")
    List<StVehicleTypeEntity> findAllByStatus();

    @Query("select b from StVehicleTypeEntity b where b.idVehiclesType=?1 and b.status=?2")
    StVehicleTypeEntity findByIdAndByStatus(Long id, long status);
}
