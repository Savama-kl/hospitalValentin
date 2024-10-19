package com.hospitaldb.hospital.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "historias_clinicas")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoriasClinicas {

    @Id
    @Column(name = "id_historia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "fk_id_paciente")
    private Long idpaciente;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fk_id_diagnostico")
    private Long diagnostico;


}