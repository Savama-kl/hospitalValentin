package com.hospitaldb.hospital.controller;


import com.hospitaldb.hospital.controller.request.PacientesRequest;
import com.hospitaldb.hospital.controller.response.PacientesResponse;
import com.hospitaldb.hospital.controller.response.TipoDocumentoResponse;
import com.hospitaldb.hospital.entitys.Pacientes;
import com.hospitaldb.hospital.services.service.PacientesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientesType/v1")
public class PacientesController {

    private  final PacientesService pacientesService;

    public PacientesController(PacientesService pacientesService) {
        this.pacientesService = pacientesService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Pacientes>> listPaciente(){
        List<Pacientes> pacientes = pacientesService.listarPacientes();
        return ResponseEntity.accepted().body(pacientes);
    }

    @PostMapping("/save")
    public ResponseEntity<String> guardarPaciente(@RequestBody PacientesRequest pacientesRequest){
        pacientesService.guardarPacientes(pacientesRequest);
        return ResponseEntity.accepted().body("Paciente guardado");
    }

    @GetMapping("/delete")
    public ResponseEntity<String> eliminarPaciente(@RequestParam("id") Long id ){
        pacientesService.eliminarPacientes(id);
        return ResponseEntity.accepted().body("Paciente Eliminado");
    }

    @GetMapping("/update")
    public ResponseEntity<String> actualizarPacientes(@RequestBody PacientesRequest pacientesRequest){
        pacientesService.actualizarPacientes(pacientesRequest);
        return ResponseEntity.accepted().body("Paciente actualizado");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<PacientesResponse> consultarPacientes(@PathVariable Long id){
        PacientesResponse pacientes = pacientesService.consultarPacientes(id);
        return ResponseEntity.accepted().body(pacientes);
    }





}