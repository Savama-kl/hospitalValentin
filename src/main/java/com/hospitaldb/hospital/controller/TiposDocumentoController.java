package com.hospitaldb.hospital.controller;

import com.hospitaldb.hospital.controller.request.TipoDocumentoRequest;
import com.hospitaldb.hospital.controller.response.TipoDocumentoResponse;
import com.hospitaldb.hospital.entitys.TipoDocumento;
import com.hospitaldb.hospital.services.service.TipoDocumentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documentsType/v1")
public class TiposDocumentoController {

    private  final TipoDocumentoService tipoDocumentoService;

    public TiposDocumentoController(TipoDocumentoService tipoDocumentoService) {
        this.tipoDocumentoService = tipoDocumentoService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<TipoDocumento>> listDocumentTypes(){
        List<TipoDocumento> tipoDocumentos = tipoDocumentoService.listarTiposDeDocumentos();
        return ResponseEntity.accepted().body(tipoDocumentos);
    }

    @PostMapping("/save")
    public ResponseEntity<String> guardarTipoDocumento(@RequestBody TipoDocumentoRequest tipoDocumentoRequest){
        tipoDocumentoService.guardarTiposDeDocumentos(tipoDocumentoRequest);
        return ResponseEntity.accepted().body("Tipo de documento guardado");
    }

    @GetMapping("/delete")
    public ResponseEntity<String> eliminarTipoDocumento(@RequestParam("id") Long id ){
        tipoDocumentoService.eliminarTiposDeDocumentos(id);
        return ResponseEntity.accepted().body("Tipo de documento elimindo");
    }

    @GetMapping("/update")
    public ResponseEntity<String> actualizarTipoDocumento(@RequestBody TipoDocumentoRequest tipoDocumentoRequest){
        tipoDocumentoService.actualizarTiposDeDocumentos(tipoDocumentoRequest);
        return ResponseEntity.accepted().body("Tipo de documento actualizado");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<TipoDocumentoResponse> consultarTipoDocumento(@PathVariable Long id){
        TipoDocumentoResponse tipoDocumentos = tipoDocumentoService.consultarTiposDeDocumentos(id);
        return ResponseEntity.accepted().body(tipoDocumentos);
    }





}