package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Controller;

import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.Audit;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StBrandEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StColorEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StFuelTypesEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StModelEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StVehicleTypeEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity.StWalletEntity;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Service.StWalletService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
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

@ContextConfiguration(classes = {StWalletController.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class StWalletControllerDiffblueTest {
    @Autowired
    private StWalletController stWalletController;

    @MockBean
    private StWalletService stWalletService;

    /**
     * Test {@link StWalletController#createWalletForVehicle(Long)}.
     * <p>
     * Method under test: {@link StWalletController#createWalletForVehicle(Long)}
     */
    @Test
    @DisplayName("Test createWalletForVehicle(Long)")
    @Tag("MaintainedByDiffblue")
    void testCreateWalletForVehicle() throws Exception {
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
        when(stWalletService.createWalletForVehicle(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/wallets/vehicle/{vehicleId}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stWalletController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"Wallet creada exitosamente\",\"data\":{\"idWallet\":1,\"balance\":10.0,\"walletNumber"
                                        + "\":\"42\",\"walletCVS\":\"Wallet CVS\",\"walletName\":\"Wallet Name\",\"walletBusiness\":\"Wallet Business\",\"vehicle"
                                        + "\":{\"idVehicle\":1,\"licensePlate\":\"License Plate\",\"chassisNumber\":\"42\",\"engineNumber\":\"42\",\"manufacturingYear"
                                        + "\":\"Manufacturing Year\",\"weight\":10.0,\"idPerson\":1,\"idCity\":1,\"idCountry\":1,\"fuelTypes\":{\"idFuelType\""
                                        + ":1,\"fuelTypeFuel\":\"Fuel Type Fuel\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1"
                                        + ",0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1"
                                        + ",1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion"
                                        + "\":1}},\"vehiclesColors\":{\"idColor\":1,\"colorDescription\":\"Color Description\",\"colorName\":\"Color"
                                        + " Name\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01"
                                        + "\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main"
                                        + " St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesModels\""
                                        + ":{\"idModel\":1,\"modelName\":\"Model Name\",\"modelDescription\":\"Model Description\",\"brand\":{\"idBrand\":1,"
                                        + "\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand Description\",\"brandManufacturingCountry\":\"GB\","
                                        + "\"status\":1,\"audit\":{\"createBy\":null,\"createDate\":null,\"updateBy\":null,\"updateDate\":null,\"deleteBy\""
                                        + ":null,\"deleteDate\":null,\"ipAddress\":null,\"action\":null,\"previousValue\":null,\"currentValue\":null,"
                                        + "\"recordVersion\":null}},\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy"
                                        + "\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42"
                                        + " Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesType"
                                        + "\":{\"idVehiclesType\":1,\"vehiclesTypes\":\"Vehicles Types\",\"status\":1,\"audit\":{\"createBy\":\"Create"
                                        + " By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete"
                                        + " By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\","
                                        + "\"currentValue\":\"42\",\"recordVersion\":1}},\"vehicleStatus\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate"
                                        + "\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate"
                                        + "\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\""
                                        + ",\"recordVersion\":1}},\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03"
                                        + "-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42"
                                        + " Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"error\":\"\"}"));
    }

    /**
     * Test {@link StWalletController#createWalletForVehicle(Long)}.
     * <p>
     * Method under test: {@link StWalletController#createWalletForVehicle(Long)}
     */
    @Test
    @DisplayName("Test createWalletForVehicle(Long)")
    @Tag("MaintainedByDiffblue")
    void testCreateWalletForVehicle2() throws Exception {
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
        when(stWalletService.createWalletForVehicle(Mockito.<Long>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/wallets/vehicle/{vehicleId}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stWalletController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"status\":200,\"message\":\"Wallet creada exitosamente\",\"data\":{\"idWallet\":1,\"balance\":10.0,\"walletNumber"
                                        + "\":\"42\",\"walletCVS\":\"Wallet CVS\",\"walletName\":\"Wallet Name\",\"walletBusiness\":\"Wallet Business\",\"vehicle"
                                        + "\":{\"idVehicle\":1,\"licensePlate\":\"License Plate\",\"chassisNumber\":\"42\",\"engineNumber\":\"42\",\"manufacturingYear"
                                        + "\":\"Manufacturing Year\",\"weight\":10.0,\"idPerson\":1,\"idCity\":1,\"idCountry\":1,\"fuelTypes\":{\"idFuelType\""
                                        + ":1,\"fuelTypeFuel\":\"Fuel Type Fuel\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1"
                                        + ",0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1"
                                        + ",1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion"
                                        + "\":1}},\"vehiclesColors\":{\"idColor\":1,\"colorDescription\":\"Color Description\",\"colorName\":\"Color"
                                        + " Name\",\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01"
                                        + "\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main"
                                        + " St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesModels\""
                                        + ":{\"idModel\":1,\"modelName\":\"Model Name\",\"modelDescription\":\"Model Description\",\"brand\":{\"idBrand\":1,"
                                        + "\"brandName\":\"Brand Name\",\"brandDescription\":\"Brand Description\",\"brandManufacturingCountry\":\"GB\","
                                        + "\"status\":1,\"audit\":{\"createBy\":null,\"createDate\":null,\"updateBy\":null,\"updateDate\":null,\"deleteBy\""
                                        + ":null,\"deleteDate\":null,\"ipAddress\":null,\"action\":null,\"previousValue\":null,\"currentValue\":null,"
                                        + "\"recordVersion\":null}},\"status\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy"
                                        + "\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42"
                                        + " Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"vehiclesType"
                                        + "\":{\"idVehiclesType\":1,\"vehiclesTypes\":\"Vehicles Types\",\"status\":1,\"audit\":{\"createBy\":\"Create"
                                        + " By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete"
                                        + " By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\","
                                        + "\"currentValue\":\"42\",\"recordVersion\":1}},\"vehicleStatus\":1,\"audit\":{\"createBy\":\"Create By\",\"createDate"
                                        + "\":[1970,1,1,0,0],\"updateBy\":\"2020-03-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate"
                                        + "\":[1970,1,1,0,0],\"ipAddress\":\"42 Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\""
                                        + ",\"recordVersion\":1}},\"audit\":{\"createBy\":\"Create By\",\"createDate\":[1970,1,1,0,0],\"updateBy\":\"2020-03"
                                        + "-01\",\"updateDate\":[1970,1,1,0,0],\"deleteBy\":\"Delete By\",\"deleteDate\":[1970,1,1,0,0],\"ipAddress\":\"42"
                                        + " Main St\",\"action\":\"Action\",\"previousValue\":\"42\",\"currentValue\":\"42\",\"recordVersion\":1}},\"error\":\"\"}"));
    }

    /**
     * Test {@link StWalletController#getWalletByVehicleId(Long)}.
     * <p>
     * Method under test: {@link StWalletController#getWalletByVehicleId(Long)}
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
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/wallets/vehicle/{vehicleId}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stWalletController)
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
     * Test {@link StWalletController#getWalletByVehicleId(Long)}.
     * <p>
     * Method under test: {@link StWalletController#getWalletByVehicleId(Long)}
     */
    @Test
    @DisplayName("Test getWalletByVehicleId(Long)")
    @Tag("MaintainedByDiffblue")
    void testGetWalletByVehicleId2() throws Exception {
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
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/wallets/vehicle/{vehicleId}", 1L);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(stWalletController)
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
     * Test {@link StWalletController#updateWalletBalance(Long, Map)}.
     * <p>
     * Method under test: {@link StWalletController#updateWalletBalance(Long, Map)}
     */
    @Test
    @DisplayName("Test updateWalletBalance(Long, Map)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateWalletBalance2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.put(Object, Object)" because "<parameter1>" is null
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        HashMap<String, Double> stringResultDoubleMap = null;
        stringResultDoubleMap.put("amount", 10.0d);
        String content = (new ObjectMapper()).writeValueAsString(null);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/wallets/{walletId}/balance", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stWalletController).build().perform(requestBuilder);
    }

    /**
     * Test {@link StWalletController#updateWalletBalance(Long, Map)}.
     * <p>
     * Method under test: {@link StWalletController#updateWalletBalance(Long, Map)}
     */
    @Test
    @DisplayName("Test updateWalletBalance(Long, Map)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testUpdateWalletBalance() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Map.put(Object, Object)" because "<parameter1>" is null
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        HashMap<String, Double> stringResultDoubleMap = null;
        stringResultDoubleMap.put("amount", 10.0d);
        String content = (new ObjectMapper()).writeValueAsString(null);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/wallets/{walletId}/balance", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(stWalletController).build().perform(requestBuilder);
    }
}
