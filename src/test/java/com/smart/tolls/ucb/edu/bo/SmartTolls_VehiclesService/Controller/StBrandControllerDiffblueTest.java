package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StBrandService;

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
class StBrandControllerDiffblueTest {

    @Mock
    private StBrandService stBrandService;

    @InjectMocks
    private StBrandController stBrandController;

    @Test
    @DisplayName("Test getAllBrands()")
    @Tag("MaintainedByDiffblue")
    void testGetAllBrands() {
        // Arrange
        when(stBrandService.getAllBrands()).thenReturn(List.of());

        // Act
        ApiResponse<List<StBrandEntity>> actualAllBrands = stBrandController.getAllBrands();

        // Assert
        assertEquals("", actualAllBrands.getError());
        assertEquals("OK", actualAllBrands.getMessage());
        assertEquals(List.of(), actualAllBrands.getData());
        assertEquals(200, actualAllBrands.getStatus().intValue());
    }

    @Test
    @DisplayName("Test getBrandById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetBrandById() {
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
        Optional<StBrandEntity> ofResult = Optional.of(stBrandEntity);

        when(stBrandService.getBrandById(1L)).thenReturn(ofResult);

        // Act
        ApiResponse<StBrandEntity> response = stBrandController.getBrandById(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(ofResult, response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createBrand(StBrandEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateBrand() {
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

        Optional<StBrandEntity> result = Optional.of(stBrandEntity);
        when(stBrandService.createBrand(stBrandEntity)).thenReturn(result);

        // Act
        ApiResponse<Optional<StBrandEntity>> actualCreateBrandResult = stBrandController.createBrand(stBrandEntity);

        // Assert
        assertEquals("", actualCreateBrandResult.getError());
        assertEquals("OK", actualCreateBrandResult.getMessage());
        assertEquals(result, actualCreateBrandResult.getData());
        assertEquals(200, actualCreateBrandResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateBrand(Long, StBrandEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateBrand() {
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

        Optional<StBrandEntity> result = Optional.of(stBrandEntity);
        when(stBrandService.updateBrand(1L, stBrandEntity)).thenReturn(result);

        // Act
        ApiResponse<Optional<StBrandEntity>> actualUpdateBrandResult = stBrandController.updateBrand(1L, stBrandEntity);

        // Assert
        assertEquals("", actualUpdateBrandResult.getError());
        assertEquals("OK", actualUpdateBrandResult.getMessage());
        assertEquals(result, actualUpdateBrandResult.getData());
        assertEquals(200, actualUpdateBrandResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test deleteBrand(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteBrand() {
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
        Optional<StBrandEntity> result = Optional.of(stBrandEntity);

        when(stBrandService.deleteBrand(1L)).thenReturn(result);

        // Act
        ApiResponse<Optional<StBrandEntity>> response = stBrandController.deleteBrand(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(result, response.getData());
        assertEquals(200, response.getStatus().intValue());
    }
}