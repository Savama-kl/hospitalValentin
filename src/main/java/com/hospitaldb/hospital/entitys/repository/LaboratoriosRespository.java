package com.hospitaldb.hospital.entitys.repository;

import com.hospitaldb.hospital.entitys.Laboratorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LaboratoriosRespository extends JpaRepository<Laboratorios,Long> {


    @Query(value = "SELECT * FROM laboratorios",nativeQuery = true)
    List<Laboratorios> listLaboratoriosType();

    @Query(value = "SELECT * FROM laboratorios WHERE id_laboratorio =:id",nativeQuery = true)
    Laboratorios findByLabsType(@Param("id") Long id);
}