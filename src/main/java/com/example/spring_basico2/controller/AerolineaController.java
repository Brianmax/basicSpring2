package com.example.spring_basico2.controller;

import com.example.spring_basico2.entity.AerolineaEntity;
import com.example.spring_basico2.repository.AerolineaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/aerolinea")
public class AerolineaController {
    @Autowired
    private AerolineaRepository aerolineaRepository;
    
    @PostMapping("/save")
    AerolineaEntity saveAerolinea(@RequestBody AerolineaEntity aerolineaEntity) {
        return aerolineaRepository.save(aerolineaEntity);
    }  
}
