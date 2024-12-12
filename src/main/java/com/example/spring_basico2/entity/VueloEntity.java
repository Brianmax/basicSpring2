package com.example.spring_basico2.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "vuelos")
public class VueloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vuelo")
    private int id;
    @Column(name = "fecha_salida")
    private Date fechaSalida;
    @Column(name = "fecha_llegada")
    private Date fechaLlegada;
    private String origen;
    private String destino;
    
    @ManyToOne
    @JoinColumn(name = "id_avion_fk")
    private AvionEntity avionEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public AvionEntity getAvionEntity() {
        return avionEntity;
    }

    public void setAvionEntity(AvionEntity avionEntity) {
        this.avionEntity = avionEntity;
    }
}
