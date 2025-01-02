package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

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

    @JsonIgnore
    @OneToMany(mappedBy = "fuelTypes", fetch = FetchType.LAZY)
    private List<StVehicleEntity> fuelTypes;
}
