package com.hospitaldb.hospital.entitys.repository;

import com.hospitaldb.hospital.entitys.Especialidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EspecialidadesRespository extends JpaRepository<Especialidades,Long> {


    @Query(value = "SELECT * FROM especialidades",nativeQuery = true)
    List<Especialidades> listEspecialidadesType();

    @Query(value = "SELECT * FROM pacientes WHERE especialidades =:id",nativeQuery = true)
    Especialidades findByEspecialidadesType(@Param("id") Long id);
}