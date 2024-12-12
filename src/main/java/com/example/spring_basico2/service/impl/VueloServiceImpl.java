package com.example.spring_basico2.service.impl;

import com.example.spring_basico2.dto.VueloDto;
import com.example.spring_basico2.entity.AvionEntity;
import com.example.spring_basico2.entity.VueloEntity;
import com.example.spring_basico2.repository.AvionRepository;
import com.example.spring_basico2.repository.VueloRepository;
import com.example.spring_basico2.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class VueloServiceImpl implements VueloService {
    @Autowired
    private AvionRepository avionRepository;
    @Autowired
    private VueloRepository vueloRepository;
    @Override
    public VueloEntity saveVuelo(VueloDto vueloDto) {
        int idAvion = vueloDto.getIdAvion();
        Optional<AvionEntity> avionOptional = avionRepository.findById(idAvion);
        
        if(avionOptional.isEmpty()) {
            return null;
        }
        VueloEntity vueloEntity = new VueloEntity();
        vueloEntity.setFechaSalida(vueloDto.getFechaSalida());
        vueloEntity.setFechaLlegada(vueloDto.getFechaLlegada());
        vueloEntity.setOrigen(vueloDto.getOrigen());
        vueloEntity.setDestino(vueloDto.getDestino());
        vueloEntity.setAvionEntity(avionOptional.get());
        return vueloRepository.save(vueloEntity);
    }

    @Override
    public VueloEntity findByid(int id) {
        return vueloRepository.findById(id).orElse(null);
    }
}
