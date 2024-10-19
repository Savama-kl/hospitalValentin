package com.hospitaldb.hospital.services.service;

import com.hospitaldb.hospital.controller.request.PacientesRequest;
import com.hospitaldb.hospital.controller.request.TipoDocumentoRequest;
import com.hospitaldb.hospital.controller.response.PacientesResponse;
import com.hospitaldb.hospital.controller.response.TipoDocumentoResponse;
import com.hospitaldb.hospital.entitys.Pacientes;

import java.util.List;

public interface PacientesService {

    List<Pacientes> listarPacientes();
    void guardarPacientes(PacientesRequest pacientesRequest);
    void eliminarPacientes(Long id);
    void actualizarPacientes(PacientesRequest pacientesRequest);
    PacientesResponse consultarPacientes(Long id);
}