package com.example.spring_basico2.repository;

import com.example.spring_basico2.entity.AerolineaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AerolineaRepository extends JpaRepository<AerolineaEntity, Integer> {
}
