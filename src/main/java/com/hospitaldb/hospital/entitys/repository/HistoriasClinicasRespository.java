package com.hospitaldb.hospital.entitys.repository;

import com.hospitaldb.hospital.entitys.HistoriasClinicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HistoriasClinicasRespository extends JpaRepository<HistoriasClinicas,Long> {


    @Query(value = "SELECT * FROM historias_clinicas",nativeQuery = true)
    List<HistoriasClinicas> listHistoriasClinicasType();

    @Query(value = "SELECT * FROM historias_clinicas WHERE id_historia =:id",nativeQuery = true)
    HistoriasClinicas findByHistoriasClinicasType(@Param("id") Long id);
}