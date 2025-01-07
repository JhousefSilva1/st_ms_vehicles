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
@Table(name = "st_brands")
public class StBrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_brand_id")
    private Long idBrand;

    private String brandName;

    private String brandDescription;

    private String brandManufacturingCountry;

    @JsonIgnore
    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private List<StModelEntity> models;

    @Column(name = "st_brand_status")
    private Integer status;

    @Embedded
    private Audit audit = new Audit();

    @PrePersist
    public void prePersist() {
        this.status = 1;
    }
}
