package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
    private Long transactionId;
    private Long tollId;
    private String tollName;
    private Double amount;
    private LocalDateTime transactionDate;

    // Opcional: Datos del vehículo
    private String licensePlate;
    private String vehicleType;
}