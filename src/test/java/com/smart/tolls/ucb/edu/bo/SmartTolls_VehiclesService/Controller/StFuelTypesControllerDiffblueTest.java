package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StFuelTypesService;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StFuelTypesControllerDiffblueTest {

    @Mock
    private StFuelTypesService stFuelTypesService;

    @InjectMocks
    private StFuelTypesController stFuelTypesController;

    @Test
    @DisplayName("Test getFuelTypesById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetFuelTypesById() {
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);

        when(stFuelTypesService.getFuelTypesById(1L)).thenReturn(Optional.of(stFuelTypesEntity));

        // Act
        ApiResponse<StFuelTypesEntity> response = stFuelTypesController.getFuelTypesById(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(stFuelTypesEntity, response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createFuelTypes(StFuelTypesEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateFuelTypes() {
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);

        when(stFuelTypesService.createFuelType(stFuelTypesEntity)).thenReturn(Optional.of(stFuelTypesEntity));

        // Act
        ApiResponse<Optional<StFuelTypesEntity>> actualCreateFuelTypesResult = stFuelTypesController.createFuelTypes(stFuelTypesEntity);

        // Assert
        assertEquals("", actualCreateFuelTypesResult.getError());
        assertEquals("OK", actualCreateFuelTypesResult.getMessage());
        assertEquals(Optional.of(stFuelTypesEntity), actualCreateFuelTypesResult.getData());
        assertEquals(200, actualCreateFuelTypesResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateFuelType(Long, StFuelTypesEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateFuelType() {
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);

        when(stFuelTypesService.updateFuelType(1L, stFuelTypesEntity)).thenReturn(Optional.of(stFuelTypesEntity));

        // Act
        ApiResponse<Optional<StFuelTypesEntity>> actualUpdateFuelTypeResult = stFuelTypesController.updateFuelType(1L, stFuelTypesEntity);

        // Assert
        assertEquals("", actualUpdateFuelTypeResult.getError());
        assertEquals("OK", actualUpdateFuelTypeResult.getMessage());
        assertEquals(Optional.of(stFuelTypesEntity), actualUpdateFuelTypeResult.getData());
        assertEquals(200, actualUpdateFuelTypeResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test deleteFuelType(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteFuelType() {
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);

        when(stFuelTypesService.deleteFuelType(1L)).thenReturn(Optional.of(stFuelTypesEntity));

        // Act
        ApiResponse<Optional<StFuelTypesEntity>> actualDeleteFuelTypeResult = stFuelTypesController.deleteFuelType(1L);

        // Assert
        assertEquals("", actualDeleteFuelTypeResult.getError());
        assertEquals("OK", actualDeleteFuelTypeResult.getMessage());
        assertEquals(Optional.of(stFuelTypesEntity), actualDeleteFuelTypeResult.getData());
        assertEquals(200, actualDeleteFuelTypeResult.getStatus().intValue());
    }
}