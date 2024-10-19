package com.hospitaldb.hospital.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "especialidades")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Especialidades {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "descripcion")
    private String descripcion;


}