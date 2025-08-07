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
        (new StColorController()).getAllColors();
    }

    /**
     * Test {@link StColorController#getAllColorsByStatus()}.
     * <p>
     * Method under test: {@link StColorController#getAllColorsByStatus()}
     */
    @Test
    @DisplayName("Test getAllColorsByStatus()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllColorsByStatus() {
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
        (new StColorController()).getAllColorsByStatus();
    }

    /**
     * Test {@link StColorController#getColorById(Long)}.
     * <p>
     * Method under test: {@link StColorController#getColorById(Long)}
     */
    @Test
    @DisplayName("Test getColorById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetColorById() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<StColorEntity> actualColorById = (new StColorController()).getColorById(1L);

        // Assert
        assertEquals("", actualColorById.getError());
        assertEquals("Not Found", actualColorById.getMessage());
        assertNull(actualColorById.getData());
        assertEquals(404, actualColorById.getStatus().intValue());
    }

    /**
     * Test {@link StColorController#createColor(StColorEntity)}.
     * <p>
     * Method under test: {@link StColorController#createColor(StColorEntity)}
     */
    @Test
    @DisplayName("Test createColor(StColorEntity)")
    @Tag("MaintainedByDiffblue")
    void testCreateColor() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StColorController stColorController = new StColorController();

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

        // Act
        ApiResponse<Optional<StColorEntity>> actualCreateColorResult = stColorController.createColor(stColorEntity);

        // Assert
        assertEquals("", actualCreateColorResult.getError());
        assertEquals("Bad Request", actualCreateColorResult.getMessage());
        assertNull(actualCreateColorResult.getData());
        assertEquals(400, actualCreateColorResult.getStatus().intValue());
    }

    /**
     * Test {@link StColorController#createColor(StColorEntity)}.
     * <p>
     * Method under test: {@link StColorController#createColor(StColorEntity)}
     */
    @Test
    @DisplayName("Test createColor(StColorEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testCreateColor2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
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

        // Act
        MockMvcBuilders.standaloneSetup(stColorController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StColorController#updateColor(Long, StColorEntity)}.
     * <p>
     * Method under test: {@link StColorController#updateColor(Long, StColorEntity)}
     */
    @Test
    @DisplayName("Test updateColor(Long, StColorEntity)")
    @Tag("MaintainedByDiffblue")
    void testUpdateColor() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StColorController stColorController = new StColorController();

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

        // Act
        ApiResponse<Optional<StColorEntity>> actualUpdateColorResult = stColorController.updateColor(1L, stColorEntity);

        // Assert
        assertEquals("", actualUpdateColorResult.getError());
        assertEquals("Bad Request", actualUpdateColorResult.getMessage());
        assertNull(actualUpdateColorResult.getData());
        assertEquals(400, actualUpdateColorResult.getStatus().intValue());
    }

    /**
     * Test {@link StColorController#updateColor(Long, StColorEntity)}.
     * <p>
     * Method under test: {@link StColorController#updateColor(Long, StColorEntity)}
     */
    @Test
    @DisplayName("Test updateColor(Long, StColorEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateColor2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
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

        // Act
        MockMvcBuilders.standaloneSetup(stColorController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StColorController#deleteColor(Long)}.
     * <p>
     * Method under test: {@link StColorController#deleteColor(Long)}
     */
    @Test
    @DisplayName("Test deleteColor(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteColor() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<Optional<StColorEntity>> actualDeleteColorResult = (new StColorController()).deleteColor(1L);

        // Assert
        assertEquals("", actualDeleteColorResult.getError());
        assertEquals("Bad Request", actualDeleteColorResult.getMessage());
        assertNull(actualDeleteColorResult.getData());
        assertEquals(400, actualDeleteColorResult.getStatus().intValue());
    }
}