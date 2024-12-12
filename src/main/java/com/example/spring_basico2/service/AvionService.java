package com.example.spring_basico2.service;

import com.example.spring_basico2.dto.AvionDto;
import com.example.spring_basico2.entity.AvionEntity;

public interface AvionService {
    AvionEntity saveAvion(AvionDto avionDto);
    AvionEntity findByIdAvion(int id);
}
