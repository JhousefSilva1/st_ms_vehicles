package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StWalletEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/wallets")
public class StWalletController extends ApiController {

    @Autowired
    private StWalletService stWalletService;

    @PostMapping("/vehicle/{vehicleId}")
    public ApiResponse<StWalletEntity> createWalletForVehicle(@PathVariable Long vehicleId) {
        ApiResponse<StWalletEntity> response = new ApiResponse<>();
        Optional<StWalletEntity> wallet = stWalletService.createWalletForVehicle(vehicleId);

        if (wallet.isEmpty()) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setMessage("No se pudo crear la wallet. Verifique que el vehículo exista y no tenga ya una wallet asignada.");
            return logApiResponse(response);
        }

        response.setData(wallet.get());
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("Wallet creada exitosamente");
        return logApiResponse(response);
    }

    @GetMapping("/vehicle/{vehicleId}")
    public ApiResponse<StWalletEntity> getWalletByVehicleId(@PathVariable Long vehicleId) {
        ApiResponse<StWalletEntity> response = new ApiResponse<>();
        Optional<StWalletEntity> wallet = stWalletService.getWalletByVehicleId(vehicleId);

        if (wallet.isEmpty()) {
            response.setStatus(HttpStatus.NOT_FOUND.value());
            response.setMessage("No se encontró wallet para el vehículo especificado");
            return logApiResponse(response);
        }

        response.setData(wallet.get());
        response.setStatus(HttpStatus.OK.value());
        response.setMessage(HttpStatus.OK.getReasonPhrase());
        return logApiResponse(response);
    }

    @PutMapping("/{walletId}/balance")
    public ApiResponse<StWalletEntity> updateWalletBalance(
            @PathVariable Long walletId,
            @RequestParam Double amount) {
        ApiResponse<StWalletEntity> response = new ApiResponse<>();
        Optional<StWalletEntity> wallet = stWalletService.updateWalletBalance(walletId, amount);

        if (wallet.isEmpty()) {
            response.setStatus(HttpStatus.NOT_FOUND.value());
            response.setMessage("No se encontró la wallet especificada");
            return logApiResponse(response);
        }

        response.setData(wallet.get());
        response.setStatus(HttpStatus.OK.value());
        response.setMessage("Balance actualizado exitosamente");
        return logApiResponse(response);
    }
}