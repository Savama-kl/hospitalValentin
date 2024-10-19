package com.hospitaldb.hospital.controller.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoDocumentoRequest {
    private String sigla;
    private String descripcion;
}