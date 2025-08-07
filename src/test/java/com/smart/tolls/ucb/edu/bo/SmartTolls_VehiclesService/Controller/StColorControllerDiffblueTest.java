package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StColorService;

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
class StColorControllerDiffblueTest {

    @Mock
    private StColorService stColorService;

    @InjectMocks
    private StColorController stColorController;

    @Test
    @DisplayName("Test getAllColors()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllColors() {
        // Antes:
        // (new StColorController()).getAllColors();
        // Después:
        stColorController.getAllColors();
    }

    @Test
    @DisplayName("Test getAllColorsByStatus()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllColorsByStatus() {
        // Antes:
        // (new StColorController()).getAllColorsByStatus();
        // Después:
        stColorController.getAllColorsByStatus();
    }

    @Test
    @DisplayName("Test getColorById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetColorById() {
        // Antes:
        // ApiResponse<StColorEntity> actualColorById = (new StColorController()).getColorById(1L);
        // Después:
        ApiResponse<StColorEntity> actualColorById = stColorController.getColorById(1L);

        assertEquals("", actualColorById.getError());
        assertEquals("Not Found", actualColorById.getMessage());
        assertNull(actualColorById.getData());
        assertEquals(404, actualColorById.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createColor(StColorEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateColor() {
        // Antes:
        // StColorController stColorController = new StColorController();
        // ...
        // ApiResponse<Optional<StColorEntity>> actualCreateColorResult = stColorController.createColor(stColorEntity);
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

        StColorEntity stColorEntity = new StColorEntity();
        stColorEntity.setAudit(audit);
        stColorEntity.setColorDescription("Color Description");
        stColorEntity.setColorName("Color Name");
        stColorEntity.setIdColor(1L);
        stColorEntity.setStatus(1);

        ApiResponse<Optional<StColorEntity>> actualCreateColorResult = stColorController.createColor(stColorEntity);

        assertEquals("", actualCreateColorResult.getError());
        assertEquals("Bad Request", actualCreateColorResult.getMessage());
        assertNull(actualCreateColorResult.getData());
        assertEquals(400, actualCreateColorResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test createColor(StColorEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testCreateColor2() throws Exception {
        // Sin cambios, ya usa stColorController
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
        String content = (new ObjectMapper()).writeValueAsString(stColorEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/colors/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        MockMvcBuilders.standaloneSetup(stColorController).build().perform(requestBuilder);
    }

    @Test
    @DisplayName("Test updateColor(Long, StColorEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateColor() {
        // Antes:
        // StColorController stColorController = new StColorController();
        // ...
        // ApiResponse<Optional<StColorEntity>> actualUpdateColorResult = stColorController.updateColor(1L, stColorEntity);
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

        StColorEntity stColorEntity = new StColorEntity();
        stColorEntity.setAudit(audit);
        stColorEntity.setColorDescription("Color Description");
        stColorEntity.setColorName("Color Name");
        stColorEntity.setIdColor(1L);
        stColorEntity.setStatus(1);

        ApiResponse<Optional<StColorEntity>> actualUpdateColorResult = stColorController.updateColor(1L, stColorEntity);

        assertEquals("", actualUpdateColorResult.getError());
        assertEquals("Bad Request", actualUpdateColorResult.getMessage());
        assertNull(actualUpdateColorResult.getData());
        assertEquals(400, actualUpdateColorResult.getStatus().intValue());
    }

    @Test
    @DisplayName("Test updateColor(Long, StColorEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateColor2() throws Exception {
        // Sin cambios, ya usa stColorController
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
        String content = (new ObjectMapper()).writeValueAsString(stColorEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/colors/update/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        MockMvcBuilders.standaloneSetup(stColorController).build().perform(requestBuilder);
    }

    @Test
    @DisplayName("Test deleteColor(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteColor() {
        // Antes:
        // ApiResponse<Optional<StColorEntity>> actualDeleteColorResult = (new StColorController()).deleteColor(1L);
        // Después:
        ApiResponse<Optional<StColorEntity>> actualDeleteColorResult = stColorController.deleteColor(1L);

        assertEquals("", actualDeleteColorResult.getError());
        assertEquals("Bad Request", actualDeleteColorResult.getMessage());
        assertNull(actualDeleteColorResult.getData());
        assertEquals(400, actualDeleteColorResult.getStatus().intValue());
    }
}