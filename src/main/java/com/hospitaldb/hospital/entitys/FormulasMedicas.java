package com.hospitaldb.hospital.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "formulas_medicas")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FormulasMedicas {

    @Id
    @Column(name = "id_formula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "fk_id_historia_clinica")
    private Long idHistoriaClinica;

    @Column(name = "fk_id_doctor")
    private Long idDoctor;

    @Column(name = "fk_id_medicamento")
    private Long idMedicamento;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_formulacion")
    private Date fechaFormula;


}