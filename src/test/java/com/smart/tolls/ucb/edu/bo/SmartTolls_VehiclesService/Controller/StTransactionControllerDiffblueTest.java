package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StTransactionEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StWalletEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request.TransactionRequest;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.TransactionResponse;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StTransactionService;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
class StTransactionControllerDiffblueTest {
    @InjectMocks
    private StTransactionController stTransactionController;

    @MockBean
    private StTransactionService stTransactionService;

    /**
     * Test {@link StTransactionController#processTransaction(TransactionRequest)}.
     * <p>
     * Method under test: {@link StTransactionController#processTransaction(TransactionRequest)}
     */
    @Test
    @DisplayName("Test processTransaction(TransactionRequest)")
    @Tag("MaintainedByDiffblue")
    void testProcessTransaction() throws Exception {
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

        StFuelTypesEntity fuelTypes2 = new StFuelTypesEntity();
        fuelTypes2.setAudit(new Audit());
        fuelTypes2.setFuelTypeFuel("Fuel Type Fuel");
        fuelTypes2.setIdFuelType(1L);
        fuelTypes2.setStatus(1);

        StColorEntity vehiclesColors2 = new StColorEntity();
        vehiclesColors2.setAudit(new Audit());
        vehiclesColors2.setColorDescription("Color Description");
        vehiclesColors2.setColorName("Color Name");
        vehiclesColors2.setIdColor(1L);
        vehiclesColors2.setStatus(1);

        StModelEntity vehiclesModels2 = new StModelEntity();
        vehiclesModels2.setAudit(new Audit());
        vehiclesModels2.setBrand(new StBrandEntity());
        vehiclesModels2.setIdModel(1L);
        vehiclesModels2.setModelDescription("Model Description");
        vehiclesModels2.setModelName("Model Name");
        vehiclesModels2.setStatus(1);

        StVehicleTypeEntity vehiclesType2 = new StVehicleTypeEntity();
        vehiclesType2.setAudit(new Audit());
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

        StWalletEntity wallet = new StWalletEntity();
        wallet.setAudit(audit7);
        wallet.setBalance(10.0d);
        wallet.setIdWallet(1L);
        wallet.setVehicle(vehicle2);
        wallet.setWalletBusiness("Wallet Business");
        wallet.setWalletCVS("Wallet CVS");
        wallet.setWalletName("Wallet Name");
        wallet.setWalletNumber("42");

        StTransactionEntity stTransactionEntity = new StTransactionEntity();
        stTransactionEntity.setAmount(10.0d);
        stTransactionEntity.setAudit(audit);
        stTransactionEntity.setTollId(1L);
        stTransactionEntity.setTransactionDate(LocalDate.of(1970, 1, 1).atStartOfDay());
        stTransactionEntity.setTransactionId(1L);
        stTransactionEntity.setVehicle(vehicle);
        stTransactionEntity.setWallet(wallet);
        Optional<StTransactionEntity> ofResult = Optional.of(stTransactionEntity);
        when(stTransactionService.processTransaction(Mockito.<TransactionRequest>any())).thenReturn(ofResult);

        TransactionRequest transactionRequest = new TransactionRequest();
        transactionRequest.setTollId(1L);
        transactionRequest.setVehicleId(1L);
        transactionRequest.setWalletId(1L);
        String content = (new ObjectMapper()).writeValueAsString(transactionRequest);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/transactions/process")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stTransactionController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"TransacciÃ³n exitosa\",\"data\":{\"transactionId\":1,\"tollId\":1,\"transactionDate"
                                        + "\":[1970,1,1,0,0],\"amount\":10.0,\"vehicle\":{\"idVehicle\":1,\"licensePlate\":\"License Plate\",\"chassisNumber"
                                        + "\":\"42\",\"engineNumber\":\"42\",\"manufacturingYear\":\"Manufacturing Year\",\"weight\":10.0,\"idPerson\":1,\"idCity"
                                        + "\":1,\"idCountry\":1,\"fuelTypes\":{\"idFuelType\":1,\"fuelTypeFuel\":\"Fuel Type Fuel\",\"status\":1,\"audit\":{"
                                        + "\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0"
                                        + "],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\","
                                        + "\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesColors\":{\"idColor\":1,\"colorDescription"
                                        + "\":\"Color Description\",\"colorName\":\"Color Name\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate"
                                        + "\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate"
                                        + "\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\""
                                        + ",\"recordVersion\":1}},\"vehiclesModels\":{\"idModel\":1,\"modelName\":\"Model Name\",\"modelDescription\":\"Model"
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
                                        + "\"currentValue\":\"42\",\"recordVersion\":1}},\"wallet\":{\"idWallet\":1,\"balance\":10.0,\"walletNumber\":\"42\","
                                        + "\"walletCVS\":\"Wallet CVS\",\"walletName\":\"Wallet Name\",\"walletBusiness\":\"Wallet Business\",\"vehicle\":{"
                                        + "\"idVehicle\":1,\"licensePlate\":\"License Plate\",\"chassisNumber\":\"42\",\"engineNumber\":\"42\",\"manufacturingYear"
                                        + "\":\"Manufacturing Year\",\"weight\":10.0,\"idPerson\":1,\"idCity\":1,\"idCountry\":1,\"fuelTypes\":{\"idFuelType\""
                                        + ":1,\"fuelTypeFuel\":\"Fuel Type Fuel\",\"status\":1,\"audit\":{\"createBy\":null,\"createDate\":null,\"updateBy\""
                                        + ":null,\"updateDate\":null,\"deleteBy\":null,\"deleteDate\":null,\"ipAddress\":null,\"action\":null,\"previousValue"
                                        + "\":null,\"currentValue\":null,\"recordVersion\":null}},\"vehiclesColors\":{\"idColor\":1,\"colorDescription\":\"Color"
                                        + " Description\",\"colorName\":\"Color Name\",\"status\":1,\"audit\":{\"createBy\":null,\"createDate\":null,\"updateBy"
                                        + "\":null,\"updateDate\":null,\"deleteBy\":null,\"deleteDate\":null,\"ipAddress\":null,\"action\":null,\"previousValue"
                                        + "\":null,\"currentValue\":null,\"recordVersion\":null}},\"vehiclesModels\":{\"idModel\":1,\"modelName\":\"Model"
                                        + " Name\",\"modelDescription\":\"Model Description\",\"brand\":{\"idBrand\":null,\"brandName\":null,\"brandDescription"
                                        + "\":null,\"brandManufacturingCountry\":null,\"status\":null,\"audit\":{\"createBy\":null,\"createDate\":null,"
                                        + "\"updateBy\":null,\"updateDate\":null,\"deleteBy\":null,\"deleteDate\":null,\"ipAddress\":null,\"action\":null,"
                                        + "\"previousValue\":null,\"currentValue\":null,\"recordVersion\":null}},\"status\":1,\"audit\":{\"createBy\":null,"
                                        + "\"createDate\":null,\"updateBy\":null,\"updateDate\":null,\"deleteBy\":null,\"deleteDate\":null,\"ipAddress\":null"
                                        + ",\"action\":null,\"previousValue\":null,\"currentValue\":null,\"recordVersion\":null}},\"vehiclesType\":{"
                                        + "\"idVehiclesType\":1,\"vehiclesTypes\":\"Vehicles Types\",\"status\":1,\"audit\":{\"createBy\":null,\"createDate\""
                                        + ":null,\"updateBy\":null,\"updateDate\":null,\"deleteBy\":null,\"deleteDate\":null,\"ipAddress\":null,\"action\""
                                        + ":null,\"previousValue\":null,\"currentValue\":null,\"recordVersion\":null}},\"vehicleStatus\":1,\"audit\":{"
                                        + "\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0"
                                        + "],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\","
                                        + "\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"audit\":{\"createBy\":\"Create By\",\"createDate"
                                        + "\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate"
                                        + "\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\""
                                        + ",\"recordVersion\":1}},\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03"
                                        + "-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42"
                                        + " Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"error\":\"\"}"));
    }

    /**
     * Test {@link StTransactionController#getTransactionsByVehicle(Long, String)}.
     * <p>
     * Method under test: {@link StTransactionController#getTransactionsByVehicle(Long, String)}
     */
    @Test
    @DisplayName("Test getTransactionsByVehicle(Long, String)")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByVehicle() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<List<TransactionResponse>> actualTransactionsByVehicle = (new StTransactionController(
                new StTransactionService())).getTransactionsByVehicle(1L, "2020-03-01");

        // Assert
        assertEquals("", actualTransactionsByVehicle.getError());
        assertEquals(
                "Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                        + ".Repository.StVehicleRepository.existsById(Object)\" because \"<local4>.vehicleRepository\" is null",
                actualTransactionsByVehicle.getMessage());
        assertNull(actualTransactionsByVehicle.getUuid());
        assertNull(actualTransactionsByVehicle.getData());
        assertEquals(400, actualTransactionsByVehicle.getStatus().intValue());
    }

    /**
     * Test {@link StTransactionController#getAllTransactions(int, int, String)}.
     * <p>
     * Method under test: {@link StTransactionController#getAllTransactions(int, int, String)}
     */
    @Test
    @DisplayName("Test getAllTransactions(int, int, String)")
    @Tag("MaintainedByDiffblue")
    void testGetAllTransactions() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<Page<TransactionResponse>> actualAllTransactions = (new StTransactionController(
                new StTransactionService())).getAllTransactions(0, 0, null);

        // Assert
        assertEquals("", actualAllTransactions.getError());
        assertEquals("Error al obtener transacciones: Page size must not be less than one",
                actualAllTransactions.getMessage());
        assertNull(actualAllTransactions.getUuid());
        assertNull(actualAllTransactions.getData());
        assertEquals(400, actualAllTransactions.getStatus().intValue());
    }

    /**
     * Test {@link StTransactionController#getAllTransactions(int, int, String)}.
     * <p>
     * Method under test: {@link StTransactionController#getAllTransactions(int, int, String)}
     */
    @Test
    @DisplayName("Test getAllTransactions(int, int, String)")
    @Tag("MaintainedByDiffblue")
    void testGetAllTransactions2() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<Page<TransactionResponse>> actualAllTransactions = (new StTransactionController(
                new StTransactionService())).getAllTransactions(1, 3, "");

        // Assert
        assertEquals("", actualAllTransactions.getError());
        assertEquals("Error al obtener transacciones: Property must not be null or empty",
                actualAllTransactions.getMessage());
        assertNull(actualAllTransactions.getUuid());
        assertNull(actualAllTransactions.getData());
        assertEquals(400, actualAllTransactions.getStatus().intValue());
    }

    /**
     * Test {@link StTransactionController#getAllTransactions(int, int, String)}.
     * <ul>
     *   <li>When {@code Sort By}.</li>
     *   <li>Then return Message is a string.</li>
     * </ul>
     * <p>
     * Method under test: {@link StTransactionController#getAllTransactions(int, int, String)}
     */
    @Test
    @DisplayName("Test getAllTransactions(int, int, String); when 'Sort By'; then return Message is a string")
    @Tag("MaintainedByDiffblue")
    void testGetAllTransactions_whenSortBy_thenReturnMessageIsAString() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<Page<TransactionResponse>> actualAllTransactions = (new StTransactionController(
                new StTransactionService())).getAllTransactions(1, 3, "Sort By");

        // Assert
        assertEquals("", actualAllTransactions.getError());
        assertEquals("Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StTransactionRepository.findAll(org.springframework.data.domain.Pageable)\" because"
                + " \"<local5>.transactionRepository\" is null", actualAllTransactions.getMessage());
        assertNull(actualAllTransactions.getUuid());
        assertNull(actualAllTransactions.getData());
        assertEquals(400, actualAllTransactions.getStatus().intValue());
    }

    /**
     * Test {@link StTransactionController#getAllTransactions(int, int, String)}.
     * <ul>
     *   <li>When zero.</li>
     *   <li>Then return Message is a string.</li>
     * </ul>
     * <p>
     * Method under test: {@link StTransactionController#getAllTransactions(int, int, String)}
     */
    @Test
    @DisplayName("Test getAllTransactions(int, int, String); when zero; then return Message is a string")
    @Tag("MaintainedByDiffblue")
    void testGetAllTransactions_whenZero_thenReturnMessageIsAString() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<Page<TransactionResponse>> actualAllTransactions = (new StTransactionController(
                new StTransactionService())).getAllTransactions(0, 1, null);

        // Assert
        assertEquals("", actualAllTransactions.getError());
        assertEquals("Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StTransactionRepository.findAll(org.springframework.data.domain.Pageable)\" because"
                + " \"<local5>.transactionRepository\" is null", actualAllTransactions.getMessage());
        assertNull(actualAllTransactions.getUuid());
        assertNull(actualAllTransactions.getData());
        assertEquals(400, actualAllTransactions.getStatus().intValue());
    }

    /**
     * Test {@link StTransactionController#getTransactionsByToll(Long, LocalDate, LocalDate)}.
     * <ul>
     *   <li>When {@link LocalDate} with {@code 1970} and one and one.</li>
     * </ul>
     * <p>
     * Method under test: {@link StTransactionController#getTransactionsByToll(Long, LocalDate, LocalDate)}
     */
    @Test
    @DisplayName("Test getTransactionsByToll(Long, LocalDate, LocalDate); when LocalDate with '1970' and one and one")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByToll_whenLocalDateWith1970AndOneAndOne() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StTransactionController stTransactionController = new StTransactionController(new StTransactionService());
        LocalDate startDate = LocalDate.of(1970, 1, 1);

        // Act
        ApiResponse<List<TransactionResponse>> actualTransactionsByToll = stTransactionController.getTransactionsByToll(1L,
                startDate, LocalDate.of(1970, 1, 1));

        // Assert
        assertEquals("", actualTransactionsByToll.getError());
        assertEquals(
                "Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                        + ".Repository.StTransactionRepository.findByTollIdAndDateRange(java.lang.Long, java.time.LocalDateTime,"
                        + " java.time.LocalDateTime)\" because \"<local5>.transactionRepository\" is null",
                actualTransactionsByToll.getMessage());
        assertNull(actualTransactionsByToll.getUuid());
        assertNull(actualTransactionsByToll.getData());
        assertEquals(400, actualTransactionsByToll.getStatus().intValue());
    }

    /**
     * Test {@link StTransactionController#getTransactionsByToll(Long, LocalDate, LocalDate)}.
     * <ul>
     *   <li>When {@link LocalDate} with {@code 1970} and one and one.</li>
     * </ul>
     * <p>
     * Method under test: {@link StTransactionController#getTransactionsByToll(Long, LocalDate, LocalDate)}
     */
    @Test
    @DisplayName("Test getTransactionsByToll(Long, LocalDate, LocalDate); when LocalDate with '1970' and one and one")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByToll_whenLocalDateWith1970AndOneAndOne2() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange
        StTransactionController stTransactionController = new StTransactionController(new StTransactionService());

        // Act
        ApiResponse<List<TransactionResponse>> actualTransactionsByToll = stTransactionController.getTransactionsByToll(1L,
                LocalDate.of(1970, 1, 1), null);

        // Assert
        assertEquals("", actualTransactionsByToll.getError());
        assertEquals("Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StTransactionRepository.findByTollId(java.lang.Long)\" because \"<local5>.transactionRepository\""
                + " is null", actualTransactionsByToll.getMessage());
        assertNull(actualTransactionsByToll.getUuid());
        assertNull(actualTransactionsByToll.getData());
        assertEquals(400, actualTransactionsByToll.getStatus().intValue());
    }

    /**
     * Test {@link StTransactionController#getTransactionsByToll(Long, LocalDate, LocalDate)}.
     * <ul>
     *   <li>When {@code null}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StTransactionController#getTransactionsByToll(Long, LocalDate, LocalDate)}
     */
    @Test
    @DisplayName("Test getTransactionsByToll(Long, LocalDate, LocalDate); when 'null'")
    @Tag("MaintainedByDiffblue")
    void testGetTransactionsByToll_whenNull() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
        //   Run dcover create --keep-partial-tests to gain insights into why
        //   a non-Spring test was created.

        // Arrange and Act
        ApiResponse<List<TransactionResponse>> actualTransactionsByToll = (new StTransactionController(
                new StTransactionService())).getTransactionsByToll(1L, null, null);

        // Assert
        assertEquals("", actualTransactionsByToll.getError());
        assertEquals("Error al obtener transacciones: Cannot invoke \"com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService"
                + ".Repository.StTransactionRepository.findByTollId(java.lang.Long)\" because \"<local5>.transactionRepository\""
                + " is null", actualTransactionsByToll.getMessage());
        assertNull(actualTransactionsByToll.getUuid());
        assertNull(actualTransactionsByToll.getData());
        assertEquals(400, actualTransactionsByToll.getStatus().intValue());
    }
}
