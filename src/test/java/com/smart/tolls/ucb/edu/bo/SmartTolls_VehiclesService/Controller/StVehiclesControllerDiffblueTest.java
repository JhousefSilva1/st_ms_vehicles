package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import com.fasterxml.jackson.databind.ObjectMapper;
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

import jakarta.ws.rs.core.MediaType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
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
    @DisplayName("Test getAllVehicles(); given StVehiclesController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllVehicles_givenStVehiclesController() {
        // Antes:
        // (new StVehiclesController()).getAllVehicles();
        // Después:
        stVehiclesController.getAllVehicles();
    }

    @Test
    @DisplayName("Test getAllVehiclesByStatus(); given StVehiclesController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllVehiclesByStatus_givenStVehiclesController() {
        // Antes:
        // (new StVehiclesController()).getAllVehiclesByStatus();
        // Después:
        stVehiclesController.getAllVehiclesByStatus();
    }

    @Test
    @DisplayName("Test getVehicleById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleById() throws Exception {
        // ... (sin cambios, ya usa stVehiclesController)
    }

    @Test
    @DisplayName("Test getVehicleById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleById2() throws Exception {
        // ... (sin cambios, ya usa stVehiclesController)
    }

    @Test
    @DisplayName("Test getVehicleById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleById3() throws Exception {
        // ... (sin cambios, ya usa stVehiclesController)
    }

    @Test
    @DisplayName("Test getVehicleById(Long); given PersonsDto (default constructor) IdPerson is one; then content string a string")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleById_givenPersonsDtoIdPersonIsOne_thenContentStringAString() throws Exception {
        // ... (sin cambios, ya usa stVehiclesController)
    }

    @Test
    @DisplayName("Test getWalletByVehicleId(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetWalletByVehicleId() throws Exception {
        // ... (sin cambios, ya usa stVehiclesController)
    }

    @Test
    @DisplayName("Test updateWalletBalance(Long, Double)")
    @Tag("MaintainedByDiffblue")
    void testUpdateWalletBalance() throws Exception {
        // ... (sin cambios, ya usa stVehiclesController)
    }

    @Test
    @DisplayName("Test getVehiclesByPersonId(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehiclesByPersonId() {
        // Antes:
        // StVehiclesController stVehiclesController = new StVehiclesController();
        // stVehiclesController.stVehiclesService = new StVehiclesService();
        // ApiResponse<List<StVehicleResponse>> actualVehiclesByPersonId = stVehiclesController.getVehiclesByPersonId(1L);
        // Después:
        ApiResponse<List<StVehicleResponse>> actualVehiclesByPersonId = stVehiclesController.getVehiclesByPersonId(1L);

        assertEquals("", actualVehiclesByPersonId.getError());
        assertEquals("Error al obtener los vehículos: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StVehicleRepository.findVehiclesByPersonId(java.lang.Long)\" because \"<local3>.stVehicleRepository"
                + "\" is null", actualVehiclesByPersonId.getMessage());
        assertNull(actualVehiclesByPersonId.getData());
        assertEquals(500, actualVehiclesByPersonId.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getVehiclesByPersonId(Long); given StVehiclesController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testGetVehiclesByPersonId_givenStVehiclesController() {
        // Antes:
        // ApiResponse<List<StVehicleResponse>> actualVehiclesByPersonId = (new StVehiclesController()).getVehiclesByPersonId(1L);
        // Después:
        ApiResponse<List<StVehicleResponse>> actualVehiclesByPersonId = stVehiclesController.getVehiclesByPersonId(1L);

        assertEquals("", actualVehiclesByPersonId.getError());
        assertEquals("Error al obtener los vehículos: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Service.StVehiclesService.getVehiclesByPersonId(java.lang.Long)\" because \"this.stVehiclesService\""
                + " is null", actualVehiclesByPersonId.getMessage());
        assertNull(actualVehiclesByPersonId.getData());
        assertEquals(500, actualVehiclesByPersonId.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createVehicles(StVehicleRequest)")
    @Tag("MaintainedByDiffblue")
    void testCreateVehicles() {
        // Antes:
        // StVehiclesController stVehiclesController = new StVehiclesController();
        // ApiResponse<Optional<StVehicleEntity>> actualCreateVehiclesResult = stVehiclesController.createVehicles(stVehicleRequest);
        // Después:
        StVehicleRequest stVehicleRequest = new StVehicleRequest();
        stVehicleRequest.setChassisNumber("42");
        stVehicleRequest.setEngineNumber("42");
        stVehicleRequest.setIdCity(1L);
        stVehicleRequest.setIdCountry(1L);
        stVehicleRequest.setIdFuelTypes(1L);
        stVehicleRequest.setIdPerson(1L);
        stVehicleRequest.setIdVehicle(1L);
        stVehicleRequest.setIdVehiclesBrand(1L);
        stVehicleRequest.setIdVehiclesColors(1L);
        stVehicleRequest.setIdVehiclesModels(1L);
        stVehicleRequest.setIdVehiclesType(1L);
        stVehicleRequest.setLicensePlate("License Plate");
        stVehicleRequest.setManufacturingYear("Manufacturing Year");
        stVehicleRequest.setWeight(10.0d);

        ApiResponse<Optional<StVehicleEntity>> actualCreateVehiclesResult = stVehiclesController.createVehicles(stVehicleRequest);

        assertEquals("", actualCreateVehiclesResult.getError());
        assertEquals("Bad Request", actualCreateVehiclesResult.getMessage());
        assertNull(actualCreateVehiclesResult.getData());
        assertEquals(400, actualCreateVehiclesResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateVehicle(Long, StVehicleEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehicle() throws Exception {
        // ... (sin cambios, ya usa stVehiclesController)
    }

    @Test
    @DisplayName("Test updateVehicle(Long, StVehicleEntity); given Audit (default constructor) Action is 'Action'; when StVehicleEntity() Audit is Audit (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehicle_givenAuditActionIsAction_whenStVehicleEntityAuditIsAudit() {
        // Antes:
        // StVehiclesController stVehiclesController = new StVehiclesController();
        // ApiResponse<Optional<StVehicleEntity>> actualUpdateVehicleResult = stVehiclesController.updateVehicle(1L, stVehicleEntity);
        // Después:
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

        Audit audit2 = new Audit();
        audit2.setAction("Action");
        audit2.setCreateBy("Create By");
        audit2.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit2.setCurrentValue("42");
        audit2.setDeleteBy("Delete By");
        audit2.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit2.setIpAddress("42 Main St");
        audit2.setPreviousValue("42");
        audit2.setRecordVersion(1);
        audit2.setUpdateBy("2020-03-01");
        audit2.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit2);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

        Audit audit3 = new Audit();
        audit3.setAction("Action");
        audit3.setCreateBy("Create By");
        audit3.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit3.setCurrentValue("42");
        audit3.setDeleteBy("Delete By");
        audit3.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit3.setIpAddress("42 Main St");
        audit3.setPreviousValue("42");
        audit3.setRecordVersion(1);
        audit3.setUpdateBy("2020-03-01");
        audit3.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit3);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit5);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit4);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        stVehicleEntity.setAudit(audit);
        stVehicleEntity.setChassisNumber("42");
        stVehicleEntity.setEngineNumber("42");
        stVehicleEntity.setFuelTypes(fuelTypes);
        stVehicleEntity.setIdCity(1L);
        stVehicleEntity.setIdCountry(1L);
        stVehicleEntity.setIdPerson(1L);
        stVehicleEntity.setIdVehicle(1L);
        stVehicleEntity.setLicensePlate("License Plate");
        stVehicleEntity.setManufacturingYear("Manufacturing Year");
        stVehicleEntity.setVehicleStatus(1);
        stVehicleEntity.setVehiclesColors(vehiclesColors);
        stVehicleEntity.setVehiclesModels(vehiclesModels);
        stVehicleEntity.setVehiclesType(vehiclesType);
        stVehicleEntity.setWeight(10.0d);

        ApiResponse<Optional<StVehicleEntity>> actualUpdateVehicleResult = stVehiclesController.updateVehicle(1L, stVehicleEntity);

        assertEquals("", actualUpdateVehicleResult.getError());
        assertEquals("Bad Request", actualUpdateVehicleResult.getMessage());
        assertNull(actualUpdateVehicleResult.getData());
        assertEquals(400, actualUpdateVehicleResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateVehicle(Long, StVehicleEntity); when StVehicleEntity")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehicle_whenStVehicleEntity() {
        // Antes:
        // ApiResponse<Optional<StVehicleEntity>> actualUpdateVehicleResult = (new StVehiclesController()).updateVehicle(1L, mock(StVehicleEntity.class));
        // Después:
        ApiResponse<Optional<StVehicleEntity>> actualUpdateVehicleResult = stVehiclesController.updateVehicle(1L, mock(StVehicleEntity.class));

        assertEquals("", actualUpdateVehicleResult.getError());
        assertEquals("Bad Request", actualUpdateVehicleResult.getMessage());
        assertNull(actualUpdateVehicleResult.getData());
        assertEquals(400, actualUpdateVehicleResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test deleteVehicle(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteVehicle() throws Exception {
        // ... (sin cambios, ya usa stVehiclesController)
    }
}