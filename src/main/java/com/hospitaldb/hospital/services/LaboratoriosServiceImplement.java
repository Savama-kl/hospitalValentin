package com.hospitaldb.hospital.services;

import com.hospitaldb.hospital.controller.request.LaboratoriosRequest;
import com.hospitaldb.hospital.controller.response.LaboratoriosResponse;
import com.hospitaldb.hospital.entitys.Laboratorios;
import com.hospitaldb.hospital.entitys.repository.LaboratoriosRespository;
import com.hospitaldb.hospital.services.service.LaboratoriosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class LaboratoriosServiceImplement implements LaboratoriosService {

    private final LaboratoriosRespository laboratoriosRespository;

    @Override
    public List<Laboratorios> listarLaboratorios() {
        var listLaboratorios=laboratoriosRespository.listLaboratoriosType();
        return listLaboratorios;
    }

    @Override
    public void guardarLaboratorios(LaboratoriosRequest laboratoriosRequest) {
        if(Objects.nonNull(laboratoriosRequest)){
            Laboratorios laboratorios =  Laboratorios.builder()
                    .descrip(laboratoriosRequest.getDescrip())
                    .build();
            laboratoriosRespository.save(laboratorios);
        }
    }

    @Override
    public void eliminarLaboratorios(Long id) {
        laboratoriosRespository.deleteById(id);
    }

    @Override
    public void actualizarLaboratorios(LaboratoriosRequest laboratoriosRequest) {
        if(Objects.nonNull(laboratoriosRequest)){
            Laboratorios laboratorios =  Laboratorios.builder()
                    .descrip(laboratoriosRequest.getDescrip())

                    .build();

            laboratoriosRespository.save(laboratorios);
        }
    }

    @Override
    public LaboratoriosResponse consultarLaboratorios(Long id) {
        Laboratorios laboratorios = laboratoriosRespository.findByLabsType(id);
        if(Objects.nonNull(laboratorios)){
            return LaboratoriosResponse.builder()
                    .descrip(laboratorios.getDescrip())

                    .build();
        }
        return LaboratoriosResponse.builder().build();
    }
}