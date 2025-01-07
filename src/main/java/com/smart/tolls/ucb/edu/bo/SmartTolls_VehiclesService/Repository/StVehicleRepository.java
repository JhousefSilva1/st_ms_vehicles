package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StVehicleRepository extends JpaRepository<StVehicleEntity, Long> {
    @Query("select b from StVehicleEntity b where b.status = 1 order by b.idVehicle asc")
    List<StVehicleEntity> findAllByStatus();

    @Query("select b from StVehicleEntity b where b.idVehicle=?1 and b.status=?2")
    StVehicleEntity findByIdAndByStatus(Long id, long status);
}
