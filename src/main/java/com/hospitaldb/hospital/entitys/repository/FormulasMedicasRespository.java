package com.hospitaldb.hospital.entitys.repository;

import com.hospitaldb.hospital.entitys.FormulasMedicas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FormulasMedicasRespository extends JpaRepository<FormulasMedicas,Long> {


    @Query(value = "SELECT * FROM formulas_medicas",nativeQuery = true)
    List<FormulasMedicas> listFormulasMedicasType();

    @Query(value = "SELECT * FROM pacientes WHERE id_formula =:id",nativeQuery = true)
    FormulasMedicas findByFormulaType(@Param("id") Long id);
}