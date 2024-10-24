package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SmartTollsVehiclesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartTollsVehiclesServiceApplication.class, args);
	}

}
