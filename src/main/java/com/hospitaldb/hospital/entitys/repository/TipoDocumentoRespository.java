package com.hospitaldb.hospital.entitys.repository;

import com.hospitaldb.hospital.entitys.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TipoDocumentoRespository extends JpaRepository<TipoDocumento,Long> {


    @Query(value = "SELECT * FROM tipos_documentos",nativeQuery = true)
    List<TipoDocumento> listDocumentType();

    @Query(value = "SELECT * FROM tipos_documentos WHERE id_documento =:id",nativeQuery = true)
    TipoDocumento findByDocumentType(@Param("id") Long id);
}