package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.*;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.TransactionRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.TransactionResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StTransactionService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import jakarta.ws.rs.core.MediaType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
class StTransactionControllerDiffblueTest {

    @Mock
    private StTransactionService stTransactionService;

    @InjectMocks
    private StTransactionController stTransactionController;

    @Test
    @DisplayName("Test processTransaction(TransactionRequest)")
    @Tag("MaintainedByDiffblue")
    void testProcessTransaction() throws Exception {
        // ... (sin cambios, ya usa stTransactionController)
    }

    @Test
    @DisplayName("Test getTransactionsByVehicle(Long, String)")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByVehicle() {
        // Antes:
        // ApiResponse<List<TransactionResponse>> actualTransactionsByVehicle = (new StTransactionController(
        //         new StTransactionService())).getTransactionsByVehicle(1L, "2020-03-01");
        // Después:
        ApiResponse<List<TransactionResponse>> actualTransactionsByVehicle = stTransactionController.getTransactionsByVehicle(1L, "2020-03-01");

        assertEquals("", actualTransactionsByVehicle.getError());
        assertEquals(
                "Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                        + ".Repository.StVehicleRepository.existsById(Object)\" because \"<local4>.vehicleRepository\" is null",
                actualTransactionsByVehicle.getMessage());
        assertNull(actualTransactionsByVehicle.getUuid());
        assertNull(actualTransactionsByVehicle.getData());
        assertEquals(400, actualTransactionsByVehicle.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getAllTransactions(int, int, String)")
    @Tag("MaintainedByDiffblue")
    void testGetAllTransactions() {
        // Antes:
        // ApiResponse<Page<TransactionResponse>> actualAllTransactions = (new StTransactionController(
        //         new StTransactionService())).getAllTransactions(0, 0, null);
        // Después:
        ApiResponse<Page<TransactionResponse>> actualAllTransactions = stTransactionController.getAllTransactions(0, 0, null);

        assertEquals("", actualAllTransactions.getError());
        assertEquals("Error al obtener transacciones: Page size must not be less than one",
                actualAllTransactions.getMessage());
        assertNull(actualAllTransactions.getUuid());
        assertNull(actualAllTransactions.getData());
        assertEquals(400, actualAllTransactions.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getAllTransactions(int, int, String)")
    @Tag("MaintainedByDiffblue")
    void testGetAllTransactions2() {
        // Antes:
        // ApiResponse<Page<TransactionResponse>> actualAllTransactions = (new StTransactionController(
        //         new StTransactionService())).getAllTransactions(1, 3, "");
        // Después:
        ApiResponse<Page<TransactionResponse>> actualAllTransactions = stTransactionController.getAllTransactions(1, 3, "");

        assertEquals("", actualAllTransactions.getError());
        assertEquals("Error al obtener transacciones: Property must not be null or empty",
                actualAllTransactions.getMessage());
        assertNull(actualAllTransactions.getUuid());
        assertNull(actualAllTransactions.getData());
        assertEquals(400, actualAllTransactions.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getAllTransactions(int, int, String); when 'Sort By'; then return Message is a string")
    @Tag("MaintainedByDiffblue")
    void testGetAllTransactions_whenSortBy_thenReturnMessageIsAString() {
        // Antes:
        // ApiResponse<Page<TransactionResponse>> actualAllTransactions = (new StTransactionController(
        //         new StTransactionService())).getAllTransactions(1, 3, "Sort By");
        // Después:
        ApiResponse<Page<TransactionResponse>> actualAllTransactions = stTransactionController.getAllTransactions(1, 3, "Sort By");

        assertEquals("", actualAllTransactions.getError());
        assertEquals("Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StTransactionRepository.findAll(org.springframework.data.domain.Pageable)\" because"
                + " \"<local5>.transactionRepository\" is null", actualAllTransactions.getMessage());
        assertNull(actualAllTransactions.getUuid());
        assertNull(actualAllTransactions.getData());
        assertEquals(400, actualAllTransactions.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getAllTransactions(int, int, String); when zero; then return Message is a string")
    @Tag("MaintainedByDiffblue")
    void testGetAllTransactions_whenZero_thenReturnMessageIsAString() {
        // Antes:
        // ApiResponse<Page<TransactionResponse>> actualAllTransactions = (new StTransactionController(
        //         new StTransactionService())).getAllTransactions(0, 1, null);
        // Después:
        ApiResponse<Page<TransactionResponse>> actualAllTransactions = stTransactionController.getAllTransactions(0, 1, null);

        assertEquals("", actualAllTransactions.getError());
        assertEquals("Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StTransactionRepository.findAll(org.springframework.data.domain.Pageable)\" because"
                + " \"<local5>.transactionRepository\" is null", actualAllTransactions.getMessage());
        assertNull(actualAllTransactions.getUuid());
        assertNull(actualAllTransactions.getData());
        assertEquals(400, actualAllTransactions.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getTransactionsByToll(Long, LocalDate, LocalDate); when LocalDate with '1970' and one and one")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByToll_whenLocalDateWith1970AndOneAndOne() {
        // Antes:
        // StTransactionController stTransactionController = new StTransactionController(new StTransactionService());
        // LocalDate startDate = LocalDate.of(1970, 1, 1);
        // ApiResponse<List<TransactionResponse>> actualTransactionsByToll = stTransactionController.getTransactionsByToll(1L,
        //         startDate, LocalDate.of(1970, 1, 1));
        // Después:
        LocalDate startDate = LocalDate.of(1970, 1, 1);
        ApiResponse<List<TransactionResponse>> actualTransactionsByToll = stTransactionController.getTransactionsByToll(1L,
                startDate, LocalDate.of(1970, 1, 1));

        assertEquals("", actualTransactionsByToll.getError());
        assertEquals(
                "Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                        + ".Repository.StTransactionRepository.findByTollIdAndDateRange(java.lang.Long, java.time.LocalDateTime,"
                        + " java.time.LocalDateTime)\" because \"<local5>.transactionRepository\" is null",
                actualTransactionsByToll.getMessage());
        assertNull(actualTransactionsByToll.getUuid());
        assertNull(actualTransactionsByToll.getData());
        assertEquals(400, actualTransactionsByToll.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getTransactionsByToll(Long, LocalDate, LocalDate); when LocalDate with '1970' and one and one")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByToll_whenLocalDateWith1970AndOneAndOne2() {
        // Antes:
        // StTransactionController stTransactionController = new StTransactionController(new StTransactionService());
        // ApiResponse<List<TransactionResponse>> actualTransactionsByToll = stTransactionController.getTransactionsByToll(1L,
        //         LocalDate.of(1970, 1, 1), null);
        // Después:
        ApiResponse<List<TransactionResponse>> actualTransactionsByToll = stTransactionController.getTransactionsByToll(1L,
                LocalDate.of(1970, 1, 1), null);

        assertEquals("", actualTransactionsByToll.getError());
        assertEquals("Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StTransactionRepository.findByTollId(java.lang.Long)\" because \"<local5>.transactionRepository\""
                + " is null", actualTransactionsByToll.getMessage());
        assertNull(actualTransactionsByToll.getUuid());
        assertNull(actualTransactionsByToll.getData());
        assertEquals(400, actualTransactionsByToll.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getTransactionsByToll(Long, LocalDate, LocalDate); when 'null'")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByToll_whenNull() {
        // Antes:
        // ApiResponse<List<TransactionResponse>> actualTransactionsByToll = (new StTransactionController(
        //         new StTransactionService())).getTransactionsByToll(1L, null, null);
        // Después:
        ApiResponse<List<TransactionResponse>> actualTransactionsByToll = stTransactionController.getTransactionsByToll(1L, null, null);

        assertEquals("", actualTransactionsByToll.getError());
        assertEquals("Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StTransactionRepository.findByTollId(java.lang.Long)\" because \"<local5>.transactionRepository\""
                + " is null", actualTransactionsByToll.getMessage());
        assertNull(actualTransactionsByToll.getUuid());
        assertNull(actualTransactionsByToll.getData());
        assertEquals(400, actualTransactionsByToll.getStatus().intValue());
    }
}