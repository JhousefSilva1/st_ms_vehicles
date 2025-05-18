package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Client;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.GenderDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.PersonsTypeDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.PersonsDto;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "persons-microservice", url ="http://localhost:8001/api")
public interface PersonsClient {
//    gender
    @GetMapping("/gender/{id}")
    ApiResponse<GenderDto> getGenderById(@PathVariable("id") Long id);

    @GetMapping("/personsType/{id}")
    ApiResponse<PersonsTypeDto> getPersonsTypeById(@PathVariable("id") Long id);

    @GetMapping("/persons/{id}")
    ApiResponse<PersonsDto> getPersonsById(@PathVariable("id") Long id);

}
