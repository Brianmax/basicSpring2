package com.example.spring_basico2.service;

import com.example.spring_basico2.dto.PilotoDto;

public interface PilotoService {
    PilotoDto savePiloto(PilotoDto pilotoDto);
    PilotoDto getPiloto(int id);
    
}
