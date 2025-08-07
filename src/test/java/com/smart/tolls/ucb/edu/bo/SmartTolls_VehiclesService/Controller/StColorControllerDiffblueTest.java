package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StColorService;

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
class StColorControllerDiffblueTest {

    @Mock
    private StColorService stColorService;

    @InjectMocks
    private StColorController stColorController;

    @Test
    @DisplayName("Test getColorById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetColorById() {
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

        StColorEntity stColorEntity = new StColorEntity();
        stColorEntity.setAudit(audit);
        stColorEntity.setColorDescription("Color Description");
        stColorEntity.setColorName("Color Name");
        stColorEntity.setIdColor(1L);
        stColorEntity.setStatus(1);

        when(stColorService.getColorById(1L)).thenReturn(Optional.of(stColorEntity));

        // Act
        ApiResponse<StColorEntity> response = stColorController.getColorById(1L);

        // Assert
        assertEquals("", response.getError());
        assertEquals("OK", response.getMessage());
        assertEquals(stColorEntity, response.getData());
        assertEquals(200, response.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createColor(StColorEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateColor() {
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

        StColorEntity stColorEntity = new StColorEntity();
        stColorEntity.setAudit(audit);
        stColorEntity.setColorDescription("Color Description");
        stColorEntity.setColorName("Color Name");
        stColorEntity.setIdColor(1L);
        stColorEntity.setStatus(1);

        when(stColorService.createColor(stColorEntity)).thenReturn(Optional.of(stColorEntity));

        // Act
        ApiResponse<Optional<StColorEntity>> actualCreateColorResult = stColorController.createColor(stColorEntity);

        // Assert
        assertEquals("", actualCreateColorResult.getError());
        assertEquals("OK", actualCreateColorResult.getMessage());
        assertEquals(Optional.of(stColorEntity), actualCreateColorResult.getData());
        assertEquals(200, actualCreateColorResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateColor(Long, StColorEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateColor() {
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

        StColorEntity stColorEntity = new StColorEntity();
        stColorEntity.setAudit(audit);
        stColorEntity.setColorDescription("Color Description");
        stColorEntity.setColorName("Color Name");
        stColorEntity.setIdColor(1L);
        stColorEntity.setStatus(1);

        when(stColorService.updateColor(1L, stColorEntity)).thenReturn(Optional.of(stColorEntity));

        // Act
        ApiResponse<Optional<StColorEntity>> actualUpdateColorResult = stColorController.updateColor(1L, stColorEntity);

        // Assert
        assertEquals("", actualUpdateColorResult.getError());
        assertEquals("OK", actualUpdateColorResult.getMessage());
        assertEquals(Optional.of(stColorEntity), actualUpdateColorResult.getData());
        assertEquals(200, actualUpdateColorResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test deleteColor(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteColor() {
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

        StColorEntity stColorEntity = new StColorEntity();
        stColorEntity.setAudit(audit);
        stColorEntity.setColorDescription("Color Description");
        stColorEntity.setColorName("Color Name");
        stColorEntity.setIdColor(1L);
        stColorEntity.setStatus(1);

        when(stColorService.deleteColor(1L)).thenReturn(Optional.of(stColorEntity));

        // Act
        ApiResponse<Optional<StColorEntity>> actualDeleteColorResult = stColorController.deleteColor(1L);

        // Assert
        assertEquals("", actualDeleteColorResult.getError());
        assertEquals("OK", actualDeleteColorResult.getMessage());
        assertEquals(Optional.of(stColorEntity), actualDeleteColorResult.getData());
        assertEquals(200, actualDeleteColorResult.getStatus().intValue());
    }
}