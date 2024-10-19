package com.hospitaldb.hospital.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "medicamentos")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medicamentos {

    @Id
    @Column(name = "id_medicamentos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "nombre_medicamento")
    private String nombres;

    @Column(name = "fk_id_laboratorio")
    private Long idlab;

    @Column(name = "precio")
    private Long precio;

    @Column(name = "fecha_vencimiento")
    private Date vencimiento;

    @Column(name = "fecha_fabricacion")
    private Date fabricacion;
}