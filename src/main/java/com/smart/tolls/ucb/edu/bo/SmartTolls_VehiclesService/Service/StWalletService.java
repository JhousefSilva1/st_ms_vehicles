package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StWalletEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StWalletRepository;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Repository.StVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class StWalletService {

    @Autowired
    private StWalletRepository stWalletRepository;

    @Autowired
    private StVehicleRepository stVehicleRepository;

    public Optional<StWalletEntity> createWalletForVehicle(Long vehicleId) {
        Optional<StVehicleEntity> vehicleOpt = stVehicleRepository.findById(vehicleId);
        if (vehicleOpt.isEmpty()) {
            return Optional.empty();
        }

        StVehicleEntity vehicle = vehicleOpt.get();

        // Verificar si ya tiene wallet
        if (stWalletRepository.findByVehicle_IdVehicle(vehicleId).isPresent()) {
            return Optional.empty();
        }

        StWalletEntity wallet = new StWalletEntity();
        wallet.setBalance(0.0);
        wallet.setWalletNumber(generateCreditCardNumber());
        wallet.setWalletCVS(generateRandomCVS());
        wallet.setWalletName("SmartTolls UCB");
        wallet.setWalletBusiness("SmartTolls UCB");
        wallet.setVehicle(vehicle);

        return Optional.of(stWalletRepository.save(wallet));
    }

    public Optional<StWalletEntity> getWalletByVehicleId(Long vehicleId) {
        return stWalletRepository.findByVehicle_IdVehicle(vehicleId);
    }

    public Optional<StWalletEntity> updateWalletBalance(Long walletId, Double amount) {
        Optional<StWalletEntity> walletOpt = stWalletRepository.findById(walletId);
        if (walletOpt.isEmpty()) {
            return Optional.empty();
        }

        StWalletEntity wallet = walletOpt.get();
        wallet.setBalance(wallet.getBalance() + amount);
        return Optional.of(stWalletRepository.save(wallet));
    }

    private String generateRandomCVS() {
        return String.format("%03d", (int)(Math.random() * 1000));
    }

    private String generateCreditCardNumber() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        // Comenzar con 4 (Visa), 5 (Mastercard) o 6 (Discover)
        int firstDigit = 4 + random.nextInt(3); // 4, 5 o 6
        builder.append(firstDigit);

        // Generar los siguientes 14 dígitos
        for (int i = 0; i < 14; i++) {
            builder.append(random.nextInt(10));
        }

        // Calcular dígito de verificación (Luhn)
        String partialNumber = builder.toString();
        int checkDigit = calculateLuhnCheckDigit(partialNumber);
        builder.append(checkDigit);

        // Formatear con espacios cada 4 dígitos
        return formatCreditCardNumber(builder.toString());
    }

    private int calculateLuhnCheckDigit(String number) {
        int sum = 0;
        boolean alternate = false;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(number.charAt(i));

            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit = (digit % 10) + 1;
                }
            }

            sum += digit;
            alternate = !alternate;
        }

        return (10 - (sum % 10)) % 10;
    }

    private String formatCreditCardNumber(String number) {
        return number.replaceAll("(.{4})(?!$)", "$1 ");
    }
}