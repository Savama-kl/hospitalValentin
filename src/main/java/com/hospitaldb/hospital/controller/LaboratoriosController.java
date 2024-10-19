package com.hospitaldb.hospital.controller;


import com.hospitaldb.hospital.controller.request.LaboratoriosRequest;
import com.hospitaldb.hospital.controller.response.LaboratoriosResponse;
import com.hospitaldb.hospital.entitys.Laboratorios;
import com.hospitaldb.hospital.services.service.LaboratoriosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratorios/v1")
public class LaboratoriosController {

    private  final LaboratoriosService laboratoriosService;

    public LaboratoriosController(LaboratoriosService laboratoriosService) {
        this.laboratoriosService = laboratoriosService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Laboratorios>> listLaboratorios(){
        List<Laboratorios> laboratorios = laboratoriosService.listarLaboratorios();
        return ResponseEntity.accepted().body(laboratorios);
    }

    @PostMapping("/save")
    public ResponseEntity<String> guardarLaboratorios(@RequestBody LaboratoriosRequest laboratoriosRequest){
        laboratoriosService.guardarLaboratorios(laboratoriosRequest);
        return ResponseEntity.accepted().body("Laboratorio guardado");
    }

    @GetMapping("/delete")
    public ResponseEntity<String> eliminarLaboratorios(@RequestParam("id") Long id ){
        laboratoriosService.eliminarLaboratorios(id);
        return ResponseEntity.accepted().body("Laboratorio Eliminado");
    }

    @GetMapping("/update")
    public ResponseEntity<String> actualizarLaboratorios(@RequestBody LaboratoriosRequest laboratoriosRequest){
        laboratoriosService.actualizarLaboratorios(laboratoriosRequest);
        return ResponseEntity.accepted().body("Laboratorio actualizado");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<LaboratoriosResponse> consultarLaboratorios(@PathVariable Long id){
        LaboratoriosResponse laboratorios = laboratoriosService.consultarLaboratorios(id);
        return ResponseEntity.accepted().body(laboratorios);
    }





}