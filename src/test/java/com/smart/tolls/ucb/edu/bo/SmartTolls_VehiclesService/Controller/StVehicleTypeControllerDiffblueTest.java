package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StVehiclesTypeService;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
class StVehicleTypeControllerDiffblueTest {
    @InjectMocks
    private StVehicleTypeController stVehicleTypeController;

    @MockBean
    private StVehiclesTypeService stVehiclesTypeService;

    /**
     * Test {@link StVehicleTypeController#getAllTypeVehicle()}.
     * <ul>
     *   <li>Given {@link StVehicleTypeController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehicleTypeController#getAllTypeVehicle()}
     */
    @Test
    @DisplayName("Test getAllTypeVehicle(); given StVehicleTypeController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllTypeVehicle_givenStVehicleTypeController() {
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
        (new StVehicleTypeController()).getAllTypeVehicle();
    }

    /**
     * Test {@link StVehicleTypeController#getAllTypeVehicleByStatus()}.
     * <ul>
     *   <li>Given {@link StVehicleTypeController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehicleTypeController#getAllTypeVehicleByStatus()}
     */
    @Test
    @DisplayName("Test getAllTypeVehicleByStatus(); given StVehicleTypeController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllTypeVehicleByStatus_givenStVehicleTypeController() {
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
        (new StVehicleTypeController()).getAllTypeVehicleByStatus();
    }

    /**
     * Test {@link StVehicleTypeController#getVehicleTypeById(Long)}.
     * <p>
     * Method under test: {@link StVehicleTypeController#getVehicleTypeById(Long)}
     */
    @Test
    @DisplayName("Test getVehicleTypeById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleTypeById() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StVehicleTypeController stVehicleTypeController = new StVehicleTypeController();
        stVehicleTypeController.stVehiclesTypeService = new StVehiclesTypeService();

        // Act
        ApiResponse<StVehicleTypeEntity> actualVehicleTypeById = stVehicleTypeController.getVehicleTypeById(1L);

        // Assert
        assertEquals("", actualVehicleTypeById.getError());
        assertEquals("Not Found", actualVehicleTypeById.getMessage());
        assertNull(actualVehicleTypeById.getData());
        assertEquals(404, actualVehicleTypeById.getStatus().intValue());
    }

    /**
     * Test {@link StVehicleTypeController#getVehicleTypeById(Long)}.
     * <ul>
     *   <li>Given {@link StVehicleTypeController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehicleTypeController#getVehicleTypeById(Long)}
     */
    @Test
    @DisplayName("Test getVehicleTypeById(Long); given StVehicleTypeController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleTypeById_givenStVehicleTypeController() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<StVehicleTypeEntity> actualVehicleTypeById = (new StVehicleTypeController()).getVehicleTypeById(1L);

        // Assert
        assertEquals("", actualVehicleTypeById.getError());
        assertEquals("Not Found", actualVehicleTypeById.getMessage());
        assertNull(actualVehicleTypeById.getData());
        assertEquals(404, actualVehicleTypeById.getStatus().intValue());
    }

    /**
     * Test {@link StVehicleTypeController#createVehiclesType(StVehicleTypeEntity)}.
     * <p>
     * Method under test: {@link StVehicleTypeController#createVehiclesType(StVehicleTypeEntity)}
     */
    @Test
    @DisplayName("Test createVehiclesType(StVehicleTypeEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateVehiclesType() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StVehicleTypeController stVehicleTypeController = new StVehicleTypeController();

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

        // Act
        ApiResponse<Optional<StVehicleTypeEntity>> actualCreateVehiclesTypeResult = stVehicleTypeController
                .createVehiclesType(stVehicleTypeEntity);

        // Assert
        assertEquals("", actualCreateVehiclesTypeResult.getError());
        assertEquals("Bad Request", actualCreateVehiclesTypeResult.getMessage());
        assertNull(actualCreateVehiclesTypeResult.getData());
        assertEquals(400, actualCreateVehiclesTypeResult.getStatus().intValue());
    }

    /**
     * Test {@link StVehicleTypeController#createVehiclesType(StVehicleTypeEntity)}.
     * <p>
     * Method under test: {@link StVehicleTypeController#createVehiclesType(StVehicleTypeEntity)}
     */
    @Test
    @DisplayName("Test createVehiclesType(StVehicleTypeEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testCreateVehiclesType2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");
        String content = (new ObjectMapper()).writeValueAsString(stVehicleTypeEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/vehicleType/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stVehicleTypeController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StVehicleTypeController#updateVehiclesType(Long, StVehicleTypeEntity)}.
     * <p>
     * Method under test: {@link StVehicleTypeController#updateVehiclesType(Long, StVehicleTypeEntity)}
     */
    @Test
    @DisplayName("Test updateVehiclesType(Long, StVehicleTypeEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehiclesType() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StVehicleTypeController stVehicleTypeController = new StVehicleTypeController();

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

        // Act
        ApiResponse<Optional<StVehicleTypeEntity>> actualUpdateVehiclesTypeResult = stVehicleTypeController
                .updateVehiclesType(1L, stVehicleTypeEntity);

        // Assert
        assertEquals("", actualUpdateVehiclesTypeResult.getError());
        assertEquals("Bad Request", actualUpdateVehiclesTypeResult.getMessage());
        assertNull(actualUpdateVehiclesTypeResult.getData());
        assertEquals(400, actualUpdateVehiclesTypeResult.getStatus().intValue());
    }

    /**
     * Test {@link StVehicleTypeController#updateVehiclesType(Long, StVehicleTypeEntity)}.
     * <p>
     * Method under test: {@link StVehicleTypeController#updateVehiclesType(Long, StVehicleTypeEntity)}
     */
    @Test
    @DisplayName("Test updateVehiclesType(Long, StVehicleTypeEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehiclesType2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
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

        StVehicleTypeEntity stVehicleTypeEntity = new StVehicleTypeEntity();
        stVehicleTypeEntity.setAudit(audit);
        stVehicleTypeEntity.setIdVehiclesType(1L);
        stVehicleTypeEntity.setStatus(1);
        stVehicleTypeEntity.setVehiclesTypes("Vehicles Types");
        String content = (new ObjectMapper()).writeValueAsString(stVehicleTypeEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/vehicleType/update/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stVehicleTypeController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StVehicleTypeController#deleteVehicleType(Long)}.
     * <p>
     * Method under test: {@link StVehicleTypeController#deleteVehicleType(Long)}
     */
    @Test
    @DisplayName("Test deleteVehicleType(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteVehicleType() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StVehicleTypeController stVehicleTypeController = new StVehicleTypeController();
        stVehicleTypeController.stVehiclesTypeService = new StVehiclesTypeService();

        // Act
        ApiResponse<Optional<StVehicleTypeEntity>> actualDeleteVehicleTypeResult = stVehicleTypeController
                .deleteVehicleType(1L);

        // Assert
        assertEquals("", actualDeleteVehicleTypeResult.getError());
        assertEquals("Bad Request", actualDeleteVehicleTypeResult.getMessage());
        assertNull(actualDeleteVehicleTypeResult.getData());
        assertEquals(400, actualDeleteVehicleTypeResult.getStatus().intValue());
    }

    /**
     * Test {@link StVehicleTypeController#deleteVehicleType(Long)}.
     * <ul>
     *   <li>Given {@link StVehicleTypeController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehicleTypeController#deleteVehicleType(Long)}
     */
    @Test
    @DisplayName("Test deleteVehicleType(Long); given StVehicleTypeController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testDeleteVehicleType_givenStVehicleTypeController() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<Optional<StVehicleTypeEntity>> actualDeleteVehicleTypeResult = (new StVehicleTypeController())
                .deleteVehicleType(1L);

        // Assert
        assertEquals("", actualDeleteVehicleTypeResult.getError());
        assertEquals("Bad Request", actualDeleteVehicleTypeResult.getMessage());
        assertNull(actualDeleteVehicleTypeResult.getData());
        assertEquals(400, actualDeleteVehicleTypeResult.getStatus().intValue());
    }
}
