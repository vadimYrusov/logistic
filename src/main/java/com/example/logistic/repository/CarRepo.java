package com.example.logistic.repository;

import com.example.logistic.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
