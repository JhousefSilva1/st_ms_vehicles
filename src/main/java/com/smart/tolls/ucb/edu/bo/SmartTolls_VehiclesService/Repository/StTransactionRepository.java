package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StTransactionRepository extends JpaRepository<StTransactionEntity, Long> {
    List<StTransactionEntity> findByVehicle_IdVehicle(Long vehicleId);
    List<StTransactionEntity> findByWallet_IdWallet(Long walletId);
}