package com.hospitaldb.hospital.controller.request;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class LaboratoriosRequest {
    private String descrip;
}