package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "st_transactions")
public class StTransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_transaction_id")
    private Long transactionId;

    @Column(nullable = false)
    private Long tollId;

    @Column(nullable = false)
    private LocalDateTime transactionDate;

    @Column(nullable = false)
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "st_vehicle_id", nullable = false)
    private StVehicleEntity vehicle;

    @ManyToOne
    @JoinColumn(name = "st_wallet_id", nullable = false)
    private StWalletEntity wallet;

    @Embedded
    private Audit audit = new Audit();
}