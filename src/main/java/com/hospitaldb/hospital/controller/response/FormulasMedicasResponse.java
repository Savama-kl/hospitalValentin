package com.hospitaldb.hospital.controller.response;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class FormulasMedicasResponse {
    private Long id ;
    private Long idHistoriaClinica;
    private Long idDoctor;
    private Long idMedicamento;
    private String descripcion;
    private Date fechaFormula;
}