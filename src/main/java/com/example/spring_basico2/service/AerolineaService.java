package com.example.spring_basico2.service;

import com.example.spring_basico2.entity.AerolineaEntity;
import com.example.spring_basico2.repository.AerolineaRepository;

public interface AerolineaService {
    AerolineaEntity saveAerolinea(AerolineaEntity aerolineaEntity);
    AerolineaEntity findByIdAerolinea(int id);
}
