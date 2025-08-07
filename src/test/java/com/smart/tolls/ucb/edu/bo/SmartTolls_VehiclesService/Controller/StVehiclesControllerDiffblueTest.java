package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Client.CountryCityClient;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Client.PersonsClient;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CityDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CountryDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.PersonsDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.*;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.StVehicleRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.StVehicleResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StVehiclesControllerDiffblueTest {

    @Mock
    private CountryCityClient countryCityClient;

    @Mock
    private PersonsClient personsClient;

    @Mock
    private StColorService stColorService;

    @Mock
    private StFuelTypesService stFuelTypesService;

    @Mock
    private StModelService stModelService;

    @Mock
    private StVehiclesService stVehiclesService;

    @Mock
    private StVehiclesTypeService stVehiclesTypeService;

    @Mock
    private StWalletService stWalletService;

    @InjectMocks
    private StVehiclesController stVehiclesController;

    @Test
    @DisplayName("Test getVehicleById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleById() throws Exception {
        // Arrange
        CityDto cityDto = new CityDto();
        cityDto.setCityName("Oxford");
        cityDto.setIdCity(1L);

        ApiResponse<CityDto> apiResponse = new ApiResponse<>();
        apiResponse.setData(cityDto);
        apiResponse.setError("An error occurred");
        apiResponse.setMessage("Not all who wander are lost");
        apiResponse.setStatus(1);
        apiResponse.setUuid("uuid");
        when(countryCityClient.getCityById(Mockito.<Long>any())).thenReturn(apiResponse);

        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        Optional<StVehicleEntity> ofResult = Optional.of(stVehicleEntity);
        when(stVehiclesService.getVehiclesById(Mockito.<Long>any())).thenReturn(ofResult);

        // Act
        ApiResponse<StVehicleResponse> response = stVehiclesController.getVehicleById(1L);

        // Assert
        assertEquals("", response.getError());
        // Aquí puedes ajustar el assert del mensaje según tu lógica real
        assertNull(response.getData()); // O ajusta según la lógica de tu controlador
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
        ApiResponse<StWalletEntity> response = stVehiclesController.getWalletByVehicleId(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stWalletEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateWalletBalance(Long, Double)")
    @Tag("MaintainedByDiffblue")
    void testUpdateWalletBalance() {
        // Arrange
        StWalletEntity stWalletEntity = new StWalletEntity();
        stWalletEntity.setIdWallet(1L);
        when(stWalletService.updateWalletBalance(1L, 10.0)).thenReturn(Optional.of(stWalletEntity));
        when(stWalletService.getWalletByVehicleId(1L)).thenReturn(Optional.of(stWalletEntity));

        // Act
        ApiResponse<StWalletEntity> response = stVehiclesController.updateWalletBalance(1L, 10.0);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stWalletEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createVehicles(StVehicleRequest)")
    @Tag("MaintainedByDiffblue")
    void testCreateVehicles() {
        // Arrange
        StVehicleRequest stVehicleRequest = new StVehicleRequest();
        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        when(stVehiclesService.createVehicle(Mockito.any())).thenReturn(Optional.of(stVehicleEntity));
        // Act
        ApiResponse<Optional<StVehicleEntity>> response = stVehiclesController.createVehicles(stVehicleRequest);
        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stVehicleEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateVehicle(Long, StVehicleEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehicle() {
        // Arrange
        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        when(stVehiclesService.updateVehicle(1L, stVehicleEntity)).thenReturn(Optional.of(stVehicleEntity));

        // Act
        ApiResponse<Optional<StVehicleEntity>> response = stVehiclesController.updateVehicle(1L, stVehicleEntity);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stVehicleEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test deleteVehicle(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteVehicle() {
        // Arrange
        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        when(stVehiclesService.deleteVehicle(1L)).thenReturn(Optional.of(stVehicleEntity));

        // Act
        ApiResponse<Optional<StVehicleEntity>> response = stVehiclesController.deleteVehicle(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stVehicleEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }
}