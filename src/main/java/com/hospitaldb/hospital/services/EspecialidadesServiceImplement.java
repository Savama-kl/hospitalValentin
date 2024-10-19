package com.hospitaldb.hospital.services;

import com.hospitaldb.hospital.controller.request.EspecialidadesRequest;
import com.hospitaldb.hospital.controller.response.EspecialidadesResponse;
import com.hospitaldb.hospital.entitys.Especialidades;
import com.hospitaldb.hospital.entitys.repository.EspecialidadesRespository;
import com.hospitaldb.hospital.services.service.EspecialidadesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class EspecialidadesServiceImplement implements EspecialidadesService {

    private final EspecialidadesRespository especialidadesRespository;

    @Override
    public List<Especialidades> listarEspecialidades() {
        var listEspecialidades=especialidadesRespository.listEspecialidadesType();
        return listEspecialidades;
    }

    @Override
    public void guardarEspecialidades(EspecialidadesRequest formulasMedicasRequest) {
        if(Objects.nonNull(formulasMedicasRequest)){
            Especialidades formulasMedicas =  Especialidades.builder()
                    .descripcion(formulasMedicasRequest.getDescripcion())


                    .build();
            especialidadesRespository.save(formulasMedicas);
        }
    }

    @Override
    public void eliminarEspecialidades(Long id) {
        especialidadesRespository.deleteById(id);
    }

    @Override
    public void actualizarEspecialidades(EspecialidadesRequest formulasMedicasRequest) {
        if(Objects.nonNull(formulasMedicasRequest)){
            Especialidades formulasMedicas =  Especialidades.builder()
                    .descripcion(formulasMedicasRequest.getDescripcion())

                    .build();

            especialidadesRespository.save(formulasMedicas);
        }
    }

    @Override
    public EspecialidadesResponse consultarEspecialidades(Long id) {
        Especialidades formulasMedicas = especialidadesRespository.findByEspecialidadesType(id);
        if(Objects.nonNull(formulasMedicas)){
            return EspecialidadesResponse.builder()
                    .descripcion(formulasMedicas.getDescripcion())

                    .build();
        }
        return EspecialidadesResponse.builder().build();
    }
}