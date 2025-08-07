package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StFuelTypesService;

import java.time.LocalDate;
import java.util.Optional;

import jakarta.ws.rs.core.MediaType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
class StFuelTypesControllerDiffblueTest {

    @Mock
    private StFuelTypesService stFuelTypesService;

    @InjectMocks
    private StFuelTypesController stFuelTypesController;

    @Test
    @DisplayName("Test getAllFuelTypes(); given StFuelTypesController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllFuelTypes_givenStFuelTypesController() {
        // Antes:
        // (new StFuelTypesController()).getAllFuelTypes();
        // Después:
        stFuelTypesController.getAllFuelTypes();
    }

    @Test
    @DisplayName("Test getAllFuelTypesByStatus(); given StFuelTypesController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllFuelTypesByStatus_givenStFuelTypesController() {
        // Antes:
        // (new StFuelTypesController()).getAllFuelTypesByStatus();
        // Después:
        stFuelTypesController.getAllFuelTypesByStatus();
    }

    @Test
    @DisplayName("Test getFuelTypesById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetFuelTypesById() {
        // Antes:
        // StFuelTypesController stFuelTypesController = new StFuelTypesController();
        // stFuelTypesController.stFuelTypesService = new StFuelTypesService();
        // ApiResponse<StFuelTypesEntity> actualFuelTypesById = stFuelTypesController.getFuelTypesById(1L);
        // Después:
        ApiResponse<StFuelTypesEntity> actualFuelTypesById = stFuelTypesController.getFuelTypesById(1L);

        assertEquals("", actualFuelTypesById.getError());
        assertEquals("Not Found", actualFuelTypesById.getMessage());
        assertNull(actualFuelTypesById.getData());
        assertEquals(404, actualFuelTypesById.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getFuelTypesById(Long); given StFuelTypesController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testGetFuelTypesById_givenStFuelTypesController() {
        // Antes:
        // ApiResponse<StFuelTypesEntity> actualFuelTypesById = (new StFuelTypesController()).getFuelTypesById(1L);
        // Después:
        ApiResponse<StFuelTypesEntity> actualFuelTypesById = stFuelTypesController.getFuelTypesById(1L);

        assertEquals("", actualFuelTypesById.getError());
        assertEquals("Not Found", actualFuelTypesById.getMessage());
        assertNull(actualFuelTypesById.getData());
        assertEquals(404, actualFuelTypesById.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createFuelTypes(StFuelTypesEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateFuelTypes() {
        // Antes:
        // StFuelTypesController stFuelTypesController = new StFuelTypesController();
        // ...
        // ApiResponse<Optional<StFuelTypesEntity>> actualCreateFuelTypesResult = stFuelTypesController.createFuelTypes(stFuelTypesEntity);
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);

        ApiResponse<Optional<StFuelTypesEntity>> actualCreateFuelTypesResult = stFuelTypesController.createFuelTypes(stFuelTypesEntity);

        assertEquals("", actualCreateFuelTypesResult.getError());
        assertEquals("Bad Request", actualCreateFuelTypesResult.getMessage());
        assertNull(actualCreateFuelTypesResult.getData());
        assertEquals(400, actualCreateFuelTypesResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createFuelTypes(StFuelTypesEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testCreateFuelTypes2() throws Exception {
        // Sin cambios, ya usa stFuelTypesController
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);
        String content = (new ObjectMapper()).writeValueAsString(stFuelTypesEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/fuelTypes/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        MockMvcBuilders.standaloneSetup(stFuelTypesController).build().perform(requestBuilder);
    }

    @Test
    @DisplayName("Test updateFuelType(Long, StFuelTypesEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateFuelType() {
        // Antes:
        // StFuelTypesController stFuelTypesController = new StFuelTypesController();
        // ...
        // ApiResponse<Optional<StFuelTypesEntity>> actualUpdateFuelTypeResult = stFuelTypesController.updateFuelType(1L, stFuelTypesEntity);
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);

        ApiResponse<Optional<StFuelTypesEntity>> actualUpdateFuelTypeResult = stFuelTypesController.updateFuelType(1L, stFuelTypesEntity);

        assertEquals("", actualUpdateFuelTypeResult.getError());
        assertEquals("Bad Request", actualUpdateFuelTypeResult.getMessage());
        assertNull(actualUpdateFuelTypeResult.getData());
        assertEquals(400, actualUpdateFuelTypeResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateFuelType(Long, StFuelTypesEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateFuelType2() throws Exception {
        // Sin cambios, ya usa stFuelTypesController
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);
        String content = (new ObjectMapper()).writeValueAsString(stFuelTypesEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/fuelTypes/update/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        MockMvcBuilders.standaloneSetup(stFuelTypesController).build().perform(requestBuilder);
    }

    @Test
    @DisplayName("Test deleteFuelType(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteFuelType() {
        // Antes:
        // StFuelTypesController stFuelTypesController = new StFuelTypesController();
        // stFuelTypesController.stFuelTypesService = new StFuelTypesService();
        // ApiResponse<Optional<StFuelTypesEntity>> actualDeleteFuelTypeResult = stFuelTypesController.deleteFuelType(1L);
        // Después:
        ApiResponse<Optional<StFuelTypesEntity>> actualDeleteFuelTypeResult = stFuelTypesController.deleteFuelType(1L);

        assertEquals("", actualDeleteFuelTypeResult.getError());
        assertEquals("Bad Request", actualDeleteFuelTypeResult.getMessage());
        assertNull(actualDeleteFuelTypeResult.getData());
        assertEquals(400, actualDeleteFuelTypeResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test deleteFuelType(Long); given StFuelTypesController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testDeleteFuelType_givenStFuelTypesController() {
        // Antes:
        // ApiResponse<Optional<StFuelTypesEntity>> actualDeleteFuelTypeResult = (new StFuelTypesController()).deleteFuelType(1L);
        // Después:
        ApiResponse<Optional<StFuelTypesEntity>> actualDeleteFuelTypeResult = stFuelTypesController.deleteFuelType(1L);

        assertEquals("", actualDeleteFuelTypeResult.getError());
        assertEquals("Bad Request", actualDeleteFuelTypeResult.getMessage());
        assertNull(actualDeleteFuelTypeResult.getData());
        assertEquals(400, actualDeleteFuelTypeResult.getStatus().intValue());
    }
}