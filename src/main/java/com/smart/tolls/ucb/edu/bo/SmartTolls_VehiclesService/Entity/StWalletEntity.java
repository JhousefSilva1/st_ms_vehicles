package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "st_wallet")
public class StWalletEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_wallet_id")
    private Long idWallet;

    @Column(nullable = false)
    private Double balance;

    @Column(unique = true, nullable = false)
    private String walletNumber;

    @Column(nullable = false)
    private String walletCVS;

    @Column(nullable = false)
    private String walletName = "SmartTolls UCB";

    @Column(nullable = false)
    private String walletBusiness = "SmartTolls UCB";



    @OneToOne
    @JoinColumn(name = "st_vehicle_id", unique = true)
    private StVehicleEntity vehicle;

    @Embedded
    private Audit audit = new Audit();

    @PrePersist
    public void prePersist() {
        if(this.balance == null) {
            this.balance = 0.0;
        }
    }
}