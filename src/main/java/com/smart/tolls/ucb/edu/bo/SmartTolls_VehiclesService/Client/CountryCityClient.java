package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Client;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CityDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto.CountryDto;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Response.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "country-city-microservice", url = "http://localhost:8002/api")
public interface CountryCityClient {

    @GetMapping("/country/{id}")
    ApiResponse<CountryDto> getCountryById(@PathVariable("id") Long id);

    @GetMapping("/city/{id}")
    ApiResponse<CityDto> getCityById(@PathVariable("id") Long id);
}
