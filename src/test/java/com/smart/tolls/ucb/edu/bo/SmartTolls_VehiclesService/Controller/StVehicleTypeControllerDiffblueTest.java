package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StVehiclesTypeService;

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

@ExtendWith(MockitoExtension.class)
class StVehicleTypeControllerDiffblueTest {

    @Mock
    private StVehiclesTypeService stVehiclesTypeService;

    @InjectMocks
    private StVehicleTypeController stVehicleTypeController;

    @Test
    @DisplayName("Test getAllTypeVehicle()")
    @Tag("MaintainedByDiffblue")
    void testGetAllTypeVehicle() {
        // Arrange
        when(stVehiclesTypeService.getAllTypeVehicle()).thenReturn(List.of());

        // Act
        ApiResponse<List<StVehicleTypeEntity>> response = stVehicleTypeController.getAllTypeVehicle();

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(List.of(), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getAllTypeVehicleByStatus()")
    @Tag("MaintainedByDiffblue")
    void testGetAllTypeVehicleByStatus() {
        // Arrange
        when(stVehiclesTypeService.getAllTypeVehicleByStatus()).thenReturn(List.of());

        // Act
        ApiResponse<List<StVehicleTypeEntity>> response = stVehicleTypeController.getAllTypeVehicleByStatus();

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(List.of(), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getVehicleTypeById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleTypeById() {
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");

        when(stVehiclesTypeService.getVehicleTypeById(1L)).thenReturn(Optional.of(stVehicleTypeEntity));

        // Act
        ApiResponse<StVehicleTypeEntity> response = stVehicleTypeController.getVehicleTypeById(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(stVehicleTypeEntity, response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createVehiclesType(StVehicleTypeEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateVehiclesType() {
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");

        when(stVehiclesTypeService.createVehiclesType(stVehicleTypeEntity)).thenReturn(Optional.of(stVehicleTypeEntity));

        // Act
        ApiResponse<Optional<StVehicleTypeEntity>> response = stVehicleTypeController.createVehiclesType(stVehicleTypeEntity);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stVehicleTypeEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateVehiclesType(Long, StVehicleTypeEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehiclesType() {
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");

        when(stVehiclesTypeService.updateVehiclesType(1L, stVehicleTypeEntity)).thenReturn(Optional.of(stVehicleTypeEntity));

        // Act
        ApiResponse<Optional<StVehicleTypeEntity>> response = stVehicleTypeController.updateVehiclesType(1L, stVehicleTypeEntity);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stVehicleTypeEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test deleteVehicleType(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteVehicleType() {
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");

        when(stVehiclesTypeService.deleteVehicleType(1L)).thenReturn(Optional.of(stVehicleTypeEntity));

        // Act
        ApiResponse<Optional<StVehicleTypeEntity>> response = stVehicleTypeController.deleteVehicleType(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stVehicleTypeEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }
}