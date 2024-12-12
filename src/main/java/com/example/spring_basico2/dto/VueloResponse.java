package com.example.spring_basico2.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class VueloResponse {
    private Date fechaSalida;
    private Date fechaLlegada;
    private String origen;
    private String destino;
    private String modeloAvion;
    private String aerolinea;
}
