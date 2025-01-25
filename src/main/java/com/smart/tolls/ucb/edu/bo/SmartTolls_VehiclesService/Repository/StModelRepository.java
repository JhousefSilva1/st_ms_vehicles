package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StModelRepository  extends JpaRepository<StModelEntity, Long> {
    @Query("select b from StModelEntity b where b.status = 1 order by b.idModel asc")
    List<StModelEntity> findAllByStatus();

    @Query("select b from StModelEntity b where b.idModel=?1 and b.status=?2")
    StModelEntity findByIdAndByStatus(Long id, long status);

    @Query("select b from StModelEntity b where b.brand.idBrand=?1 and b.status=1")
    List<StModelEntity> findByBrandAndByStatus(Long id);
}
