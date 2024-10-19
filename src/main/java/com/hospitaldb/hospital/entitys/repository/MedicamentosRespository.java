package com.hospitaldb.hospital.entitys.repository;

import com.hospitaldb.hospital.entitys.Medicamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicamentosRespository extends JpaRepository<Medicamentos,Long> {


    @Query(value = "SELECT * FROM medicamentos",nativeQuery = true)
    List<Medicamentos> listMedicamentosType();

    @Query(value = "SELECT * FROM pacientes WHERE id_medicamento =:id",nativeQuery = true)
    Medicamentos findByMedType(@Param("id") Long id);
}