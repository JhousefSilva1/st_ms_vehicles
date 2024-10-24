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
@Table(name = "st_models")
public class StModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_model_id")
    private Long idModel;

    private String modelName;

    private String modelDescription;


}
