package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StVehiclesTypeService;

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
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
@ExtendWith(MockitoExtension.class)
class StVehicleTypeControllerDiffblueTest {

    @Mock
    private StVehiclesTypeService stVehiclesTypeService;

    @InjectMocks
    private StVehicleTypeController stVehicleTypeController;

    @Test
    @DisplayName("Test getAllTypeVehicle(); given StVehicleTypeController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllTypeVehicle_givenStVehicleTypeController() {
        // Antes:
        // (new StVehicleTypeController()).getAllTypeVehicle();
        // Después:
        stVehicleTypeController.getAllTypeVehicle();
    }

    @Test
    @DisplayName("Test getAllTypeVehicleByStatus(); given StVehicleTypeController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllTypeVehicleByStatus_givenStVehicleTypeController() {
        // Antes:
        // (new StVehicleTypeController()).getAllTypeVehicleByStatus();
        // Después:
        stVehicleTypeController.getAllTypeVehicleByStatus();
    }

    @Test
    @DisplayName("Test getVehicleTypeById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleTypeById() {
        // Antes:
        // StVehicleTypeController stVehicleTypeController = new StVehicleTypeController();
        // stVehicleTypeController.stVehiclesTypeService = new StVehiclesTypeService();
        // ApiResponse<StVehicleTypeEntity> actualVehicleTypeById = stVehicleTypeController.getVehicleTypeById(1L);
        // Después:
        ApiResponse<StVehicleTypeEntity> actualVehicleTypeById = stVehicleTypeController.getVehicleTypeById(1L);

        assertEquals("", actualVehicleTypeById.getError());
        assertEquals("Not Found", actualVehicleTypeById.getMessage());
        assertNull(actualVehicleTypeById.getData());
        assertEquals(404, actualVehicleTypeById.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getVehicleTypeById(Long); given StVehicleTypeController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleTypeById_givenStVehicleTypeController() {
        // Antes:
        // ApiResponse<StVehicleTypeEntity> actualVehicleTypeById = (new StVehicleTypeController()).getVehicleTypeById(1L);
        // Después:
        ApiResponse<StVehicleTypeEntity> actualVehicleTypeById = stVehicleTypeController.getVehicleTypeById(1L);

        assertEquals("", actualVehicleTypeById.getError());
        assertEquals("Not Found", actualVehicleTypeById.getMessage());
        assertNull(actualVehicleTypeById.getData());
        assertEquals(404, actualVehicleTypeById.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createVehiclesType(StVehicleTypeEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateVehiclesType() {
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");

        // Antes:
        // StVehicleTypeController stVehicleTypeController = new StVehicleTypeController();
        // ApiResponse<Optional<StVehicleTypeEntity>> actualCreateVehiclesTypeResult = stVehicleTypeController.createVehiclesType(stVehicleTypeEntity);
        // Después:
        ApiResponse<Optional<StVehicleTypeEntity>> actualCreateVehiclesTypeResult = stVehicleTypeController.createVehiclesType(stVehicleTypeEntity);

        assertEquals("", actualCreateVehiclesTypeResult.getError());
        assertEquals("Bad Request", actualCreateVehiclesTypeResult.getMessage());
        assertNull(actualCreateVehiclesTypeResult.getData());
        assertEquals(400, actualCreateVehiclesTypeResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createVehiclesType(StVehicleTypeEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testCreateVehiclesType2() throws Exception {
        // Sin cambios, ya usa stVehicleTypeController
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");
        String content = (new ObjectMapper()).writeValueAsString(stVehicleTypeEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/vehicleType/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        MockMvcBuilders.standaloneSetup(stVehicleTypeController).build().perform(requestBuilder);
    }

    @Test
    @DisplayName("Test updateVehiclesType(Long, StVehicleTypeEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehiclesType() {
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");

        // Antes:
        // StVehicleTypeController stVehicleTypeController = new StVehicleTypeController();
        // ApiResponse<Optional<StVehicleTypeEntity>> actualUpdateVehiclesTypeResult = stVehicleTypeController.updateVehiclesType(1L, stVehicleTypeEntity);
        // Después:
        ApiResponse<Optional<StVehicleTypeEntity>> actualUpdateVehiclesTypeResult = stVehicleTypeController.updateVehiclesType(1L, stVehicleTypeEntity);

        assertEquals("", actualUpdateVehiclesTypeResult.getError());
        assertEquals("Bad Request", actualUpdateVehiclesTypeResult.getMessage());
        assertNull(actualUpdateVehiclesTypeResult.getData());
        assertEquals(400, actualUpdateVehiclesTypeResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateVehiclesType(Long, StVehicleTypeEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehiclesType2() throws Exception {
        // Sin cambios, ya usa stVehicleTypeController
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");
        String content = (new ObjectMapper()).writeValueAsString(stVehicleTypeEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/vehicleType/update/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        MockMvcBuilders.standaloneSetup(stVehicleTypeController).build().perform(requestBuilder);
    }

    @Test
    @DisplayName("Test deleteVehicleType(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteVehicleType() {
        // Antes:
        // StVehicleTypeController stVehicleTypeController = new StVehicleTypeController();
        // stVehicleTypeController.stVehiclesTypeService = new StVehiclesTypeService();
        // ApiResponse<Optional<StVehicleTypeEntity>> actualDeleteVehicleTypeResult = stVehicleTypeController.deleteVehicleType(1L);
        // Después:
        ApiResponse<Optional<StVehicleTypeEntity>> actualDeleteVehicleTypeResult = stVehicleTypeController.deleteVehicleType(1L);

        assertEquals("", actualDeleteVehicleTypeResult.getError());
        assertEquals("Bad Request", actualDeleteVehicleTypeResult.getMessage());
        assertNull(actualDeleteVehicleTypeResult.getData());
        assertEquals(400, actualDeleteVehicleTypeResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test deleteVehicleType(Long); given StVehicleTypeController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testDeleteVehicleType_givenStVehicleTypeController() {
        // Antes:
        // ApiResponse<Optional<StVehicleTypeEntity>> actualDeleteVehicleTypeResult = (new StVehicleTypeController()).deleteVehicleType(1L);
        // Después:
        ApiResponse<Optional<StVehicleTypeEntity>> actualDeleteVehicleTypeResult = stVehicleTypeController.deleteVehicleType(1L);

        assertEquals("", actualDeleteVehicleTypeResult.getError());
        assertEquals("Bad Request", actualDeleteVehicleTypeResult.getMessage());
        assertNull(actualDeleteVehicleTypeResult.getData());
        assertEquals(400, actualDeleteVehicleTypeResult.getStatus().intValue());
    }
}