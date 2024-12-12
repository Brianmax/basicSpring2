package com.example.spring_basico2.controller;

import com.example.spring_basico2.dto.VueloDto;
import com.example.spring_basico2.dto.VueloResponse;
import com.example.spring_basico2.entity.VueloEntity;
import com.example.spring_basico2.service.VueloService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vuelo")
public class VueloController {
    @Autowired
    private VueloService vueloService;
    
    @PostMapping("/save")
    public VueloEntity saveVueloEntity(@RequestBody VueloDto vueloDto) {
        return vueloService.saveVuelo(vueloDto);
    }
    
    @GetMapping("/find/{id}")
    public VueloResponse getVueloById(@PathVariable int id) {
        return vueloService.findByid(id);
    }
}
