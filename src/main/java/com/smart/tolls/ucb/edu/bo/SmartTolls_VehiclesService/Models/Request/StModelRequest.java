package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Models.Request;

import lombok.Data;

@Data
public class StModelRequest {

    private Long idModel;

    private String modelName;

    private String modelDescription;

    private Long idBrand;
}
