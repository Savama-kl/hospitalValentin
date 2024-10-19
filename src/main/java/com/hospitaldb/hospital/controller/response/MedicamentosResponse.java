package com.hospitaldb.hospital.controller.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MedicamentosResponse {
    private Long id ;
    private String nombres;
    private Long idlab;
    private Long precio;
    private Date vencimiento;
    private Date fabricacion;
}