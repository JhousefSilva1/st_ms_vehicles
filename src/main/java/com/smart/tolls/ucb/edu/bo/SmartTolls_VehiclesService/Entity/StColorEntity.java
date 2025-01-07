package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.Table;
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
@Table(name = "st_color")
public class StColorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_color_id")
    private Long idColor;

    private String colorDescription;

    private String colorName;

    @JsonIgnore
    @OneToMany(mappedBy = "vehiclesColors", fetch = FetchType.LAZY)
    private List<StVehicleEntity> vehiclesColors;

    @Column(name = "st_color_status")
    private Integer status;

    @Embedded
    private Audit audit = new Audit();

    @PrePersist
    public void prePersist() {
        this.status = 1;
    }
}
