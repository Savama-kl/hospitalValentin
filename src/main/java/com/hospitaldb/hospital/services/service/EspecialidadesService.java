package com.hospitaldb.hospital.services.service;




import com.hospitaldb.hospital.controller.request.EspecialidadesRequest;
import com.hospitaldb.hospital.controller.response.EspecialidadesResponse;
import com.hospitaldb.hospital.entitys.Especialidades;

import java.util.List;

public interface EspecialidadesService {

    List<Especialidades> listarEspecialidades();
    void guardarEspecialidades(EspecialidadesRequest especialidadesRequest);
    void eliminarEspecialidades(Long id);
    void actualizarEspecialidades(EspecialidadesRequest especialidadesRequest);
    EspecialidadesResponse consultarEspecialidades(Long id);
}