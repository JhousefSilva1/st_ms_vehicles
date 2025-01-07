package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StBrandRepository extends JpaRepository<StBrandEntity,Long>{
    @Query("select b from StBrandEntity b where b.status = 1 order by b.idBrand asc")
    List<StBrandEntity> findAllByStatus();

    @Query("select b from StBrandEntity b where b.idBrand=?1 and b.status=?2")
    StBrandEntity findByIdAndByStatus(Long id, long status);
}
