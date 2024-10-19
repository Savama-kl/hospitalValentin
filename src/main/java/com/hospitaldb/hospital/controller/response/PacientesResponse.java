package com.hospitaldb.hospital.controller.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PacientesResponse {
    private Long id ;
    private String nombres;
    private String apellidos;
    private Long tipo_documento;
    private String documento;
    private String direccion;
    private Date fechanacimiento;
    private String nacimiento;
}