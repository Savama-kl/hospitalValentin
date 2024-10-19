package com.hospitaldb.hospital.controller.request;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PacientesRequest {
    private String nombres;
    private String apellidos;
    private Long tipo_documento;
    private String documento;
    private String direccion;
    private Date fechanacimiento;
    private String nacimiento;
}