package com.example.spring_basico2.entity;

import jakarta.persistence.*;
import org.springframework.jdbc.core.SqlReturnType;

import java.util.List;

@Entity
@Table(name = "pilotos")
public class PilotoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_piloto")
    private int id;
    private String nombre;
    private String apellido;
    private boolean estado;
    
    @ManyToMany
    @JoinTable(name = "vuelo_piloto",
            joinColumns = @JoinColumn(name = "id_piloto_fk"),
            inverseJoinColumns = @JoinColumn(name = "id_vuelo_fk"))
    private List<VueloEntity> vuelos;
}
