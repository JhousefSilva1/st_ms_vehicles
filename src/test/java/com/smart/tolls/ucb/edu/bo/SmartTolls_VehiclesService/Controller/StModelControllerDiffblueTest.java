package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.StModelRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StBrandService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StModelService;

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
class StModelControllerDiffblueTest {

    @Mock
    private StBrandService stBrandService;

    @Mock
    private StModelService stModelService;

    @InjectMocks
    private StModelController stModelController;

    @Test
    @DisplayName("Test getModelsById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetModelsById() {
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

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit2);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity stModelEntity = new StModelEntity();
        stModelEntity.setAudit(audit);
        stModelEntity.setBrand(brand);
        stModelEntity.setIdModel(1L);
        stModelEntity.setModelDescription("Model Description");
        stModelEntity.setModelName("Model Name");
        stModelEntity.setStatus(1);

        Optional<StModelEntity> ofResult = Optional.of(stModelEntity);
        when(stModelService.getModelsById(1L)).thenReturn(ofResult);

        // Act
        ApiResponse<StModelEntity> response = stModelController.getModelsById(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(ofResult, response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getModelsByBrandId(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetModelsByBrandId() {
        // Arrange
        when(stModelService.getModelsByBrandId(1L)).thenReturn(List.of());

        // Act
        ApiResponse<List<StModelEntity>> response = stModelController.getModelsByBrandId(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(List.of(), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createModels(StModelRequest)")
    @Tag("MaintainedByDiffblue")
    void testCreateModels() {
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

        StBrandEntity stBrandEntity = new StBrandEntity();
        stBrandEntity.setAudit(audit);
        stBrandEntity.setBrandDescription("Brand Description");
        stBrandEntity.setBrandManufacturingCountry("GB");
        stBrandEntity.setBrandName("Brand Name");
        stBrandEntity.setIdBrand(1L);
        stBrandEntity.setStatus(1);
        when(stBrandService.getBrandById(1L)).thenReturn(Optional.of(stBrandEntity));

        StModelEntity stModelEntity = new StModelEntity();
        stModelEntity.setAudit(audit);
        stModelEntity.setBrand(stBrandEntity);
        stModelEntity.setIdModel(1L);
        stModelEntity.setModelDescription("Model Description");
        stModelEntity.setModelName("Model Name");
        stModelEntity.setStatus(1);

        when(stModelService.createModels(stModelEntity)).thenReturn(Optional.of(stModelEntity));

        StModelRequest stModelRequest = new StModelRequest();
        stModelRequest.setIdBrand(1L);
        stModelRequest.setIdModel(1L);
        stModelRequest.setModelDescription("Model Description");
        stModelRequest.setModelName("Model Name");

        // Act
        ApiResponse<Optional<StModelEntity>> response = stModelController.createModels(stModelRequest);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stModelEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateModels(Long, StModelEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateModels() {
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

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity stModelEntity = new StModelEntity();
        stModelEntity.setAudit(audit);
        stModelEntity.setBrand(brand);
        stModelEntity.setIdModel(1L);
        stModelEntity.setModelDescription("Model Description");
        stModelEntity.setModelName("Model Name");
        stModelEntity.setStatus(1);

        when(stModelService.updateModel(1L, stModelEntity)).thenReturn(Optional.of(stModelEntity));

        // Act
        ApiResponse<Optional<StModelEntity>> response = stModelController.updateModels(1L, stModelEntity);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stModelEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test deleteModels(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteModels() {
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

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity stModelEntity = new StModelEntity();
        stModelEntity.setAudit(audit);
        stModelEntity.setBrand(brand);
        stModelEntity.setIdModel(1L);
        stModelEntity.setModelDescription("Model Description");
        stModelEntity.setModelName("Model Name");
        stModelEntity.setStatus(1);

        when(stModelService.deleteModel(1L)).thenReturn(Optional.of(stModelEntity));

        // Act
        ApiResponse<Optional<StModelEntity>> response = stModelController.deleteModels(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(Optional.of(stModelEntity), response.getData());
        assertEquals(200, response.getStatus().intValue());
    }
}