package com.hospitaldb.hospital.controller;



import com.hospitaldb.hospital.controller.request.FormulasMedicasRequest;
import com.hospitaldb.hospital.controller.response.FormulasMedicasResponse;
import com.hospitaldb.hospital.entitys.FormulasMedicas;
import com.hospitaldb.hospital.services.service.FormulasMedicasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formulasMedicasType/v1")
public class FormulasMedicasController {

    private  final FormulasMedicasService formulasMedicasService;

    public FormulasMedicasController(FormulasMedicasService formulasMedicasService) {
        this.formulasMedicasService = formulasMedicasService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<FormulasMedicas>> listFormulasMedicas(){
        List<FormulasMedicas> formulasMedicas = formulasMedicasService.listarFormulasMedicas();
        return ResponseEntity.accepted().body(formulasMedicas);
    }

    @PostMapping("/save")
    public ResponseEntity<String> guardarFormulasMedicas(@RequestBody FormulasMedicasRequest formulasMedicasRequest){
        formulasMedicasService.guardarFormulasMedicas(formulasMedicasRequest);
        return ResponseEntity.accepted().body("Formula medica guardada");
    }

    @GetMapping("/delete")
    public ResponseEntity<String> eliminarFormulasMedicas(@RequestParam("id") Long id ){
        formulasMedicasService.eliminarFormulasMedicas(id);
        return ResponseEntity.accepted().body("Formula medica Eliminada");
    }

    @GetMapping("/update")
    public ResponseEntity<String> actualizarFormulasMedicas(@RequestBody FormulasMedicasRequest formulasMedicasRequest){
        formulasMedicasService.actualizarFormulasMedicas(formulasMedicasRequest);
        return ResponseEntity.accepted().body("Formulas medicas actualizadas");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<FormulasMedicasResponse> consultarFormulasMedicas(@PathVariable Long id){
        FormulasMedicasResponse formulasMedicas = formulasMedicasService.consultarFormulasMedicas(id);
        return ResponseEntity.accepted().body(formulasMedicas);
    }





}