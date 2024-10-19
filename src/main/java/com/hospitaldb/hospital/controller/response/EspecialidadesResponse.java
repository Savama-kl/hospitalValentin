package com.hospitaldb.hospital.controller.response;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class EspecialidadesResponse {
    private Long id ;
    private String descripcion ;
}