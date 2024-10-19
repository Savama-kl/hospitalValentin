package com.hospitaldb.hospital.controller;


import com.hospitaldb.hospital.controller.request.MedicamentosRequest;
import com.hospitaldb.hospital.controller.response.MedicamentosResponse;
import com.hospitaldb.hospital.entitys.Medicamentos;
import com.hospitaldb.hospital.services.service.MedicamentosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamentosType/v1")
public class MedicamentosController {

    private  final MedicamentosService medicamentosService;

    public MedicamentosController(MedicamentosService medicamentosService) {
        this.medicamentosService = medicamentosService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Medicamentos>> listMedicamentos(){
        List<Medicamentos> medicamentos = medicamentosService.listarMedicamentos();
        return ResponseEntity.accepted().body(medicamentos);
    }

    @PostMapping("/save")
    public ResponseEntity<String> guardarMedicamentos(@RequestBody MedicamentosRequest medicamentosRequest){
        medicamentosService.guardarMedicamentos(medicamentosRequest);
        return ResponseEntity.accepted().body("Medicamento guardado");
    }

    @GetMapping("/delete")
    public ResponseEntity<String> eliminarMedicamento(@RequestParam("id") Long id ){
        medicamentosService.eliminarMedicamentos(id);
        return ResponseEntity.accepted().body("Medicamento Eliminado");
    }

    @GetMapping("/update")
    public ResponseEntity<String> actualizarMedicamento(@RequestBody MedicamentosRequest medicamentosRequest){
        medicamentosService.actualizarMedicamentos(medicamentosRequest);
        return ResponseEntity.accepted().body("Medicamentos actualizado");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<MedicamentosResponse> consultarMedicamentos(@PathVariable Long id){
        MedicamentosResponse medicamentos = medicamentosService.consultarMedicamentos(id);
        return ResponseEntity.accepted().body(medicamentos);
    }





}