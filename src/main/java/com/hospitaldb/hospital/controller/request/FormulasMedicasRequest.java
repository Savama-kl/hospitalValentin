package com.hospitaldb.hospital.controller.request;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class FormulasMedicasRequest {
    private Long idHistoriaClinica;
    private Long idDoctor;
    private Long idMedicamento;
    private String descripcion;
    private Date fechaFormula;
}