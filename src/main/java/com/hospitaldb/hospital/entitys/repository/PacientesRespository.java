package com.hospitaldb.hospital.entitys.repository;

import com.hospitaldb.hospital.entitys.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PacientesRespository extends JpaRepository<Pacientes,Long> {


    @Query(value = "SELECT * FROM pacientes",nativeQuery = true)
    List<Pacientes> listPacienteType();

    @Query(value = "SELECT * FROM pacientes WHERE id_pacientes =:id",nativeQuery = true)
    Pacientes findByPersonsType(@Param("id") Long id);
}