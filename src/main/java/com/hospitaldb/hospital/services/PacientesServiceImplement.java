package com.hospitaldb.hospital.services;

import com.hospitaldb.hospital.controller.request.PacientesRequest;
import com.hospitaldb.hospital.controller.response.PacientesResponse;
import com.hospitaldb.hospital.entitys.Pacientes;
import com.hospitaldb.hospital.entitys.repository.PacientesRespository;
import com.hospitaldb.hospital.services.service.PacientesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PacientesServiceImplement implements PacientesService {

    private final PacientesRespository pacientesRespository;

    @Override
    public List<Pacientes> listarPacientes() {
        var listPacientes=pacientesRespository.listPacienteType();
        return listPacientes;
    }

    @Override
    public void guardarPacientes(PacientesRequest pacientesRequest) {
        if(Objects.nonNull(pacientesRequest)){
            Pacientes pacientes =  Pacientes.builder()
                    .nombres(pacientesRequest.getNombres())
                    .apellidos(pacientesRequest.getApellidos())
                    .tipo_documento(pacientesRequest.getTipo_documento())
                    .documento(pacientesRequest.getDocumento())
                    .direccion(pacientesRequest.getDireccion())
                    .fechanacimiento(pacientesRequest.getFechanacimiento())
                    .nacimiento(pacientesRequest.getNacimiento())
                    .build();

            pacientesRespository.save(pacientes);
        }
    }

    @Override
    public void eliminarPacientes(Long id) {
        pacientesRespository.deleteById(id);
    }

    @Override
    public void actualizarPacientes(PacientesRequest pacientesRequest) {
        if(Objects.nonNull(pacientesRequest)){
            Pacientes pacientes =  Pacientes.builder()
                    .nombres(pacientesRequest.getNombres())
                    .apellidos(pacientesRequest.getApellidos())
                    .tipo_documento(pacientesRequest.getTipo_documento())
                    .documento(pacientesRequest.getDocumento())
                    .direccion(pacientesRequest.getDireccion())
                    .fechanacimiento(pacientesRequest.getFechanacimiento())
                    .nacimiento(pacientesRequest.getNacimiento())
                    .build();

            pacientesRespository.save(pacientes);
        }
    }

    @Override
    public PacientesResponse consultarPacientes(Long id) {
        Pacientes pacientes = pacientesRespository.findByPersonsType(id);
        if(Objects.nonNull(pacientes)){
            return PacientesResponse.builder()
                    .id(pacientes.getId())
                    .nombres(pacientes.getNombres())
                    .apellidos(pacientes.getApellidos())
                    .tipo_documento(pacientes.getTipo_documento())
                    .documento(pacientes.getDocumento())
                    .direccion(pacientes.getDireccion())
                    .fechanacimiento(pacientes.getFechanacimiento())
                    .nacimiento(pacientes.getNacimiento())
                    .build();
        }
        return PacientesResponse.builder().build();
    }
}