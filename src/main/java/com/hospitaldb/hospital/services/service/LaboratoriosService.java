package com.hospitaldb.hospital.services.service;


import com.hospitaldb.hospital.controller.request.LaboratoriosRequest;
import com.hospitaldb.hospital.controller.response.LaboratoriosResponse;
import com.hospitaldb.hospital.entitys.Laboratorios;

import java.util.List;

public interface LaboratoriosService {

    List<Laboratorios> listarLaboratorios();
    void guardarLaboratorios(LaboratoriosRequest laboratoriosRequest);
    void eliminarLaboratorios(Long id);
    void actualizarLaboratorios(LaboratoriosRequest laboratoriosRequest);
    LaboratoriosResponse consultarLaboratorios(Long id);
}