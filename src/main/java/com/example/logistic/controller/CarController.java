package com.example.logistic.controller;

import com.example.logistic.domain.Car;
import com.example.logistic.repository.CarRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController extends AbstractController<Car, CarRepo> {

    public CarController(CarRepo repository) {
        super(repository);
    }
}
