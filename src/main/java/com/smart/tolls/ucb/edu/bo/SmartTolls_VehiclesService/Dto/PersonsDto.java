package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PersonsDto {
    private Long idPerson;
    private String personName;
    private String personSurname;
    private String personWhatsappNumber;
    private String personPassword;
    private String personDni;
    private String personBirthdate;
    private String personEmail;
    private String personAddress;
    private String personAge;
}
