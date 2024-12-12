package com.example.spring_basico2.repository;

import com.example.spring_basico2.entity.VueloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VueloRepository extends JpaRepository <VueloEntity, Integer> {
}
