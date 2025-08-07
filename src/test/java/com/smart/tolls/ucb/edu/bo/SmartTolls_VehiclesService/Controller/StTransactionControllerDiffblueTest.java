package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.*;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.TransactionRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.TransactionResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StTransactionService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

@ExtendWith(MockitoExtension.class)
class StTransactionControllerDiffblueTest {

    @Mock
    private StTransactionService stTransactionService;

    @InjectMocks
    private StTransactionController stTransactionController;

    @Test
    @DisplayName("Test processTransaction(TransactionRequest)")
    @Tag("MaintainedByDiffblue")
    void testProcessTransaction() {
        // Arrange
        TransactionRequest request = new TransactionRequest();
        request.setTollId(1L);
        request.setVehicleId(1L);
        request.setWalletId(1L);

        StTransactionEntity entity = new StTransactionEntity();
        entity.setTransactionId(1L);
        entity.setTollId(1L);
        entity.setAmount(10.0d);
        entity.setTransactionDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        // Puedes simular los objetos relacionados si tu controlador los serializa

        when(stTransactionService.processTransaction(request)).thenReturn(Optional.of(entity));

        // Act
        ApiResponse<StTransactionEntity> response = stTransactionController.processTransaction(request);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(entity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getTransactionsByVehicle(Long, String)")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByVehicle() {
        // Arrange
        when(stTransactionService.getTransactionsByVehicle(1L, "2020-03-01")).thenReturn(List.of());

        // Act
        ApiResponse<List<TransactionResponse>> response = stTransactionController.getTransactionsByVehicle(1L, "2020-03-01");

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(List.of(), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getAllTransactions(int, int, String)")
    @Tag("MaintainedByDiffblue")
    void testGetAllTransactions() {
        // Arrange
        Page<TransactionResponse> mockPage = null; // Puedes simular con un mock Page si lo necesitas
        when(stTransactionService.getAllTransactions(1, 3, "Sort By")).thenReturn(mockPage);

        // Act
        ApiResponse<Page<TransactionResponse>> response = stTransactionController.getAllTransactions(1, 3, "Sort By");

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(mockPage, response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getTransactionsByToll(Long, LocalDate, LocalDate)")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByToll() {
        // Arrange
        List<TransactionResponse> mockList = List.of();
        when(stTransactionService.getTransactionsByToll(1L, LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)))
                .thenReturn(mockList);

        // Act
        ApiResponse<List<TransactionResponse>> response = stTransactionController.getTransactionsByToll(1L,
                LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(mockList, response.getData());
        assertEquals(200, response.getStatus().intValue());
    }
}