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

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)

class StModelControllerDiffblueTest {
    @InjectMocks
    private StBrandService stBrandService;

    @MockBean
    private StModelController stModelController;

    @InjectMocks
    private StModelService stModelService;

    /**
     * Test {@link StModelController#getAllModels()}.
     * <p>
     * Method under test: {@link StModelController#getAllModels()}
     */
    @Test
    @DisplayName("Test getAllModels()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllModels() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   jakarta.servlet.ServletException: Request processing failed: java.nio.charset.IllegalCharsetNameException:
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   java.nio.charset.IllegalCharsetNameException:
        //       at java.base/java.nio.charset.Charset.checkName(Charset.java:316)
        //       at java.base/java.nio.charset.Charset.lookup2(Charset.java:512)
        //       at java.base/java.nio.charset.Charset.lookup(Charset.java:492)
        //       at java.base/java.nio.charset.Charset.forName(Charset.java:556)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new StModelController()).getAllModels();
    }

    /**
     * Test {@link StModelController#getAllModelsByStatus()}.
     * <p>
     * Method under test: {@link StModelController#getAllModelsByStatus()}
     */
    @Test
    @DisplayName("Test getAllModelsByStatus()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllModelsByStatus() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   jakarta.servlet.ServletException: Request processing failed: java.nio.charset.IllegalCharsetNameException:
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   java.nio.charset.IllegalCharsetNameException:
        //       at java.base/java.nio.charset.Charset.checkName(Charset.java:316)
        //       at java.base/java.nio.charset.Charset.lookup2(Charset.java:512)
        //       at java.base/java.nio.charset.Charset.lookup(Charset.java:492)
        //       at java.base/java.nio.charset.Charset.forName(Charset.java:556)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new StModelController()).getAllModelsByStatus();
    }

    /**
     * Test {@link StModelController#getModelsById(Long)}.
     * <p>
     * Method under test: {@link StModelController#getModelsById(Long)}
     */
    @Test
    @DisplayName("Test getModelsById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetModelsById() throws Exception {
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
        when(stModelService.getModelsById(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/models/{id}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stModelController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"OK\",\"data\":{\"idModel\":1,\"modelName\":\"Model Name\",\"modelDescription\":\"Model"
                                        + " Description\",\"brand\":{\"idBrand\":1,\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand Description\","
                                        + "\"brandManufacturingCountry\":\"GB\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0"
                                        + ",0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1"
                                        + ",0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion"
                                        + "\":1}},\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\""
                                        + ",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main"
                                        + " St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"error\":\"\"}"));
    }

    /**
     * Test {@link StModelController#getModelsByBrandId(Long)}.
     * <p>
     * Method under test: {@link StModelController#getModelsByBrandId(Long)}
     */
    @Test
    @DisplayName("Test getModelsByBrandId(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetModelsByBrandId() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<List<StModelEntity>> actualModelsByBrandId = (new StModelController()).getModelsByBrandId(1L);

        // Assert
        assertEquals("", actualModelsByBrandId.getError());
        assertEquals("Not Found", actualModelsByBrandId.getMessage());
        assertNull(actualModelsByBrandId.getData());
        assertEquals(404, actualModelsByBrandId.getStatus().intValue());
    }

    /**
     * Test {@link StModelController#createModels(StModelRequest)}.
     * <p>
     * Method under test: {@link StModelController#createModels(StModelRequest)}
     */
    @Test
    @DisplayName("Test createModels(StModelRequest)")
    @Tag("MaintainedByDiffblue")
    void testCreateModels() throws Exception {
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
        when(stBrandService.getBrandById(Mockito.<Long>any())).thenReturn(ofResult);

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

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit3);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity stModelEntity = new StModelEntity();
        stModelEntity.setAudit(audit2);
        stModelEntity.setBrand(brand);
        stModelEntity.setIdModel(1L);
        stModelEntity.setModelDescription("Model Description");
        stModelEntity.setModelName("Model Name");
        stModelEntity.setStatus(1);
        Optional<StModelEntity> ofResult2 = Optional.of(stModelEntity);
        when(stModelService.createModels(Mockito.<StModelEntity>any())).thenReturn(ofResult2);

        StModelRequest stModelRequest = new StModelRequest();
        stModelRequest.setIdBrand(1L);
        stModelRequest.setIdModel(1L);
        stModelRequest.setModelDescription("Model Description");
        stModelRequest.setModelName("Model Name");
        String content = (new ObjectMapper()).writeValueAsString(stModelRequest);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/models/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stModelController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"OK\",\"data\":{\"idModel\":1,\"modelName\":\"Model Name\",\"modelDescription\":\"Model"
                                        + " Description\",\"brand\":{\"idBrand\":1,\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand Description\","
                                        + "\"brandManufacturingCountry\":\"GB\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0"
                                        + ",0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1"
                                        + ",0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion"
                                        + "\":1}},\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\""
                                        + ",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main"
                                        + " St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"error\":\"\"}"));
    }

    /**
     * Test {@link StModelController#updateModels(Long, StModelEntity)}.
     * <p>
     * Method under test: {@link StModelController#updateModels(Long, StModelEntity)}
     */
    @Test
    @DisplayName("Test updateModels(Long, StModelEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateModels() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StModelController stModelController = new StModelController();

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

        // Act
        ApiResponse<Optional<StModelEntity>> actualUpdateModelsResult = stModelController.updateModels(1L, stModelEntity);

        // Assert
        assertEquals("", actualUpdateModelsResult.getError());
        assertEquals("Bad Request", actualUpdateModelsResult.getMessage());
        assertNull(actualUpdateModelsResult.getData());
        assertEquals(400, actualUpdateModelsResult.getStatus().intValue());
    }

    /**
     * Test {@link StModelController#updateModels(Long, StModelEntity)}.
     * <p>
     * Method under test: {@link StModelController#updateModels(Long, StModelEntity)}
     */
    @Test
    @DisplayName("Test updateModels(Long, StModelEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateModels2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity["brand"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
        //       at com.fasterxml.jackson.databind.exc.InvalidDefinitionException.from(InvalidDefinitionException.java:77)
        //       at com.fasterxml.jackson.databind.SerializerProvider.reportBadDefinition(SerializerProvider.java:1330)
        //       at com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer.serialize(UnsupportedTypeSerializer.java:35)
        //       at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:732)
        //       at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:770)
        //       at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:183)
        //       at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:732)
        //       at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:770)
        //       at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:183)
        //       at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:732)
        //       at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:770)
        //       at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:183)
        //       at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._serialize(DefaultSerializerProvider.java:502)
        //       at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:341)
        //       at com.fasterxml.jackson.databind.ObjectMapper._writeValueAndClose(ObjectMapper.java:4799)
        //       at com.fasterxml.jackson.databind.ObjectMapper.writeValueAsString(ObjectMapper.java:4040)
        //   See https://diff.blue/R013 to resolve this issue.

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
        String content = (new ObjectMapper()).writeValueAsString(stModelEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/models/update/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stModelController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StModelController#deleteModels(Long)}.
     * <p>
     * Method under test: {@link StModelController#deleteModels(Long)}
     */
    @Test
    @DisplayName("Test deleteModels(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteModels() throws Exception {
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
        when(stModelService.deleteModel(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api/models/delete/{id}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stModelController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"OK\",\"data\":{\"idModel\":1,\"modelName\":\"Model Name\",\"modelDescription\":\"Model"
                                        + " Description\",\"brand\":{\"idBrand\":1,\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand Description\","
                                        + "\"brandManufacturingCountry\":\"GB\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0"
                                        + ",0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1"
                                        + ",0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion"
                                        + "\":1}},\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\""
                                        + ",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main"
                                        + " St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"error\":\"\"}"));
    }
}
