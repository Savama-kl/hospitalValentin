package com.hospitaldb.hospital.services.service;

import com.hospitaldb.hospital.controller.request.TipoDocumentoRequest;
import com.hospitaldb.hospital.controller.response.TipoDocumentoResponse;
import com.hospitaldb.hospital.entitys.TipoDocumento;

import java.util.List;

public interface TipoDocumentoService {

    List<TipoDocumento> listarTiposDeDocumentos();
    void guardarTiposDeDocumentos(TipoDocumentoRequest tipoDocumentoRequest);
    void eliminarTiposDeDocumentos(Long id);
    void actualizarTiposDeDocumentos(TipoDocumentoRequest tipoDocumentoRequest);
    TipoDocumentoResponse consultarTiposDeDocumentos(Long id);
}