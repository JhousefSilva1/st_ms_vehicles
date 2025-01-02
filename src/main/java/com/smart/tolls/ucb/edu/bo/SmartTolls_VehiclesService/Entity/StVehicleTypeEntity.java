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
@Table(name = "st_vehicles_type")
public class StVehicleTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_vehicles_type_id")
    private Long idVehiclesType;



    private String vehiclesTypes;

    @JsonIgnore
    @OneToMany(mappedBy = "vehiclesType", fetch = FetchType.LAZY)
    private List <StVehicleEntity> vehiclesType;
}
