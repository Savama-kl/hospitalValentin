package com.hospitaldb.hospital.services;

import com.hospitaldb.hospital.controller.request.FormulasMedicasRequest;
import com.hospitaldb.hospital.controller.response.FormulasMedicasResponse;
import com.hospitaldb.hospital.entitys.FormulasMedicas;
import com.hospitaldb.hospital.entitys.repository.FormulasMedicasRespository;
import com.hospitaldb.hospital.services.service.FormulasMedicasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class FormulasMedicasServiceImplement implements FormulasMedicasService {

    private final FormulasMedicasRespository formulasMedicasRespository;

    @Override
    public List<FormulasMedicas> listarFormulasMedicas() {
        var listFormulasMedicas=formulasMedicasRespository.listFormulasMedicasType();
        return listFormulasMedicas;
    }

    @Override
    public void guardarFormulasMedicas(FormulasMedicasRequest formulasMedicasRequest) {
        if(Objects.nonNull(formulasMedicasRequest)){
            FormulasMedicas formulasMedicas =  FormulasMedicas.builder()
                    .idHistoriaClinica(formulasMedicasRequest.getIdHistoriaClinica())
                    .idDoctor(formulasMedicasRequest.getIdDoctor())
                    .idMedicamento(formulasMedicasRequest.getIdMedicamento())
                    .descripcion(formulasMedicasRequest.getDescripcion())
                    .fechaFormula(formulasMedicasRequest.getFechaFormula())

                    .build();
            formulasMedicasRespository.save(formulasMedicas);
        }
    }

    @Override
    public void eliminarFormulasMedicas(Long id) {
        formulasMedicasRespository.deleteById(id);
    }

    @Override
    public void actualizarFormulasMedicas(FormulasMedicasRequest formulasMedicasRequest) {
        if(Objects.nonNull(formulasMedicasRequest)){
            FormulasMedicas formulasMedicas =  FormulasMedicas.builder()
                    .idHistoriaClinica(formulasMedicasRequest.getIdHistoriaClinica())
                    .idDoctor(formulasMedicasRequest.getIdDoctor())
                    .idMedicamento(formulasMedicasRequest.getIdMedicamento())
                    .descripcion(formulasMedicasRequest.getDescripcion())
                    .fechaFormula(formulasMedicasRequest.getFechaFormula())

                    .build();

            formulasMedicasRespository.save(formulasMedicas);
        }
    }

    @Override
    public FormulasMedicasResponse consultarFormulasMedicas(Long id) {
        FormulasMedicas formulasMedicas = formulasMedicasRespository.findByFormulaType(id);
        if(Objects.nonNull(formulasMedicas)){
            return FormulasMedicasResponse.builder()
                    .idHistoriaClinica(formulasMedicas.getIdHistoriaClinica())
                    .idDoctor(formulasMedicas.getIdDoctor())
                    .idMedicamento(formulasMedicas.getIdMedicamento())
                    .descripcion(formulasMedicas.getDescripcion())
                    .fechaFormula(formulasMedicas.getFechaFormula())

                    .build();
        }
        return FormulasMedicasResponse.builder().build();
    }
}