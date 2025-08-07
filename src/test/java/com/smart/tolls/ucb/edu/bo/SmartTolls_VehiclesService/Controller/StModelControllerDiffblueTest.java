package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
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
class StModelControllerDiffblueTest {

    @Mock
    private StBrandService stBrandService;

    @Mock
    private StModelService stModelService;

    @InjectMocks
    private StModelController stModelController;

    @Test
    @DisplayName("Test getAllModels()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllModels() {
        // Antes:
        // (new StModelController()).getAllModels();
        // Después:
        stModelController.getAllModels();
    }

    @Test
    @DisplayName("Test getAllModelsByStatus()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllModelsByStatus() {
        // Antes:
        // (new StModelController()).getAllModelsByStatus();
        // Después:
        stModelController.getAllModelsByStatus();
    }

    @Test
    @DisplayName("Test getModelsById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetModelsById() throws Exception {
        // ... (Sin cambios, ya usa stModelController)
        // ...
    }

    @Test
    @DisplayName("Test getModelsByBrandId(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetModelsByBrandId() {
        // Antes:
        // ApiResponse<List<StModelEntity>> actualModelsByBrandId = (new StModelController()).getModelsByBrandId(1L);
        // Después:
        ApiResponse<List<StModelEntity>> actualModelsByBrandId = stModelController.getModelsByBrandId(1L);

        assertEquals("", actualModelsByBrandId.getError());
        assertEquals("Not Found", actualModelsByBrandId.getMessage());
        assertNull(actualModelsByBrandId.getData());
        assertEquals(404, actualModelsByBrandId.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createModels(StModelRequest)")
    @Tag("MaintainedByDiffblue")
    void testCreateModels() throws Exception {
        // ... (Sin cambios, ya usa stModelController)
        // ...
    }

    @Test
    @DisplayName("Test updateModels(Long, StModelEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateModels() {
        // Antes:
        // StModelController stModelController = new StModelController();
        // ...
        // ApiResponse<Optional<StModelEntity>> actualUpdateModelsResult = stModelController.updateModels(1L, stModelEntity);
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

        ApiResponse<Optional<StModelEntity>> actualUpdateModelsResult = stModelController.updateModels(1L, stModelEntity);

        assertEquals("", actualUpdateModelsResult.getError());
        assertEquals("Bad Request", actualUpdateModelsResult.getMessage());
        assertNull(actualUpdateModelsResult.getData());
        assertEquals(400, actualUpdateModelsResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateModels(Long, StModelEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateModels2() throws Exception {
        // ... (Sin cambios, ya usa stModelController)
        // ...
    }

    @Test
    @DisplayName("Test deleteModels(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteModels() throws Exception {
        // ... (Sin cambios, ya usa stModelController)
        // ...
    }
}