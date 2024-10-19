package com.hospitaldb.hospital.services.service;



import com.hospitaldb.hospital.controller.request.FormulasMedicasRequest;
import com.hospitaldb.hospital.controller.response.FormulasMedicasResponse;
import com.hospitaldb.hospital.entitys.FormulasMedicas;

import java.util.List;

public interface FormulasMedicasService {

    List<FormulasMedicas> listarFormulasMedicas();
    void guardarFormulasMedicas(FormulasMedicasRequest formulasMedicasRequest);
    void eliminarFormulasMedicas(Long id);
    void actualizarFormulasMedicas(FormulasMedicasRequest formulasMedicasRequest);
    FormulasMedicasResponse consultarFormulasMedicas(Long id);
}