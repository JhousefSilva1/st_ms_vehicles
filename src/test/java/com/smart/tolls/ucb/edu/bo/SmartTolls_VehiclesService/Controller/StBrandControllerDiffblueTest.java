package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StBrandService;

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
class StBrandControllerDiffblueTest {
    @InjectMocks
    private StBrandController stBrandController;

    @MockBean
    private StBrandService stBrandService;

    /**
     * Test {@link StBrandController#getAllBrands()}.
     * <p>
     * Method under test: {@link StBrandController#getAllBrands()}
     */
    @Test
    @DisplayName("Test getAllBrands()")
    @Tag("MaintainedByDiffblue")
    void testGetAllBrands() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<List<StBrandEntity>> actualAllBrands = (new StBrandController()).getAllBrands();

        // Assert
        assertEquals("", actualAllBrands.getError());
        assertEquals("Internal Server Error", actualAllBrands.getMessage());
        assertNull(actualAllBrands.getData());
        assertEquals(500, actualAllBrands.getStatus().intValue());
    }

    /**
     * Test {@link StBrandController#getAllBrandsByStatus()}.
     * <p>
     * Method under test: {@link StBrandController#getAllBrandsByStatus()}
     */
    @Test
    @DisplayName("Test getAllBrandsByStatus()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllBrandsByStatus() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   jakarta.servlet.ServletException: Request processing failed: jakarta.persistence.EntityNotFoundException: An error occurred42Not all who wander are lost
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   jakarta.persistence.EntityNotFoundException: An error occurred42Not all who wander are lost
        //       at com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StBrandService.getAllBrandByStatus(StBrandService.java:24)
        //       at com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller.StBrandController.getAllBrandsByStatus(StBrandController.java:60)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new StBrandController()).getAllBrandsByStatus();
    }

    /**
     * Test {@link StBrandController#getBrandById(Long)}.
     * <p>
     * Method under test: {@link StBrandController#getBrandById(Long)}
     */
    @Test
    @DisplayName("Test getBrandById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetBrandById() throws Exception {
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
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/brands/{id}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stBrandController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"OK\",\"data\":{\"idBrand\":1,\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand"
                                        + " Description\",\"brandManufacturingCountry\":\"GB\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate"
                                        + "\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate"
                                        + "\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\""
                                        + ",\"recordVersion\":1}},\"error\":\"\"}"));
    }

    /**
     * Test {@link StBrandController#createBrand(StBrandEntity)}.
     * <p>
     * Method under test: {@link StBrandController#createBrand(StBrandEntity)}
     */
    @Test
    @DisplayName("Test createBrand(StBrandEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateBrand() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StBrandController stBrandController = new StBrandController();

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

        // Act
        ApiResponse<Optional<StBrandEntity>> actualCreateBrandResult = stBrandController.createBrand(stBrandEntity);

        // Assert
        assertEquals("", actualCreateBrandResult.getError());
        assertEquals("An unexpected error occurred: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Service.StBrandService.createBrand(com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity"
                + ".StBrandEntity)\" because \"this.stBrandService\" is null", actualCreateBrandResult.getMessage());
        assertNull(actualCreateBrandResult.getData());
        assertEquals(500, actualCreateBrandResult.getStatus().intValue());
    }

    /**
     * Test {@link StBrandController#createBrand(StBrandEntity)}.
     * <p>
     * Method under test: {@link StBrandController#createBrand(StBrandEntity)}
     */
    @Test
    @DisplayName("Test createBrand(StBrandEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testCreateBrand2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
        //       at com.fasterxml.jackson.databind.exc.InvalidDefinitionException.from(InvalidDefinitionException.java:77)
        //       at com.fasterxml.jackson.databind.SerializerProvider.reportBadDefinition(SerializerProvider.java:1330)
        //       at com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer.serialize(UnsupportedTypeSerializer.java:35)
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

        StBrandEntity stBrandEntity = new StBrandEntity();
        stBrandEntity.setAudit(audit);
        stBrandEntity.setBrandDescription("Brand Description");
        stBrandEntity.setBrandManufacturingCountry("GB");
        stBrandEntity.setBrandName("Brand Name");
        stBrandEntity.setIdBrand(1L);
        stBrandEntity.setStatus(1);
        String content = (new ObjectMapper()).writeValueAsString(stBrandEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/brands/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stBrandController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StBrandController#updateBrand(Long, StBrandEntity)}.
     * <p>
     * Method under test: {@link StBrandController#updateBrand(Long, StBrandEntity)}
     */
    @Test
    @DisplayName("Test updateBrand(Long, StBrandEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateBrand() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StBrandController stBrandController = new StBrandController();

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

        // Act
        ApiResponse<Optional<StBrandEntity>> actualUpdateBrandResult = stBrandController.updateBrand(1L, stBrandEntity);

        // Assert
        assertEquals("", actualUpdateBrandResult.getError());
        assertEquals("An unexpected error occurred: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Service.StBrandService.updateBrand(java.lang.Long, com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Entity.StBrandEntity)\" because \"this.stBrandService\" is null", actualUpdateBrandResult.getMessage());
        assertNull(actualUpdateBrandResult.getData());
        assertEquals(500, actualUpdateBrandResult.getStatus().intValue());
    }

    /**
     * Test {@link StBrandController#updateBrand(Long, StBrandEntity)}.
     * <p>
     * Method under test: {@link StBrandController#updateBrand(Long, StBrandEntity)}
     */
    @Test
    @DisplayName("Test updateBrand(Long, StBrandEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateBrand2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
        //       at com.fasterxml.jackson.databind.exc.InvalidDefinitionException.from(InvalidDefinitionException.java:77)
        //       at com.fasterxml.jackson.databind.SerializerProvider.reportBadDefinition(SerializerProvider.java:1330)
        //       at com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer.serialize(UnsupportedTypeSerializer.java:35)
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

        StBrandEntity stBrandEntity = new StBrandEntity();
        stBrandEntity.setAudit(audit);
        stBrandEntity.setBrandDescription("Brand Description");
        stBrandEntity.setBrandManufacturingCountry("GB");
        stBrandEntity.setBrandName("Brand Name");
        stBrandEntity.setIdBrand(1L);
        stBrandEntity.setStatus(1);
        String content = (new ObjectMapper()).writeValueAsString(stBrandEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/brands/update/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stBrandController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StBrandController#deleteBrand(Long)}.
     * <p>
     * Method under test: {@link StBrandController#deleteBrand(Long)}
     */
    @Test
    @DisplayName("Test deleteBrand(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteBrand() throws Exception {
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
        when(stBrandService.deleteBrand(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api/brands/delete/{id}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stBrandController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"OK\",\"data\":{\"idBrand\":1,\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand"
                                        + " Description\",\"brandManufacturingCountry\":\"GB\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate"
                                        + "\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate"
                                        + "\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\""
                                        + ",\"recordVersion\":1}},\"error\":\"\"}"));
    }
}
