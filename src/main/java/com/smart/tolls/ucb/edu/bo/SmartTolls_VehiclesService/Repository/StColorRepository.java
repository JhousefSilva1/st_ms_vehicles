package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StColorRepository extends JpaRepository<StColorEntity, Long> {
    @Query("select b from StColorEntity b where b.status = 1 order by b.idColor asc")
    List<StColorEntity> findAllByStatus();

    @Query("select b from StColorEntity b where b.idColor=?1 and b.status=?2")
    StColorEntity findByIdAndByStatus(Long id, long status);
}
