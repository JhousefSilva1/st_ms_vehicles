package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "st_fuel_types")

public class StFuelTypesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_fuel_type_id")
    private Long idFuelType;

    private String FuelTypeFuel;
}
