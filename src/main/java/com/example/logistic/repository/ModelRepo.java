package com.example.logistic.repository;

import com.example.logistic.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepo extends JpaRepository<Model, Long> {
}
