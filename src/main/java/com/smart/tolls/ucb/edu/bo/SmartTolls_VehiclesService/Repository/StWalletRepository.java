package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StWalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StWalletRepository extends JpaRepository<StWalletEntity, Long> {
    Optional<StWalletEntity> findByVehicle_IdVehicle(Long vehicleId);
}