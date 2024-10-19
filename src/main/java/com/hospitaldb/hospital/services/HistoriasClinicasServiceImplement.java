package com.hospitaldb.hospital.services;


import com.hospitaldb.hospital.controller.request.HistoriasClinicasRequest;
import com.hospitaldb.hospital.controller.response.HistoriasClinicasResponse;
import com.hospitaldb.hospital.entitys.HistoriasClinicas;
import com.hospitaldb.hospital.entitys.repository.HistoriasClinicasRespository;
import com.hospitaldb.hospital.services.service.HistoriasClinicasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class HistoriasClinicasServiceImplement implements HistoriasClinicasService {

    private final HistoriasClinicasRespository historiasClinicasRespository;

    @Override
    public List<HistoriasClinicas> listarHistoriasClinicas() {
        var listHistoriasClinicas=historiasClinicasRespository.listHistoriasClinicasType();
        return listHistoriasClinicas;
    }

    @Override
    public void guardarHistoriasClinicas(HistoriasClinicasRequest historiasClinicasRequest) {
        if(Objects.nonNull(historiasClinicasRequest)){
            HistoriasClinicas historiasClinicas =  HistoriasClinicas.builder()
                    .idpaciente(historiasClinicasRequest.getIdpaciente())
                    .fechaCreacion(historiasClinicasRequest.getFechaCreacion())
                    .diagnostico(historiasClinicasRequest.getDiagnostico())

                    .build();
            historiasClinicasRespository.save(historiasClinicas);
        }
    }

    @Override
    public void eliminarHistoriasClinicas(Long id) {
        historiasClinicasRespository.deleteById(id);
    }

    @Override
    public void actualizarHistoriasClinicas(HistoriasClinicasRequest historiasClinicasRequest) {
        if(Objects.nonNull(historiasClinicasRequest)){
            HistoriasClinicas historiasClinicas =  HistoriasClinicas.builder()
                    .idpaciente(historiasClinicasRequest.getIdpaciente())
                    .fechaCreacion(historiasClinicasRequest.getFechaCreacion())
                    .diagnostico(historiasClinicasRequest.getIdpaciente())

                    .build();

            historiasClinicasRespository.save(historiasClinicas);
        }
    }

    @Override
    public HistoriasClinicasResponse consultarHistoriasClinicas(Long id) {
        HistoriasClinicas historiasClinicas = historiasClinicasRespository.findByHistoriasClinicasType(id);
        if(Objects.nonNull(historiasClinicas)){
            return HistoriasClinicasResponse.builder()
                    .idpaciente(historiasClinicas.getIdpaciente())
                    .fechaCreacion(historiasClinicas.getFechaCreacion())
                    .diagnostico(historiasClinicas.getIdpaciente())

                    .build();
        }
        return HistoriasClinicasResponse.builder().build();
    }
}