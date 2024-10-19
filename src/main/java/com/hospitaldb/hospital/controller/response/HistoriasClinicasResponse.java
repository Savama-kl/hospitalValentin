package com.hospitaldb.hospital.controller.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class HistoriasClinicasResponse {
    private Long id ;
    private Long idpaciente;
    private Date fechaCreacion;
    private Long diagnostico;
}