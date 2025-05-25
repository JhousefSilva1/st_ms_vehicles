package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StTransactionEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.TransactionRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class StTransactionController {

    private final StTransactionService transactionService;

    @Autowired
    public StTransactionController(StTransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/process")
    public ApiResponse<StTransactionEntity> processTransaction(@RequestBody TransactionRequest request) {
        try {
            StTransactionEntity transaction = transactionService.processTransaction(request)
                    .orElseThrow(() -> new RuntimeException("No se pudo crear la transacción"));

            ApiResponse<StTransactionEntity> response = new ApiResponse<>();
            response.setStatus(HttpStatus.OK.value());
            response.setMessage("Transacción exitosa");
            response.setData(transaction);

            return response;
        } catch (Exception e) {
            ApiResponse<StTransactionEntity> response = new ApiResponse<>();
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage(e.getMessage());
            response.setData(null);

            return response;
        }
    }
}