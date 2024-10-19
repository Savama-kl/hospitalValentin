package com.hospitaldb.hospital.controller;


import com.hospitaldb.hospital.controller.request.HistoriasClinicasRequest;
import com.hospitaldb.hospital.controller.response.HistoriasClinicasResponse;
import com.hospitaldb.hospital.entitys.HistoriasClinicas;
import com.hospitaldb.hospital.services.service.HistoriasClinicasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historiasClinicasType/v1")
public class HistoriasClinicasController {

    private  final HistoriasClinicasService historiasClinicasService;

    public HistoriasClinicasController(HistoriasClinicasService historiasClinicasService) {
        this.historiasClinicasService = historiasClinicasService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<HistoriasClinicas>> listHistoriasClinicas(){
        List<HistoriasClinicas> historiasClinicas = historiasClinicasService.listarHistoriasClinicas();
        return ResponseEntity.accepted().body(historiasClinicas);
    }

    @PostMapping("/save")
    public ResponseEntity<String> guardarHistoriasClinicas(@RequestBody HistoriasClinicasRequest historiasClinicasRequest){
        historiasClinicasService.guardarHistoriasClinicas(historiasClinicasRequest);
        return ResponseEntity.accepted().body("Historia Clinica guardada");
    }

    @GetMapping("/delete")
    public ResponseEntity<String> eliminarHistoriasClinicas(@RequestParam("id") Long id ){
        historiasClinicasService.eliminarHistoriasClinicas(id);
        return ResponseEntity.accepted().body("Historia Clinica Eliminada");
    }

    @GetMapping("/update")
    public ResponseEntity<String> actualizarHistoriasClinicas(@RequestBody HistoriasClinicasRequest historiasClinicasRequest){
        historiasClinicasService.actualizarHistoriasClinicas(historiasClinicasRequest);
        return ResponseEntity.accepted().body("Laboratorio actualizado");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<HistoriasClinicasResponse> consultarHistoriasClinicas(@PathVariable Long id){
        HistoriasClinicasResponse historiasClinicas = historiasClinicasService.consultarHistoriasClinicas(id);
        return ResponseEntity.accepted().body(historiasClinicas);
    }





}