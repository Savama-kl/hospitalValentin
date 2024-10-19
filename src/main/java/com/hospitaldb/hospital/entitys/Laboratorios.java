package com.hospitaldb.hospital.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "laboratorios")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Laboratorios {

    @Id
    @Column(name = "id_laboratorio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "descripcion")
    private String descrip;

}