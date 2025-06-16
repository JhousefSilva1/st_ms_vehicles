package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StFuelTypesService;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {StFuelTypesController.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class StFuelTypesControllerDiffblueTest {
    @Autowired
    private StFuelTypesController stFuelTypesController;

    @MockBean
    private StFuelTypesService stFuelTypesService;

    /**
     * Test {@link StFuelTypesController#getAllFuelTypes()}.
     * <ul>
     *   <li>Given {@link StFuelTypesController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StFuelTypesController#getAllFuelTypes()}
     */
    @Test
    @DisplayName("Test getAllFuelTypes(); given StFuelTypesController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllFuelTypes_givenStFuelTypesController() {
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
        (new StFuelTypesController()).getAllFuelTypes();
    }

    /**
     * Test {@link StFuelTypesController#getAllFuelTypesByStatus()}.
     * <ul>
     *   <li>Given {@link StFuelTypesController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StFuelTypesController#getAllFuelTypesByStatus()}
     */
    @Test
    @DisplayName("Test getAllFuelTypesByStatus(); given StFuelTypesController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllFuelTypesByStatus_givenStFuelTypesController() {
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
        (new StFuelTypesController()).getAllFuelTypesByStatus();
    }

    /**
     * Test {@link StFuelTypesController#getFuelTypesById(Long)}.
     * <p>
     * Method under test: {@link StFuelTypesController#getFuelTypesById(Long)}
     */
    @Test
    @DisplayName("Test getFuelTypesById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetFuelTypesById() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StFuelTypesController stFuelTypesController = new StFuelTypesController();
        stFuelTypesController.stFuelTypesService = new StFuelTypesService();

        // Act
        ApiResponse<StFuelTypesEntity> actualFuelTypesById = stFuelTypesController.getFuelTypesById(1L);

        // Assert
        assertEquals("", actualFuelTypesById.getError());
        assertEquals("Not Found", actualFuelTypesById.getMessage());
        assertNull(actualFuelTypesById.getData());
        assertEquals(404, actualFuelTypesById.getStatus().intValue());
    }

    /**
     * Test {@link StFuelTypesController#getFuelTypesById(Long)}.
     * <ul>
     *   <li>Given {@link StFuelTypesController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StFuelTypesController#getFuelTypesById(Long)}
     */
    @Test
    @DisplayName("Test getFuelTypesById(Long); given StFuelTypesController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testGetFuelTypesById_givenStFuelTypesController() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<StFuelTypesEntity> actualFuelTypesById = (new StFuelTypesController()).getFuelTypesById(1L);

        // Assert
        assertEquals("", actualFuelTypesById.getError());
        assertEquals("Not Found", actualFuelTypesById.getMessage());
        assertNull(actualFuelTypesById.getData());
        assertEquals(404, actualFuelTypesById.getStatus().intValue());
    }

    /**
     * Test {@link StFuelTypesController#createFuelTypes(StFuelTypesEntity)}.
     * <p>
     * Method under test: {@link StFuelTypesController#createFuelTypes(StFuelTypesEntity)}
     */
    @Test
    @DisplayName("Test createFuelTypes(StFuelTypesEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateFuelTypes() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StFuelTypesController stFuelTypesController = new StFuelTypesController();

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

        // Act
        ApiResponse<Optional<StFuelTypesEntity>> actualCreateFuelTypesResult = stFuelTypesController
                .createFuelTypes(stFuelTypesEntity);

        // Assert
        assertEquals("", actualCreateFuelTypesResult.getError());
        assertEquals("Bad Request", actualCreateFuelTypesResult.getMessage());
        assertNull(actualCreateFuelTypesResult.getData());
        assertEquals(400, actualCreateFuelTypesResult.getStatus().intValue());
    }

    /**
     * Test {@link StFuelTypesController#createFuelTypes(StFuelTypesEntity)}.
     * <p>
     * Method under test: {@link StFuelTypesController#createFuelTypes(StFuelTypesEntity)}
     */
    @Test
    @DisplayName("Test createFuelTypes(StFuelTypesEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testCreateFuelTypes2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);
        String content = (new ObjectMapper()).writeValueAsString(stFuelTypesEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/fuelTypes/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stFuelTypesController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StFuelTypesController#updateFuelType(Long, StFuelTypesEntity)}.
     * <p>
     * Method under test: {@link StFuelTypesController#updateFuelType(Long, StFuelTypesEntity)}
     */
    @Test
    @DisplayName("Test updateFuelType(Long, StFuelTypesEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateFuelType() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StFuelTypesController stFuelTypesController = new StFuelTypesController();

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

        // Act
        ApiResponse<Optional<StFuelTypesEntity>> actualUpdateFuelTypeResult = stFuelTypesController.updateFuelType(1L,
                stFuelTypesEntity);

        // Assert
        assertEquals("", actualUpdateFuelTypeResult.getError());
        assertEquals("Bad Request", actualUpdateFuelTypeResult.getMessage());
        assertNull(actualUpdateFuelTypeResult.getData());
        assertEquals(400, actualUpdateFuelTypeResult.getStatus().intValue());
    }

    /**
     * Test {@link StFuelTypesController#updateFuelType(Long, StFuelTypesEntity)}.
     * <p>
     * Method under test: {@link StFuelTypesController#updateFuelType(Long, StFuelTypesEntity)}
     */
    @Test
    @DisplayName("Test updateFuelType(Long, StFuelTypesEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateFuelType2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
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

        StFuelTypesEntity stFuelTypesEntity = new StFuelTypesEntity();
        stFuelTypesEntity.setAudit(audit);
        stFuelTypesEntity.setFuelTypeFuel("Fuel Type Fuel");
        stFuelTypesEntity.setIdFuelType(1L);
        stFuelTypesEntity.setStatus(1);
        String content = (new ObjectMapper()).writeValueAsString(stFuelTypesEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/fuelTypes/update/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stFuelTypesController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StFuelTypesController#deleteFuelType(Long)}.
     * <p>
     * Method under test: {@link StFuelTypesController#deleteFuelType(Long)}
     */
    @Test
    @DisplayName("Test deleteFuelType(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteFuelType() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StFuelTypesController stFuelTypesController = new StFuelTypesController();
        stFuelTypesController.stFuelTypesService = new StFuelTypesService();

        // Act
        ApiResponse<Optional<StFuelTypesEntity>> actualDeleteFuelTypeResult = stFuelTypesController.deleteFuelType(1L);

        // Assert
        assertEquals("", actualDeleteFuelTypeResult.getError());
        assertEquals("Bad Request", actualDeleteFuelTypeResult.getMessage());
        assertNull(actualDeleteFuelTypeResult.getData());
        assertEquals(400, actualDeleteFuelTypeResult.getStatus().intValue());
    }

    /**
     * Test {@link StFuelTypesController#deleteFuelType(Long)}.
     * <ul>
     *   <li>Given {@link StFuelTypesController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StFuelTypesController#deleteFuelType(Long)}
     */
    @Test
    @DisplayName("Test deleteFuelType(Long); given StFuelTypesController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testDeleteFuelType_givenStFuelTypesController() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<Optional<StFuelTypesEntity>> actualDeleteFuelTypeResult = (new StFuelTypesController())
                .deleteFuelType(1L);

        // Assert
        assertEquals("", actualDeleteFuelTypeResult.getError());
        assertEquals("Bad Request", actualDeleteFuelTypeResult.getMessage());
        assertNull(actualDeleteFuelTypeResult.getData());
        assertEquals(400, actualDeleteFuelTypeResult.getStatus().intValue());
    }
}
