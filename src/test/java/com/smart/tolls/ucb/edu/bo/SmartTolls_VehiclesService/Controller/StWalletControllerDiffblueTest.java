package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.*;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StWalletService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StWalletControllerDiffblueTest {

    @Mock
    private StWalletService stWalletService;

    @InjectMocks
    private StWalletController stWalletController;

    @Test
    @DisplayName("Test createWalletForVehicle(Long)")
    @Tag("MaintainedByDiffblue")
    void testCreateWalletForVehicle() {
        // Arrange
        Audit audit = new Audit();
        audit.setAction("Action");
        audit.setCreateBy("Create By");
        audit.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit.setCurrentValue("42");
        audit.setDeleteBy("Delete By");
        audit.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit.setIpAddress("42 Main St");
        audit.setPreviousValue("42");
        audit.setRecordVersion(1);
        audit.setUpdateBy("2020-03-01");
        audit.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StWalletEntity stWalletEntity = new StWalletEntity();
        stWalletEntity.setAudit(audit);
        stWalletEntity.setIdWallet(1L);
        stWalletEntity.setBalance(10.0d);

        when(stWalletService.createWalletForVehicle(1L)).thenReturn(Optional.of(stWalletEntity));

        // Act
        var response = stWalletController.createWalletForVehicle(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stWalletEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getWalletByVehicleId(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetWalletByVehicleId() {
        // Arrange
        StWalletEntity stWalletEntity = new StWalletEntity();
        stWalletEntity.setIdWallet(1L);

        when(stWalletService.getWalletByVehicleId(1L)).thenReturn(Optional.of(stWalletEntity));

        // Act
        var response = stWalletController.getWalletByVehicleId(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stWalletEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateWalletBalance(Long, Map)")
    @Tag("MaintainedByDiffblue")
    void testUpdateWalletBalance() {
        // Arrange
        Long walletId = 1L;
        Map<String, Double> payload = new HashMap<>();
        payload.put("amount", 15.5);
        StWalletEntity stWalletEntity = new StWalletEntity();
        stWalletEntity.setIdWallet(walletId);
        stWalletEntity.setBalance(25.5);

        when(stWalletService.updateWalletBalance(walletId, 15.5)).thenReturn(Optional.of(stWalletEntity));

        // Act
        var response = stWalletController.updateWalletBalance(walletId, payload);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stWalletEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }
}