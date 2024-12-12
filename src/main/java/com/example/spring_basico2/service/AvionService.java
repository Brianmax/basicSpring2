package com.example.spring_basico2.service;

import com.example.spring_basico2.entity.AvionEntity;

public interface AvionService {
    AvionEntity saveAvion(AvionEntity avionEntity);
    AvionEntity findByIdAvion(int id);
}
