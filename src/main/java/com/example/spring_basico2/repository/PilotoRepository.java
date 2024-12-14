package com.example.spring_basico2.repository;

import com.example.spring_basico2.entity.PilotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotoRepository extends JpaRepository<PilotoEntity, Integer> {
}
