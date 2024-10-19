package com.hospitaldb.hospital.services.service;

import com.hospitaldb.hospital.controller.request.MedicamentosRequest;
import com.hospitaldb.hospital.controller.response.MedicamentosResponse;
import com.hospitaldb.hospital.entitys.Medicamentos;

import java.util.List;

public interface MedicamentosService {

    List<Medicamentos> listarMedicamentos();
    void guardarMedicamentos(MedicamentosRequest medicamentosRequest);
    void eliminarMedicamentos(Long id);
    void actualizarMedicamentos(MedicamentosRequest medicamentosRequest);
    MedicamentosResponse consultarMedicamentos(Long id);
}