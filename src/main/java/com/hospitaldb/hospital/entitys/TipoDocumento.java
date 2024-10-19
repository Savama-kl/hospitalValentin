package com.hospitaldb.hospital.entitys;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipos_documentos")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoDocumento {

    @Id
    @Column(name = "id_documento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "siglas")
    private String sigla;

    @Column(name = "descripcion")
    private String descripcion;



}