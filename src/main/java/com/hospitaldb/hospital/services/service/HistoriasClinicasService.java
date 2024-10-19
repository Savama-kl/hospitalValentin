package com.hospitaldb.hospital.services.service;


import com.hospitaldb.hospital.controller.request.HistoriasClinicasRequest;
import com.hospitaldb.hospital.controller.response.HistoriasClinicasResponse;
import com.hospitaldb.hospital.entitys.HistoriasClinicas;
import com.hospitaldb.hospital.entitys.Laboratorios;

import java.util.List;

public interface HistoriasClinicasService {

    List<HistoriasClinicas> listarHistoriasClinicas();
    void guardarHistoriasClinicas(HistoriasClinicasRequest historiasClinicasRequest);
    void eliminarHistoriasClinicas(Long id);
    void actualizarHistoriasClinicas(HistoriasClinicasRequest historiasClinicasRequest);
    HistoriasClinicasResponse consultarHistoriasClinicas(Long id);
}