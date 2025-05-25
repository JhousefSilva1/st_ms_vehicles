package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request;

import lombok.Data;

@Data
public class TransactionRequest {
    private Long vehicleId;
    private Long tollId;
    private Long walletId;
}