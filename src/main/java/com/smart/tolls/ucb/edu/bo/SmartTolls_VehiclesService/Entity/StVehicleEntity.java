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
@Table(name = "st_vehicles", uniqueConstraints = {
        @UniqueConstraint(columnNames = "licensePlate", name = "uk_vehicles_license_plate"),
        @UniqueConstraint(columnNames = "chassisNumber", name = "uk_vehicles_chassis"),
        @UniqueConstraint(columnNames = "engineNumber", name = "uk_vehicles_engine")
})
public class StVehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_vehicle_id")
    private Long idVehicle;

    @Column(unique = true, nullable = false)
    private String licensePlate;

    @Column(unique = true, nullable = false)
    private String chassisNumber;

    @Column(unique = true, nullable = false)
    private String engineNumber;

    private String manufacturingYear;

    private Double weight;

    private Long idPerson;

    private Long idCity;

    private Long idCountry;

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

    @Column(name = "st_vehicle_status")
    private Integer vehicleStatus;

    @Embedded
    private Audit audit = new Audit();

    @PrePersist
    public void prePersist() {
        this.vehicleStatus = 1;
    }
}
