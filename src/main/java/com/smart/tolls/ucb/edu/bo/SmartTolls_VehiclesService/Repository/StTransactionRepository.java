package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StTransactionEntity;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface StTransactionRepository extends JpaRepository<StTransactionEntity, Long> {
    List<StTransactionEntity> findByVehicle_IdVehicle(Long vehicleId);
    List<StTransactionEntity> findByWallet_IdWallet(Long walletId);

    @Query("SELECT t FROM StTransactionEntity t WHERE t.vehicle.idVehicle = :vehicleId " +
            "AND t.transactionDate BETWEEN :startDate AND :endDate")
    List<StTransactionEntity> findByVehicleIdAndDate(
            @Param("vehicleId") Long vehicleId,
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate
    );
}