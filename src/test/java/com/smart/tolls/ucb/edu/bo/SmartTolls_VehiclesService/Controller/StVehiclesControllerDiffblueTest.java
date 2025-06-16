package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Client.CountryCityClient;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Client.PersonsClient;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CityDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CountryDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.PersonsDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StWalletEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.StVehicleRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.StVehicleResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StColorService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StFuelTypesService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StModelService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StVehiclesService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StVehiclesTypeService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StWalletService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {StVehiclesController.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class StVehiclesControllerDiffblueTest {
    @MockBean
    private CountryCityClient countryCityClient;

    @MockBean
    private PersonsClient personsClient;

    @MockBean
    private StColorService stColorService;

    @MockBean
    private StFuelTypesService stFuelTypesService;

    @MockBean
    private StModelService stModelService;

    @Autowired
    private StVehiclesController stVehiclesController;

    @MockBean
    private StVehiclesService stVehiclesService;

    @MockBean
    private StVehiclesTypeService stVehiclesTypeService;

    @MockBean
    private StWalletService stWalletService;

    /**
     * Test {@link StVehiclesController#getAllVehicles()}.
     * <ul>
     *   <li>Given {@link StVehiclesController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehiclesController#getAllVehicles()}
     */
    @Test
    @DisplayName("Test getAllVehicles(); given StVehiclesController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllVehicles_givenStVehiclesController() {
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
        (new StVehiclesController()).getAllVehicles();
    }

    /**
     * Test {@link StVehiclesController#getAllVehiclesByStatus()}.
     * <ul>
     *   <li>Given {@link StVehiclesController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehiclesController#getAllVehiclesByStatus()}
     */
    @Test
    @DisplayName("Test getAllVehiclesByStatus(); given StVehiclesController (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetAllVehiclesByStatus_givenStVehiclesController() {
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
        (new StVehiclesController()).getAllVehiclesByStatus();
    }

    /**
     * Test {@link StVehiclesController#getVehicleById(Long)}.
     * <p>
     * Method under test: {@link StVehiclesController#getVehicleById(Long)}
     */
    @Test
    @DisplayName("Test getVehicleById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleById() throws Exception {
        // Arrange
        CityDto cityDto = new CityDto();
        cityDto.setCityName("Oxford");
        cityDto.setIdCity(1L);

        ApiResponse<CityDto> apiResponse = new ApiResponse<>();
        apiResponse.setData(cityDto);
        apiResponse.setError("An error occurred");
        apiResponse.setMessage("Not all who wander are lost");
        apiResponse.setStatus(1);
        apiResponse.setUuid("01234567-89AB-CDEF-FEDC-BA9876543210");
        when(countryCityClient.getCityById(Mockito.<Long>any())).thenReturn(apiResponse);

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

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit2);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

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

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit3);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit5);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit4);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        stVehicleEntity.setAudit(audit);
        stVehicleEntity.setChassisNumber("42");
        stVehicleEntity.setEngineNumber("42");
        stVehicleEntity.setFuelTypes(fuelTypes);
        stVehicleEntity.setIdCity(1L);
        stVehicleEntity.setIdCountry(1L);
        stVehicleEntity.setIdPerson(1L);
        stVehicleEntity.setIdVehicle(1L);
        stVehicleEntity.setLicensePlate("License Plate");
        stVehicleEntity.setManufacturingYear("Manufacturing Year");
        stVehicleEntity.setVehicleStatus(1);
        stVehicleEntity.setVehiclesColors(vehiclesColors);
        stVehicleEntity.setVehiclesModels(vehiclesModels);
        stVehicleEntity.setVehiclesType(vehiclesType);
        stVehicleEntity.setWeight(10.0d);
        Optional<StVehicleEntity> ofResult = Optional.of(stVehicleEntity);
        when(stVehiclesService.getVehiclesById(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/vehicles/{id}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stVehiclesController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"status\":400,\"message\":\"No se encontro la ciudad\",\"data\":null,\"error\":\"\"}"));
    }

    /**
     * Test {@link StVehiclesController#getVehicleById(Long)}.
     * <p>
     * Method under test: {@link StVehiclesController#getVehicleById(Long)}
     */
    @Test
    @DisplayName("Test getVehicleById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleById2() throws Exception {
        // Arrange
        CityDto cityDto = new CityDto();
        cityDto.setCityName("Oxford");
        cityDto.setIdCity(1L);

        ApiResponse<CityDto> apiResponse = new ApiResponse<>();
        apiResponse.setData(cityDto);
        apiResponse.setError("An error occurred");
        apiResponse.setMessage("Not all who wander are lost");
        apiResponse.setStatus(200);
        apiResponse.setUuid("01234567-89AB-CDEF-FEDC-BA9876543210");

        CountryDto countryDto = new CountryDto();
        countryDto.setCountryName("GB");
        countryDto.setIdCountry(1L);

        ApiResponse<CountryDto> apiResponse2 = new ApiResponse<>();
        apiResponse2.setData(countryDto);
        apiResponse2.setError("An error occurred");
        apiResponse2.setMessage("Not all who wander are lost");
        apiResponse2.setStatus(1);
        apiResponse2.setUuid("01234567-89AB-CDEF-FEDC-BA9876543210");
        when(countryCityClient.getCountryById(Mockito.<Long>any())).thenReturn(apiResponse2);
        when(countryCityClient.getCityById(Mockito.<Long>any())).thenReturn(apiResponse);

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

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit2);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

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

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit3);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit5);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit4);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        stVehicleEntity.setAudit(audit);
        stVehicleEntity.setChassisNumber("42");
        stVehicleEntity.setEngineNumber("42");
        stVehicleEntity.setFuelTypes(fuelTypes);
        stVehicleEntity.setIdCity(1L);
        stVehicleEntity.setIdCountry(1L);
        stVehicleEntity.setIdPerson(1L);
        stVehicleEntity.setIdVehicle(1L);
        stVehicleEntity.setLicensePlate("License Plate");
        stVehicleEntity.setManufacturingYear("Manufacturing Year");
        stVehicleEntity.setVehicleStatus(1);
        stVehicleEntity.setVehiclesColors(vehiclesColors);
        stVehicleEntity.setVehiclesModels(vehiclesModels);
        stVehicleEntity.setVehiclesType(vehiclesType);
        stVehicleEntity.setWeight(10.0d);
        Optional<StVehicleEntity> ofResult = Optional.of(stVehicleEntity);
        when(stVehiclesService.getVehiclesById(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/vehicles/{id}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stVehiclesController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"status\":400,\"message\":\"No se encontro el pais\",\"data\":null,\"error\":\"\"}"));
    }

    /**
     * Test {@link StVehiclesController#getVehicleById(Long)}.
     * <p>
     * Method under test: {@link StVehiclesController#getVehicleById(Long)}
     */
    @Test
    @DisplayName("Test getVehicleById(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleById3() throws Exception {
        // Arrange
        CityDto cityDto = new CityDto();
        cityDto.setCityName("Oxford");
        cityDto.setIdCity(1L);

        ApiResponse<CityDto> apiResponse = new ApiResponse<>();
        apiResponse.setData(cityDto);
        apiResponse.setError("An error occurred");
        apiResponse.setMessage("Not all who wander are lost");
        apiResponse.setStatus(200);
        apiResponse.setUuid("01234567-89AB-CDEF-FEDC-BA9876543210");

        CountryDto countryDto = new CountryDto();
        countryDto.setCountryName("GB");
        countryDto.setIdCountry(1L);

        ApiResponse<CountryDto> apiResponse2 = new ApiResponse<>();
        apiResponse2.setData(countryDto);
        apiResponse2.setError("An error occurred");
        apiResponse2.setMessage("Not all who wander are lost");
        apiResponse2.setStatus(200);
        apiResponse2.setUuid("01234567-89AB-CDEF-FEDC-BA9876543210");
        when(countryCityClient.getCountryById(Mockito.<Long>any())).thenReturn(apiResponse2);
        when(countryCityClient.getCityById(Mockito.<Long>any())).thenReturn(apiResponse);

        PersonsDto personsDto = new PersonsDto();
        personsDto.setIdPerson(1L);
        personsDto.setPersonAddress("42 Main St");
        personsDto.setPersonAge("Person Age");
        personsDto.setPersonBirthdate("2020-03-01");
        personsDto.setPersonDni("Person Dni");
        personsDto.setPersonEmail("jane.doe@example.org");
        personsDto.setPersonName("Person Name");
        personsDto.setPersonSurname("Doe");
        personsDto.setPersonWhatsappNumber("42");

        ApiResponse<PersonsDto> apiResponse3 = new ApiResponse<>();
        apiResponse3.setData(personsDto);
        apiResponse3.setError("An error occurred");
        apiResponse3.setMessage("Not all who wander are lost");
        apiResponse3.setStatus(1);
        apiResponse3.setUuid("01234567-89AB-CDEF-FEDC-BA9876543210");
        when(personsClient.getPersonsById(Mockito.<Long>any())).thenReturn(apiResponse3);

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

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit2);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

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

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit3);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit5);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit4);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        stVehicleEntity.setAudit(audit);
        stVehicleEntity.setChassisNumber("42");
        stVehicleEntity.setEngineNumber("42");
        stVehicleEntity.setFuelTypes(fuelTypes);
        stVehicleEntity.setIdCity(1L);
        stVehicleEntity.setIdCountry(1L);
        stVehicleEntity.setIdPerson(1L);
        stVehicleEntity.setIdVehicle(1L);
        stVehicleEntity.setLicensePlate("License Plate");
        stVehicleEntity.setManufacturingYear("Manufacturing Year");
        stVehicleEntity.setVehicleStatus(1);
        stVehicleEntity.setVehiclesColors(vehiclesColors);
        stVehicleEntity.setVehiclesModels(vehiclesModels);
        stVehicleEntity.setVehiclesType(vehiclesType);
        stVehicleEntity.setWeight(10.0d);
        Optional<StVehicleEntity> ofResult = Optional.of(stVehicleEntity);
        when(stVehiclesService.getVehiclesById(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/vehicles/{id}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stVehiclesController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"status\":400,\"message\":\"No se encontro la persona\",\"data\":null,\"error\":\"\"}"));
    }

    /**
     * Test {@link StVehiclesController#getVehicleById(Long)}.
     * <ul>
     *   <li>Given {@link PersonsDto} (default constructor) IdPerson is one.</li>
     *   <li>Then content string a string.</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehiclesController#getVehicleById(Long)}
     */
    @Test
    @DisplayName("Test getVehicleById(Long); given PersonsDto (default constructor) IdPerson is one; then content string a string")
    @Tag("MaintainedByDiffblue")
    void testGetVehicleById_givenPersonsDtoIdPersonIsOne_thenContentStringAString() throws Exception {
        // Arrange
        CityDto cityDto = new CityDto();
        cityDto.setCityName("Oxford");
        cityDto.setIdCity(1L);

        ApiResponse<CityDto> apiResponse = new ApiResponse<>();
        apiResponse.setData(cityDto);
        apiResponse.setError("An error occurred");
        apiResponse.setMessage("Not all who wander are lost");
        apiResponse.setStatus(200);
        apiResponse.setUuid("01234567-89AB-CDEF-FEDC-BA9876543210");

        CountryDto countryDto = new CountryDto();
        countryDto.setCountryName("GB");
        countryDto.setIdCountry(1L);

        ApiResponse<CountryDto> apiResponse2 = new ApiResponse<>();
        apiResponse2.setData(countryDto);
        apiResponse2.setError("An error occurred");
        apiResponse2.setMessage("Not all who wander are lost");
        apiResponse2.setStatus(200);
        apiResponse2.setUuid("01234567-89AB-CDEF-FEDC-BA9876543210");
        when(countryCityClient.getCountryById(Mockito.<Long>any())).thenReturn(apiResponse2);
        when(countryCityClient.getCityById(Mockito.<Long>any())).thenReturn(apiResponse);

        PersonsDto personsDto = new PersonsDto();
        personsDto.setIdPerson(1L);
        personsDto.setPersonAddress("42 Main St");
        personsDto.setPersonAge("Person Age");
        personsDto.setPersonBirthdate("2020-03-01");
        personsDto.setPersonDni("Person Dni");
        personsDto.setPersonEmail("jane.doe@example.org");
        personsDto.setPersonName("Person Name");
        personsDto.setPersonSurname("Doe");
        personsDto.setPersonWhatsappNumber("42");

        ApiResponse<PersonsDto> apiResponse3 = new ApiResponse<>();
        apiResponse3.setData(personsDto);
        apiResponse3.setError("An error occurred");
        apiResponse3.setMessage("Not all who wander are lost");
        apiResponse3.setStatus(200);
        apiResponse3.setUuid("01234567-89AB-CDEF-FEDC-BA9876543210");
        when(personsClient.getPersonsById(Mockito.<Long>any())).thenReturn(apiResponse3);

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

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit2);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

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

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit3);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit5);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit4);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        stVehicleEntity.setAudit(audit);
        stVehicleEntity.setChassisNumber("42");
        stVehicleEntity.setEngineNumber("42");
        stVehicleEntity.setFuelTypes(fuelTypes);
        stVehicleEntity.setIdCity(1L);
        stVehicleEntity.setIdCountry(1L);
        stVehicleEntity.setIdPerson(1L);
        stVehicleEntity.setIdVehicle(1L);
        stVehicleEntity.setLicensePlate("License Plate");
        stVehicleEntity.setManufacturingYear("Manufacturing Year");
        stVehicleEntity.setVehicleStatus(1);
        stVehicleEntity.setVehiclesColors(vehiclesColors);
        stVehicleEntity.setVehiclesModels(vehiclesModels);
        stVehicleEntity.setVehiclesType(vehiclesType);
        stVehicleEntity.setWeight(10.0d);
        Optional<StVehicleEntity> ofResult = Optional.of(stVehicleEntity);
        when(stVehiclesService.getVehiclesById(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/vehicles/{id}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stVehiclesController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"OK\",\"data\":{\"idVehicle\":1,\"licensePlate\":\"License Plate\",\"chassisNumber\":\"42"
                                        + "\",\"engineNumber\":\"42\",\"manufacturingYear\":\"Manufacturing Year\",\"weight\":10.0,\"wallet\":null,\"fuelTypes"
                                        + "\":{\"idFuelType\":1,\"fuelTypeFuel\":\"Fuel Type Fuel\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate"
                                        + "\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate"
                                        + "\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\""
                                        + ",\"recordVersion\":1}},\"vehiclesColors\":{\"idColor\":1,\"colorDescription\":\"Color Description\",\"colorName\":\"Color"
                                        + " Name\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01"
                                        + "\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main"
                                        + " St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesModels\""
                                        + ":{\"idModel\":1,\"modelName\":\"Model Name\",\"modelDescription\":\"Model Description\",\"brand\":{\"idBrand\":1,"
                                        + "\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand Description\",\"brandManufacturingCountry\":\"GB\","
                                        + "\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\","
                                        + "\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main"
                                        + " St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"status\":1,\"audit"
                                        + "\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1"
                                        + ",0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\","
                                        + "\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesType\":{\"idVehiclesType\":1,"
                                        + "\"vehiclesTypes\":\"Vehicles Types\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0"
                                        + ",0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1"
                                        + ",0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion"
                                        + "\":1}},\"city\":{\"idCity\":1,\"cityName\":\"Oxford\"},\"country\":{\"idCountry\":1,\"countryName\":\"GB\"},\"persons\""
                                        + ":{\"idPerson\":1,\"personName\":\"Person Name\",\"personSurname\":\"Doe\",\"personWhatsappNumber\":\"42\",\"personDni"
                                        + "\":\"Person Dni\",\"personBirthdate\":\"2020-03-01\",\"personEmail\":\"jane.doe@example.org\",\"personAddress\":\"42"
                                        + " Main St\",\"personAge\":\"Person Age\"},\"vehiclestatus\":1},\"error\":\"\"}"));
    }

    /**
     * Test {@link StVehiclesController#getWalletByVehicleId(Long)}.
     * <p>
     * Method under test: {@link StVehiclesController#getWalletByVehicleId(Long)}
     */
    @Test
    @DisplayName("Test getWalletByVehicleId(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetWalletByVehicleId() throws Exception {
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

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit3);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit4);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(new Audit());
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit5);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity vehicle = new StVehicleEntity();
        vehicle.setAudit(audit2);
        vehicle.setChassisNumber("42");
        vehicle.setEngineNumber("42");
        vehicle.setFuelTypes(fuelTypes);
        vehicle.setIdCity(1L);
        vehicle.setIdCountry(1L);
        vehicle.setIdPerson(1L);
        vehicle.setIdVehicle(1L);
        vehicle.setLicensePlate("License Plate");
        vehicle.setManufacturingYear("Manufacturing Year");
        vehicle.setVehicleStatus(1);
        vehicle.setVehiclesColors(vehiclesColors);
        vehicle.setVehiclesModels(vehiclesModels);
        vehicle.setVehiclesType(vehiclesType);
        vehicle.setWeight(10.0d);

        StWalletEntity stWalletEntity = new StWalletEntity();
        stWalletEntity.setAudit(audit);
        stWalletEntity.setBalance(10.0d);
        stWalletEntity.setIdWallet(1L);
        stWalletEntity.setVehicle(vehicle);
        stWalletEntity.setWalletBusiness("Wallet Business");
        stWalletEntity.setWalletCVS("Wallet CVS");
        stWalletEntity.setWalletName("Wallet Name");
        stWalletEntity.setWalletNumber("42");
        Optional<StWalletEntity> ofResult = Optional.of(stWalletEntity);
        when(stWalletService.getWalletByVehicleId(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/vehicles/{vehicleId}/wallet", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stVehiclesController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"OK\",\"data\":{\"idWallet\":1,\"balance\":10.0,\"walletNumber\":\"42\",\"walletCVS\":\"Wallet"
                                        + " CVS\",\"walletName\":\"Wallet Name\",\"walletBusiness\":\"Wallet Business\",\"vehicle\":{\"idVehicle\":1,\"licensePlate"
                                        + "\":\"License Plate\",\"chassisNumber\":\"42\",\"engineNumber\":\"42\",\"manufacturingYear\":\"Manufacturing"
                                        + " Year\",\"weight\":10.0,\"idPerson\":1,\"idCity\":1,\"idCountry\":1,\"fuelTypes\":{\"idFuelType\":1,\"fuelTypeFuel\":\"Fuel"
                                        + " Type Fuel\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020"
                                        + "-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42"
                                        + " Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesColors"
                                        + "\":{\"idColor\":1,\"colorDescription\":\"Color Description\",\"colorName\":\"Color Name\",\"status\":1,\"audit\":{"
                                        + "\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0"
                                        + "],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\","
                                        + "\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesModels\":{\"idModel\":1,\"modelName\":\"Model"
                                        + " Name\",\"modelDescription\":\"Model Description\",\"brand\":{\"idBrand\":1,\"brandName\":\"Brand Name\","
                                        + "\"brandDescription\":\"Brand Description\",\"brandManufacturingCountry\":\"GB\",\"status\":1,\"audit\":{\"createBy"
                                        + "\":null,\"createDate\":null,\"updateBy\":null,\"updateDate\":null,\"deleteBy\":null,\"deleteDate\":null,\"ipAddress"
                                        + "\":null,\"action\":null,\"previousValue\":null,\"currentValue\":null,\"recordVersion\":null}},\"status\":1,\"audit"
                                        + "\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1"
                                        + ",0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\","
                                        + "\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesType\":{\"idVehiclesType\":1,"
                                        + "\"vehiclesTypes\":\"Vehicles Types\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0"
                                        + ",0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1"
                                        + ",0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion"
                                        + "\":1}},\"vehicleStatus\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020"
                                        + "-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42"
                                        + " Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"audit\":{"
                                        + "\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0"
                                        + "],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\","
                                        + "\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"error\":\"\"}"));
    }

    /**
     * Test {@link StVehiclesController#updateWalletBalance(Long, Double)}.
     * <p>
     * Method under test: {@link StVehiclesController#updateWalletBalance(Long, Double)}
     */
    @Test
    @DisplayName("Test updateWalletBalance(Long, Double)")
    @Tag("MaintainedByDiffblue")
    void testUpdateWalletBalance() throws Exception {
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

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit3);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit4);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(new Audit());
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit5);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity vehicle = new StVehicleEntity();
        vehicle.setAudit(audit2);
        vehicle.setChassisNumber("42");
        vehicle.setEngineNumber("42");
        vehicle.setFuelTypes(fuelTypes);
        vehicle.setIdCity(1L);
        vehicle.setIdCountry(1L);
        vehicle.setIdPerson(1L);
        vehicle.setIdVehicle(1L);
        vehicle.setLicensePlate("License Plate");
        vehicle.setManufacturingYear("Manufacturing Year");
        vehicle.setVehicleStatus(1);
        vehicle.setVehiclesColors(vehiclesColors);
        vehicle.setVehiclesModels(vehiclesModels);
        vehicle.setVehiclesType(vehiclesType);
        vehicle.setWeight(10.0d);

        StWalletEntity stWalletEntity = new StWalletEntity();
        stWalletEntity.setAudit(audit);
        stWalletEntity.setBalance(10.0d);
        stWalletEntity.setIdWallet(1L);
        stWalletEntity.setVehicle(vehicle);
        stWalletEntity.setWalletBusiness("Wallet Business");
        stWalletEntity.setWalletCVS("Wallet CVS");
        stWalletEntity.setWalletName("Wallet Name");
        stWalletEntity.setWalletNumber("42");
        Optional<StWalletEntity> ofResult = Optional.of(stWalletEntity);

        Audit audit7 = new Audit();
        audit7.setAction("Action");
        audit7.setCreateBy("Create By");
        audit7.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit7.setCurrentValue("42");
        audit7.setDeleteBy("Delete By");
        audit7.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit7.setIpAddress("42 Main St");
        audit7.setPreviousValue("42");
        audit7.setRecordVersion(1);
        audit7.setUpdateBy("2020-03-01");
        audit7.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit8 = new Audit();
        audit8.setAction("Action");
        audit8.setCreateBy("Create By");
        audit8.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit8.setCurrentValue("42");
        audit8.setDeleteBy("Delete By");
        audit8.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit8.setIpAddress("42 Main St");
        audit8.setPreviousValue("42");
        audit8.setRecordVersion(1);
        audit8.setUpdateBy("2020-03-01");
        audit8.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit9 = new Audit();
        audit9.setAction("Action");
        audit9.setCreateBy("Create By");
        audit9.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit9.setCurrentValue("42");
        audit9.setDeleteBy("Delete By");
        audit9.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit9.setIpAddress("42 Main St");
        audit9.setPreviousValue("42");
        audit9.setRecordVersion(1);
        audit9.setUpdateBy("2020-03-01");
        audit9.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StFuelTypesEntity fuelTypes2 = new StFuelTypesEntity();
        fuelTypes2.setAudit(audit9);
        fuelTypes2.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes2.setIdFuelType(1L);
        fuelTypes2.setStatus(1);

        Audit audit10 = new Audit();
        audit10.setAction("Action");
        audit10.setCreateBy("Create By");
        audit10.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit10.setCurrentValue("42");
        audit10.setDeleteBy("Delete By");
        audit10.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit10.setIpAddress("42 Main St");
        audit10.setPreviousValue("42");
        audit10.setRecordVersion(1);
        audit10.setUpdateBy("2020-03-01");
        audit10.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StColorEntity vehiclesColors2 = new StColorEntity();
        vehiclesColors2.setAudit(audit10);
        vehiclesColors2.setColorDescription("Color Description");
        vehiclesColors2.setColorName("Color Name");
        vehiclesColors2.setIdColor(1L);
        vehiclesColors2.setStatus(1);

        Audit audit11 = new Audit();
        audit11.setAction("Action");
        audit11.setCreateBy("Create By");
        audit11.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit11.setCurrentValue("42");
        audit11.setDeleteBy("Delete By");
        audit11.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit11.setIpAddress("42 Main St");
        audit11.setPreviousValue("42");
        audit11.setRecordVersion(1);
        audit11.setUpdateBy("2020-03-01");
        audit11.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand2 = new StBrandEntity();
        brand2.setAudit(new Audit());
        brand2.setBrandDescription("Brand Description");
        brand2.setBrandManufacturingCountry("GB");
        brand2.setBrandName("Brand Name");
        brand2.setIdBrand(1L);
        brand2.setStatus(1);

        StModelEntity vehiclesModels2 = new StModelEntity();
        vehiclesModels2.setAudit(audit11);
        vehiclesModels2.setBrand(brand2);
        vehiclesModels2.setIdModel(1L);
        vehiclesModels2.setModelDescription("Model Description");
        vehiclesModels2.setModelName("Model Name");
        vehiclesModels2.setStatus(1);

        Audit audit12 = new Audit();
        audit12.setAction("Action");
        audit12.setCreateBy("Create By");
        audit12.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit12.setCurrentValue("42");
        audit12.setDeleteBy("Delete By");
        audit12.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit12.setIpAddress("42 Main St");
        audit12.setPreviousValue("42");
        audit12.setRecordVersion(1);
        audit12.setUpdateBy("2020-03-01");
        audit12.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType2 = new StVehicleTypeEntity();
        vehiclesType2.setAudit(audit12);
        vehiclesType2.setIdVehiclesType(1L);
        vehiclesType2.setStatus(1);
        vehiclesType2.setVehiclesTypes("Vehicles Types");

        StVehicleEntity vehicle2 = new StVehicleEntity();
        vehicle2.setAudit(audit8);
        vehicle2.setChassisNumber("42");
        vehicle2.setEngineNumber("42");
        vehicle2.setFuelTypes(fuelTypes2);
        vehicle2.setIdCity(1L);
        vehicle2.setIdCountry(1L);
        vehicle2.setIdPerson(1L);
        vehicle2.setIdVehicle(1L);
        vehicle2.setLicensePlate("License Plate");
        vehicle2.setManufacturingYear("Manufacturing Year");
        vehicle2.setVehicleStatus(1);
        vehicle2.setVehiclesColors(vehiclesColors2);
        vehicle2.setVehiclesModels(vehiclesModels2);
        vehicle2.setVehiclesType(vehiclesType2);
        vehicle2.setWeight(10.0d);

        StWalletEntity stWalletEntity2 = new StWalletEntity();
        stWalletEntity2.setAudit(audit7);
        stWalletEntity2.setBalance(10.0d);
        stWalletEntity2.setIdWallet(1L);
        stWalletEntity2.setVehicle(vehicle2);
        stWalletEntity2.setWalletBusiness("Wallet Business");
        stWalletEntity2.setWalletCVS("Wallet CVS");
        stWalletEntity2.setWalletName("Wallet Name");
        stWalletEntity2.setWalletNumber("42");
        Optional<StWalletEntity> ofResult2 = Optional.of(stWalletEntity2);
        when(stWalletService.updateWalletBalance(Mockito.<Long>any(), Mockito.<Double>any())).thenReturn(ofResult2);
        when(stWalletService.getWalletByVehicleId(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder putResult = MockMvcRequestBuilders.put("/api/vehicles/{vehicleId}/wallet/balance",
                1L);
        MockHttpServletRequestBuilder requestBuilder = putResult.param("amount", String.valueOf(10.0d));

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stVehiclesController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"Balance actualizado exitosamente\",\"data\":{\"idWallet\":1,\"balance\":10.0,"
                                        + "\"walletNumber\":\"42\",\"walletCVS\":\"Wallet CVS\",\"walletName\":\"Wallet Name\",\"walletBusiness\":\"Wallet"
                                        + " Business\",\"vehicle\":{\"idVehicle\":1,\"licensePlate\":\"License Plate\",\"chassisNumber\":\"42\",\"engineNumber"
                                        + "\":\"42\",\"manufacturingYear\":\"Manufacturing Year\",\"weight\":10.0,\"idPerson\":1,\"idCity\":1,\"idCountry\":1,"
                                        + "\"fuelTypes\":{\"idFuelType\":1,\"fuelTypeFuel\":\"Fuel Type Fuel\",\"status\":1,\"audit\":{\"createBy\":\"Create"
                                        + " By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete"
                                        + " By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\","
                                        + "\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesColors\":{\"idColor\":1,\"colorDescription\":\"Color"
                                        + " Description\",\"colorName\":\"Color Name\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970"
                                        + ",1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":"
                                        + "[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\","
                                        + "\"recordVersion\":1}},\"vehiclesModels\":{\"idModel\":1,\"modelName\":\"Model Name\",\"modelDescription\":\"Model"
                                        + " Description\",\"brand\":{\"idBrand\":1,\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand Description\","
                                        + "\"brandManufacturingCountry\":\"GB\",\"status\":1,\"audit\":{\"createBy\":null,\"createDate\":null,\"updateBy\":null"
                                        + ",\"updateDate\":null,\"deleteBy\":null,\"deleteDate\":null,\"ipAddress\":null,\"action\":null,\"previousValue\""
                                        + ":null,\"currentValue\":null,\"recordVersion\":null}},\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate"
                                        + "\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate"
                                        + "\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\""
                                        + ",\"recordVersion\":1}},\"vehiclesType\":{\"idVehiclesType\":1,\"vehiclesTypes\":\"Vehicles Types\",\"status\":1,"
                                        + "\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970"
                                        + ",1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action"
                                        + "\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehicleStatus\":1,\"audit\":{\"createBy\":\"Create"
                                        + " By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete"
                                        + " By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\","
                                        + "\"currentValue\":\"42\",\"recordVersion\":1}},\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],"
                                        + "\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0"
                                        + "],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion"
                                        + "\":1}},\"error\":\"\"}"));
    }

    /**
     * Test {@link StVehiclesController#getVehiclesByPersonId(Long)}.
     * <p>
     * Method under test: {@link StVehiclesController#getVehiclesByPersonId(Long)}
     */
    @Test
    @DisplayName("Test getVehiclesByPersonId(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetVehiclesByPersonId() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StVehiclesController stVehiclesController = new StVehiclesController();
        stVehiclesController.stVehiclesService = new StVehiclesService();

        // Act
        ApiResponse<List<StVehicleResponse>> actualVehiclesByPersonId = stVehiclesController.getVehiclesByPersonId(1L);

        // Assert
        assertEquals("", actualVehiclesByPersonId.getError());
        assertEquals("Error al obtener los vehículos: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StVehicleRepository.findVehiclesByPersonId(java.lang.Long)\" because \"<local3>.stVehicleRepository"
                + "\" is null", actualVehiclesByPersonId.getMessage());
        assertNull(actualVehiclesByPersonId.getData());
        assertEquals(500, actualVehiclesByPersonId.getStatus().intValue());
    }

    /**
     * Test {@link StVehiclesController#getVehiclesByPersonId(Long)}.
     * <ul>
     *   <li>Given {@link StVehiclesController} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehiclesController#getVehiclesByPersonId(Long)}
     */
    @Test
    @DisplayName("Test getVehiclesByPersonId(Long); given StVehiclesController (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testGetVehiclesByPersonId_givenStVehiclesController() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<List<StVehicleResponse>> actualVehiclesByPersonId = (new StVehiclesController())
                .getVehiclesByPersonId(1L);

        // Assert
        assertEquals("", actualVehiclesByPersonId.getError());
        assertEquals("Error al obtener los vehículos: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Service.StVehiclesService.getVehiclesByPersonId(java.lang.Long)\" because \"this.stVehiclesService\""
                + " is null", actualVehiclesByPersonId.getMessage());
        assertNull(actualVehiclesByPersonId.getData());
        assertEquals(500, actualVehiclesByPersonId.getStatus().intValue());
    }

    /**
     * Test {@link StVehiclesController#createVehicles(StVehicleRequest)}.
     * <p>
     * Method under test: {@link StVehiclesController#createVehicles(StVehicleRequest)}
     */
    @Test
    @DisplayName("Test createVehicles(StVehicleRequest)")
    @Tag("MaintainedByDiffblue")
    void testCreateVehicles() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StVehiclesController stVehiclesController = new StVehiclesController();

        StVehicleRequest stVehicleRequest = new StVehicleRequest();
        stVehicleRequest.setChassisNumber("42");
        stVehicleRequest.setEngineNumber("42");
        stVehicleRequest.setIdCity(1L);
        stVehicleRequest.setIdCountry(1L);
        stVehicleRequest.setIdFuelTypes(1L);
        stVehicleRequest.setIdPerson(1L);
        stVehicleRequest.setIdVehicle(1L);
        stVehicleRequest.setIdVehiclesBrand(1L);
        stVehicleRequest.setIdVehiclesColors(1L);
        stVehicleRequest.setIdVehiclesModels(1L);
        stVehicleRequest.setIdVehiclesType(1L);
        stVehicleRequest.setLicensePlate("License Plate");
        stVehicleRequest.setManufacturingYear("Manufacturing Year");
        stVehicleRequest.setWeight(10.0d);

        // Act
        ApiResponse<Optional<StVehicleEntity>> actualCreateVehiclesResult = stVehiclesController
                .createVehicles(stVehicleRequest);

        // Assert
        assertEquals("", actualCreateVehiclesResult.getError());
        assertEquals("Bad Request", actualCreateVehiclesResult.getMessage());
        assertNull(actualCreateVehiclesResult.getData());
        assertEquals(400, actualCreateVehiclesResult.getStatus().intValue());
    }

    /**
     * Test {@link StVehiclesController#updateVehicle(Long, StVehicleEntity)}.
     * <p>
     * Method under test: {@link StVehiclesController#updateVehicle(Long, StVehicleEntity)}
     */
    @Test
    @DisplayName("Test updateVehicle(Long, StVehicleEntity)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehicle() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDateTime` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity["fuelTypes"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity["audit"]->com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit["createDate"])
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

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit2);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

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

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit3);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit5);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit4);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        stVehicleEntity.setAudit(audit);
        stVehicleEntity.setChassisNumber("42");
        stVehicleEntity.setEngineNumber("42");
        stVehicleEntity.setFuelTypes(fuelTypes);
        stVehicleEntity.setIdCity(1L);
        stVehicleEntity.setIdCountry(1L);
        stVehicleEntity.setIdPerson(1L);
        stVehicleEntity.setIdVehicle(1L);
        stVehicleEntity.setLicensePlate("License Plate");
        stVehicleEntity.setManufacturingYear("Manufacturing Year");
        stVehicleEntity.setVehicleStatus(1);
        stVehicleEntity.setVehiclesColors(vehiclesColors);
        stVehicleEntity.setVehiclesModels(vehiclesModels);
        stVehicleEntity.setVehiclesType(vehiclesType);
        stVehicleEntity.setWeight(10.0d);
        String content = (new ObjectMapper()).writeValueAsString(stVehicleEntity);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/vehicles/update/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stVehiclesController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StVehiclesController#updateVehicle(Long, StVehicleEntity)}.
     * <ul>
     *   <li>Given {@link Audit} (default constructor) Action is {@code Action}.</li>
     *   <li>When {@link StVehicleEntity#StVehicleEntity()} Audit is {@link Audit} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehiclesController#updateVehicle(Long, StVehicleEntity)}
     */
    @Test
    @DisplayName("Test updateVehicle(Long, StVehicleEntity); given Audit (default constructor) Action is 'Action'; when StVehicleEntity() Audit is Audit (default constructor)")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehicle_givenAuditActionIsAction_whenStVehicleEntityAuditIsAudit() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StVehiclesController stVehiclesController = new StVehiclesController();

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

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit2);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

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

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit3);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit5);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit4);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        stVehicleEntity.setAudit(audit);
        stVehicleEntity.setChassisNumber("42");
        stVehicleEntity.setEngineNumber("42");
        stVehicleEntity.setFuelTypes(fuelTypes);
        stVehicleEntity.setIdCity(1L);
        stVehicleEntity.setIdCountry(1L);
        stVehicleEntity.setIdPerson(1L);
        stVehicleEntity.setIdVehicle(1L);
        stVehicleEntity.setLicensePlate("License Plate");
        stVehicleEntity.setManufacturingYear("Manufacturing Year");
        stVehicleEntity.setVehicleStatus(1);
        stVehicleEntity.setVehiclesColors(vehiclesColors);
        stVehicleEntity.setVehiclesModels(vehiclesModels);
        stVehicleEntity.setVehiclesType(vehiclesType);
        stVehicleEntity.setWeight(10.0d);

        // Act
        ApiResponse<Optional<StVehicleEntity>> actualUpdateVehicleResult = stVehiclesController.updateVehicle(1L,
                stVehicleEntity);

        // Assert
        assertEquals("", actualUpdateVehicleResult.getError());
        assertEquals("Bad Request", actualUpdateVehicleResult.getMessage());
        assertNull(actualUpdateVehicleResult.getData());
        assertEquals(400, actualUpdateVehicleResult.getStatus().intValue());
    }

    /**
     * Test {@link StVehiclesController#updateVehicle(Long, StVehicleEntity)}.
     * <ul>
     *   <li>When {@link StVehicleEntity}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StVehiclesController#updateVehicle(Long, StVehicleEntity)}
     */
    @Test
    @DisplayName("Test updateVehicle(Long, StVehicleEntity); when StVehicleEntity")
    @Tag("MaintainedByDiffblue")
    void testUpdateVehicle_whenStVehicleEntity() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<Optional<StVehicleEntity>> actualUpdateVehicleResult = (new StVehiclesController()).updateVehicle(1L,
                mock(StVehicleEntity.class));

        // Assert
        assertEquals("", actualUpdateVehicleResult.getError());
        assertEquals("Bad Request", actualUpdateVehicleResult.getMessage());
        assertNull(actualUpdateVehicleResult.getData());
        assertEquals(400, actualUpdateVehicleResult.getStatus().intValue());
    }

    /**
     * Test {@link StVehiclesController#deleteVehicle(Long)}.
     * <p>
     * Method under test: {@link StVehiclesController#deleteVehicle(Long)}
     */
    @Test
    @DisplayName("Test deleteVehicle(Long)")
    @Tag("MaintainedByDiffblue")
    void testDeleteVehicle() throws Exception {
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

        StFuelTypesEntity fuelTypes = new StFuelTypesEntity();
        fuelTypes.setAudit(audit2);
        fuelTypes.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes.setIdFuelType(1L);
        fuelTypes.setStatus(1);

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

        StColorEntity vehiclesColors = new StColorEntity();
        vehiclesColors.setAudit(audit3);
        vehiclesColors.setColorDescription("Color Description");
        vehiclesColors.setColorName("Color Name");
        vehiclesColors.setIdColor(1L);
        vehiclesColors.setStatus(1);

        Audit audit4 = new Audit();
        audit4.setAction("Action");
        audit4.setCreateBy("Create By");
        audit4.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setCurrentValue("42");
        audit4.setDeleteBy("Delete By");
        audit4.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit4.setIpAddress("42 Main St");
        audit4.setPreviousValue("42");
        audit4.setRecordVersion(1);
        audit4.setUpdateBy("2020-03-01");
        audit4.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        Audit audit5 = new Audit();
        audit5.setAction("Action");
        audit5.setCreateBy("Create By");
        audit5.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setCurrentValue("42");
        audit5.setDeleteBy("Delete By");
        audit5.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit5.setIpAddress("42 Main St");
        audit5.setPreviousValue("42");
        audit5.setRecordVersion(1);
        audit5.setUpdateBy("2020-03-01");
        audit5.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StBrandEntity brand = new StBrandEntity();
        brand.setAudit(audit5);
        brand.setBrandDescription("Brand Description");
        brand.setBrandManufacturingCountry("GB");
        brand.setBrandName("Brand Name");
        brand.setIdBrand(1L);
        brand.setStatus(1);

        StModelEntity vehiclesModels = new StModelEntity();
        vehiclesModels.setAudit(audit4);
        vehiclesModels.setBrand(brand);
        vehiclesModels.setIdModel(1L);
        vehiclesModels.setModelDescription("Model Description");
        vehiclesModels.setModelName("Model Name");
        vehiclesModels.setStatus(1);

        Audit audit6 = new Audit();
        audit6.setAction("Action");
        audit6.setCreateBy("Create By");
        audit6.setCreateDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setCurrentValue("42");
        audit6.setDeleteBy("Delete By");
        audit6.setDeleteDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        audit6.setIpAddress("42 Main St");
        audit6.setPreviousValue("42");
        audit6.setRecordVersion(1);
        audit6.setUpdateBy("2020-03-01");
        audit6.setUpdateDate(LocalDate.of(1970, 1, 1).atStartOfDay());

        StVehicleTypeEntity vehiclesType = new StVehicleTypeEntity();
        vehiclesType.setAudit(audit6);
        vehiclesType.setIdVehiclesType(1L);
        vehiclesType.setStatus(1);
        vehiclesType.setVehiclesTypes("Vehicles Types");

        StVehicleEntity stVehicleEntity = new StVehicleEntity();
        stVehicleEntity.setAudit(audit);
        stVehicleEntity.setChassisNumber("42");
        stVehicleEntity.setEngineNumber("42");
        stVehicleEntity.setFuelTypes(fuelTypes);
        stVehicleEntity.setIdCity(1L);
        stVehicleEntity.setIdCountry(1L);
        stVehicleEntity.setIdPerson(1L);
        stVehicleEntity.setIdVehicle(1L);
        stVehicleEntity.setLicensePlate("License Plate");
        stVehicleEntity.setManufacturingYear("Manufacturing Year");
        stVehicleEntity.setVehicleStatus(1);
        stVehicleEntity.setVehiclesColors(vehiclesColors);
        stVehicleEntity.setVehiclesModels(vehiclesModels);
        stVehicleEntity.setVehiclesType(vehiclesType);
        stVehicleEntity.setWeight(10.0d);
        Optional<StVehicleEntity> ofResult = Optional.of(stVehicleEntity);
        when(stVehiclesService.deleteVehicle(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api/vehicles/delete/{id}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stVehiclesController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"OK\",\"data\":{\"idVehicle\":1,\"licensePlate\":\"License Plate\",\"chassisNumber\":\"42"
                                        + "\",\"engineNumber\":\"42\",\"manufacturingYear\":\"Manufacturing Year\",\"weight\":10.0,\"idPerson\":1,\"idCity\":1"
                                        + ",\"idCountry\":1,\"fuelTypes\":{\"idFuelType\":1,\"fuelTypeFuel\":\"Fuel Type Fuel\",\"status\":1,\"audit\":{\"createBy"
                                        + "\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy"
                                        + "\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\""
                                        + ":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesColors\":{\"idColor\":1,\"colorDescription\":\"Color"
                                        + " Description\",\"colorName\":\"Color Name\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970"
                                        + ",1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":"
                                        + "[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\","
                                        + "\"recordVersion\":1}},\"vehiclesModels\":{\"idModel\":1,\"modelName\":\"Model Name\",\"modelDescription\":\"Model"
                                        + " Description\",\"brand\":{\"idBrand\":1,\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand Description\","
                                        + "\"brandManufacturingCountry\":\"GB\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0"
                                        + ",0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1"
                                        + ",0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion"
                                        + "\":1}},\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\""
                                        + ",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main"
                                        + " St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesType\":{"
                                        + "\"idVehiclesType\":1,\"vehiclesTypes\":\"Vehicles Types\",\"status\":1,\"audit\":{\"createBy\":\"Create By\","
                                        + "\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete"
                                        + " By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\","
                                        + "\"currentValue\":\"42\",\"recordVersion\":1}},\"vehicleStatus\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate"
                                        + "\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate"
                                        + "\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\""
                                        + ",\"recordVersion\":1}},\"error\":\"\"}"));
    }
}
