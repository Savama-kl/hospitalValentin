package com.hospitaldb.hospital.controller.request;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MedicamentosRequest {

    private String nombres;
    private Long idlab;
    private Long precio;
    private Date vencimiento;
    private Date fabricacion;
}