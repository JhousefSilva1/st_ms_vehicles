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

    @ManyToOne
    @JoinColumn(name = "st_fuel_types_st_fuel_type_id")
    private StFuelTypesEntity fuelTypes;

    @ManyToOne
    @JoinColumn(name = "st_color_st_color_id")
    private StColorEntity vehiclesColors;

    @ManyToOne
    @JoinColumn(name = "st_models_st_model_id")
    private StModelEntity vehiclesModels;

    @ManyToOne
    @JoinColumn(name = "st_vehicles_type_st_vehicles_type_id")
    private StVehicleTypeEntity vehiclesType;
}
