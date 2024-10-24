package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "st_vehicles")
public class StVehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_vehicle_id")
    private Long idVehicle;

    @Column(unique = true, nullable = false)
    private String licensePlate;

    private String chassisNumber;

    private String engineNumber;

    private String manufacturingYear;

    private Double weight;




}
