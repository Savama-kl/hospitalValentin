package com.hospitaldb.hospital.controller.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TipoDocumentoResponse {
    private Long id;
    private String sigla;
    private String descripcion;
}