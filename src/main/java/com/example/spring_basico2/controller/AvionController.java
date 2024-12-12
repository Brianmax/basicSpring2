package com.example.spring_basico2.controller;

import com.example.spring_basico2.dto.AvionDto;
import com.example.spring_basico2.entity.AvionEntity;
import com.example.spring_basico2.service.AvionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/avion")
public class AvionController {
    private AvionService avionService;
    
    public AvionController(AvionService avionService) {
        this.avionService = avionService;
    }
    
    @PostMapping("/save")
    ResponseEntity<AvionEntity> saveAvion(@RequestBody AvionDto avionDto) {
        AvionEntity avionEntityResponse = avionService.saveAvion(avionDto);
        
        if(avionEntityResponse == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok(avionEntityResponse);
    }
    // data transfer object
    
    @GetMapping("/find/{id}")
    ResponseEntity<AvionEntity> findByIdAvion(@PathVariable int id) {
        AvionEntity avionEntity = avionService.findByIdAvion(id);
        if(avionEntity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(avionEntity);
    }
}
