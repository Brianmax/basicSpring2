package com.example.spring_basico2.repository;

import com.example.spring_basico2.entity.AvionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionRepository extends JpaRepository<AvionEntity, Integer> {
}
