package com.hospitaldb.hospital.services;

import com.hospitaldb.hospital.controller.request.MedicamentosRequest;
import com.hospitaldb.hospital.controller.response.MedicamentosResponse;
import com.hospitaldb.hospital.entitys.Medicamentos;
import com.hospitaldb.hospital.entitys.repository.MedicamentosRespository;
import com.hospitaldb.hospital.services.service.MedicamentosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MedicamentosServiceImplement implements MedicamentosService {

    private final MedicamentosRespository medicamentosRespository;

    @Override
    public List<Medicamentos> listarMedicamentos() {
        var listMedicamentos=medicamentosRespository.listMedicamentosType();
        return listMedicamentos;
    }

    @Override
    public void guardarMedicamentos(MedicamentosRequest medicamentosRequest) {
        if(Objects.nonNull(medicamentosRequest)){
            Medicamentos medicamentos =  Medicamentos.builder()
                    .nombres(medicamentosRequest.getNombres())
                    .idlab(medicamentosRequest.getIdlab())
                    .precio(medicamentosRequest.getPrecio())
                    .vencimiento(medicamentosRequest.getVencimiento())
                    .fabricacion(medicamentosRequest.getFabricacion())
                    .build();
            medicamentosRespository.save(medicamentos);
        }
    }

    @Override
    public void eliminarMedicamentos(Long id) {
        medicamentosRespository.deleteById(id);
    }

    @Override
    public void actualizarMedicamentos(MedicamentosRequest medicamentosRequest) {
        if(Objects.nonNull(medicamentosRequest)){
            Medicamentos medicamentos =  Medicamentos.builder()
                    .nombres(medicamentosRequest.getNombres())
                    .idlab(medicamentosRequest.getIdlab())
                    .precio(medicamentosRequest.getPrecio())
                    .vencimiento(medicamentosRequest.getVencimiento())
                    .fabricacion(medicamentosRequest.getFabricacion())
                    .build();

            medicamentosRespository.save(medicamentos);
        }
    }

    @Override
    public MedicamentosResponse consultarMedicamentos(Long id) {
        Medicamentos medicamentos = medicamentosRespository.findByMedType(id);
        if(Objects.nonNull(medicamentos)){
            return MedicamentosResponse.builder()
                    .nombres(medicamentos.getNombres())
                    .idlab(medicamentos.getIdlab())
                    .precio(medicamentos.getPrecio())
                    .vencimiento(medicamentos.getVencimiento())
                    .fabricacion(medicamentos.getFabricacion())
                    .build();
        }
        return MedicamentosResponse.builder().build();
    }
}