package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StVehicleRepository extends JpaRepository<StVehicleEntity, Long> {
    @Query("select b from StVehicleEntity b where b.vehicleStatus = 1 order by b.idVehicle asc")
    List<StVehicleEntity> findAllByStatus();

    @Query("select b from StVehicleEntity b where b.idVehicle=?1 and b.vehicleStatus=?2")
    StVehicleEntity findByIdAndByStatus(Long id, long vehicleStatus);

//    findVehiclesByPersonId
    @Query("select b from StVehicleEntity b where b.idPerson=?1 and b.vehicleStatus=1")
    List<StVehicleEntity> findVehiclesByPersonId(Long id);



}
