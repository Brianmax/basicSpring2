package com.example.spring_basico2.service.impl;

import com.example.spring_basico2.entity.AerolineaEntity;
import com.example.spring_basico2.entity.AvionEntity;
import com.example.spring_basico2.repository.AerolineaRepository;
import com.example.spring_basico2.repository.AvionRepository;
import com.example.spring_basico2.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvionServiceImpl implements AvionService {
    private AvionRepository avionRepository;
    private AerolineaRepository aerolineaRepository;
    
    public AvionServiceImpl(AerolineaRepository aerolineaRepository, AvionRepository avionRepository) {
        this.aerolineaRepository = aerolineaRepository;
        this.avionRepository = avionRepository;
    }
    
    @Override
    public AvionEntity saveAvion(AvionEntity avionEntity) {
        int idAerolinea = avionEntity.getAerolineaEntity().getId();
        
        // buscar si ese id existe en la tabla aerolineas
        
        Optional<AerolineaEntity> optionalAerolinea = aerolineaRepository.findById(idAerolinea);
        
        if(optionalAerolinea.isEmpty()) {
            return null;
        }
        
        return avionRepository.save(avionEntity);
    }

    @Override
    public AvionEntity findByIdAvion(int id) {
        Optional<AvionEntity> avionOptional = avionRepository.findById(id);
        if(avionOptional.isEmpty()) {
            return null;
        }
        return avionOptional.get();
    }
}