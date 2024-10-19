package com.hospitaldb.hospital.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "pacientes")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pacientes {

    @Id
    @Column(name = "id_pacientes")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "nombres_pacientes")
    private String nombres;

    @Column(name = "apellidos_pacientes")
    private String apellidos;

    @Column(name = "fk_id_tipo_documento")
    private Long tipo_documento;

    @Column(name = "documento")
    private String documento;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "fecha_nacimiento")
    private Date fechanacimiento;

    @Column(name = "lugar_nacimiento")
    private String nacimiento;



}