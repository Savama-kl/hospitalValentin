package com.hospitaldb.hospital.controller.request;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class HistoriasClinicasRequest {
    private Long idpaciente;
    private Date fechaCreacion;
    private Long diagnostico;
}