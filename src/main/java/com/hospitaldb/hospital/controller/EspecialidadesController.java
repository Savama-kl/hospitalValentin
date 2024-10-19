package com.hospitaldb.hospital.controller;



import com.hospitaldb.hospital.controller.request.EspecialidadesRequest;
import com.hospitaldb.hospital.controller.response.EspecialidadesResponse;
import com.hospitaldb.hospital.entitys.Especialidades;
import com.hospitaldb.hospital.services.service.EspecialidadesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidadesType/v1")
public class EspecialidadesController {

    private  final EspecialidadesService especialidadesService;

    public EspecialidadesController(EspecialidadesService especialidadesService) {
        this.especialidadesService = especialidadesService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Especialidades>> listEspecialidades(){
        List<Especialidades> especialidades = especialidadesService.listarEspecialidades();
        return ResponseEntity.accepted().body(especialidades);
    }

    @PostMapping("/save")
    public ResponseEntity<String> guardarEspecialidades(@RequestBody EspecialidadesRequest especialidadesRequest){
        especialidadesService.guardarEspecialidades(especialidadesRequest);
        return ResponseEntity.accepted().body("Especialidad guardada");
    }

    @GetMapping("/delete")
    public ResponseEntity<String> eliminarEspecialidad(@RequestParam("id") Long id ){
        especialidadesService.eliminarEspecialidades(id);
        return ResponseEntity.accepted().body("Especialidad Eliminada");
    }

    @GetMapping("/update")
    public ResponseEntity<String> actualizarEspecialidades(@RequestBody EspecialidadesRequest especialidadesRequest){
        especialidadesService.actualizarEspecialidades(especialidadesRequest);
        return ResponseEntity.accepted().body("Especialidades actualizadas");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<EspecialidadesResponse> consultarEspecialidades(@PathVariable Long id){
        EspecialidadesResponse especialidades = especialidadesService.consultarEspecialidades(id);
        return ResponseEntity.accepted().body(especialidades);
    }





}