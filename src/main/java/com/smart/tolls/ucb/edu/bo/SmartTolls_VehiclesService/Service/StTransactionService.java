package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Client.CountryCityClient;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.*;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.TransactionRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.TransactionResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StTransactionService {

    @Autowired
    private StTransactionRepository transactionRepository;

    @Autowired
    private StWalletRepository walletRepository;

    @Autowired
    private StVehicleRepository vehicleRepository;

    @Autowired
    private CountryCityClient countryCityClient; // Feign Client

    private static final double TOLL_FIXED_AMOUNT = 5.0;

    @Transactional
    public Optional<StTransactionEntity> processTransaction(TransactionRequest request) {
        // 1. Validar vehículo
        StVehicleEntity vehicle = vehicleRepository.findById(request.getVehicleId())
                .orElseThrow(() -> new RuntimeException("Vehículo no encontrado"));

        // 2. Validar wallet
        StWalletEntity wallet = walletRepository.findById(request.getWalletId())
                .filter(w -> w.getVehicle().getIdVehicle().equals(request.getVehicleId()))
                .orElseThrow(() -> new RuntimeException("Wallet no válida para este vehículo"));

        // 3. Validar peaje
        if (!countryCityClient.validateToll(request.getTollId())) {
            throw new RuntimeException("Peaje no válido");
        }

        // 4. Validar saldo
        if (wallet.getBalance() < TOLL_FIXED_AMOUNT) {
            throw new RuntimeException("Saldo insuficiente");
        }

        // 5. Actualizar saldo
        wallet.setBalance(wallet.getBalance() - TOLL_FIXED_AMOUNT);
        walletRepository.save(wallet);

        // 6. Crear transacción
        StTransactionEntity transaction = new StTransactionEntity();
        transaction.setTollId(request.getTollId());
        transaction.setTransactionDate(LocalDateTime.now());
        transaction.setAmount(TOLL_FIXED_AMOUNT);
        transaction.setVehicle(vehicle);
        transaction.setWallet(wallet);

        return Optional.of(transactionRepository.save(transaction));
    }

    public List<TransactionResponse> getTransactionsByVehicle(Long vehicleId, String dateFilter) {
        // Verificar si el vehículo existe
        if (!vehicleRepository.existsById(vehicleId)) {
            throw new RuntimeException("Vehículo no encontrado");
        }

        List<StTransactionEntity> transactions;

        if (dateFilter != null) {
            // Filtrar por fecha (ejemplo: "2023-11-20")
            LocalDate filterDate = LocalDate.parse(dateFilter);
            transactions = transactionRepository.findByVehicleIdAndDate(
                    vehicleId,
                    filterDate.atStartOfDay(),
                    filterDate.plusDays(1).atStartOfDay()
            );
        } else {
            // Obtener todas las transacciones
            transactions = transactionRepository.findByVehicle_IdVehicle(vehicleId);
        }

        return transactions.stream()
                .map(this::convertToTransactionResponse)
                .collect(Collectors.toList());
    }

    private TransactionResponse convertToTransactionResponse(StTransactionEntity entity) {
        TransactionResponse response = new TransactionResponse();
        response.setTransactionId(entity.getTransactionId());
        response.setTollId(entity.getTollId());
        response.setAmount(entity.getAmount());
        response.setTransactionDate(entity.getTransactionDate());

        // Obtener nombre del peaje (opcional - requiere Feign Client)


        return response;
    }
}