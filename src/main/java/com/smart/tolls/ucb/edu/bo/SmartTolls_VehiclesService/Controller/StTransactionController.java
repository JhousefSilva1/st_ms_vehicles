package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StTransactionEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.TransactionRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.TransactionResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

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

//    get transaction by vehicleId
@GetMapping("/vehicle/{vehicleId}")
public ApiResponse<List<TransactionResponse>> getTransactionsByVehicle(
        @PathVariable Long vehicleId,
        @RequestParam(required = false) String dateFilter) {

    ApiResponse<List<TransactionResponse>> response = new ApiResponse<>();
    try {
        List<TransactionResponse> transactions = transactionService.getTransactionsByVehicle(vehicleId, dateFilter);

        response.setStatus(HttpStatus.OK.value());
        response.setMessage(transactions.isEmpty() ? "No se encontraron transacciones" : "Transacciones encontradas");
        response.setData(transactions);

    } catch (Exception e) {
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setMessage("Error al obtener transacciones: " + e.getMessage());
    }
        return response;
    }
    @GetMapping
    public ApiResponse<Page<TransactionResponse>> getAllTransactions(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String sortBy) {

        ApiResponse<Page<TransactionResponse>> response = new ApiResponse<>();
        try {
            Page<TransactionResponse> transactions = transactionService.getAllTransactions(page, size, sortBy);

            response.setStatus(HttpStatus.OK.value());
            response.setMessage("Transacciones obtenidas");
            response.setData(transactions);

        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("Error al obtener transacciones: " + e.getMessage());
        }
        return response;
    }

    @GetMapping("/toll/{tollId}")
    public ApiResponse<List<TransactionResponse>> getTransactionsByToll(
            @PathVariable Long tollId,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        ApiResponse<List<TransactionResponse>> response = new ApiResponse<>();
        try {
            List<TransactionResponse> transactions = transactionService.getTransactionsByToll(tollId, startDate, endDate);

            response.setStatus(HttpStatus.OK.value());
            response.setMessage(transactions.isEmpty() ? "No se encontraron transacciones" : "Transacciones encontradas");
            response.setData(transactions);

        } catch (Exception e) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("Error al obtener transacciones: " + e.getMessage());
        }
        return response;
    }
}