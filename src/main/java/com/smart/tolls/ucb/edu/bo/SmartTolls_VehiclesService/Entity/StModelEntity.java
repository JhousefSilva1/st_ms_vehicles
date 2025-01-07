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
@Table(name = "st_models")
public class StModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_model_id")
    private Long idModel;

    private String modelName;

    private String modelDescription;

    @ManyToOne
    @JoinColumn(name = "st_models_st_model_id")
    private StBrandEntity brand;

    @JsonIgnore
    @OneToMany(mappedBy = "vehiclesModels", fetch = FetchType.LAZY)
    private List<StVehicleEntity> vehiclesModels;

    @Column(name = "st_model_status")
    private Integer status;

    @Embedded
    private Audit audit = new Audit();

    @PrePersist
    public void prePersist() {
        this.status = 1;
    }
}
