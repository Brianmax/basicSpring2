package com.example.spring_basico2.service;

import com.example.spring_basico2.dto.VueloDto;
import com.example.spring_basico2.entity.VueloEntity;

public interface VueloService {
    VueloEntity saveVuelo(VueloDto vueloDto);
    VueloEntity findByid(int id);
}
