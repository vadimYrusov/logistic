package com.example.logistic.controller;

import com.example.logistic.domain.Brand;
import com.example.logistic.repository.BrandRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brand")
public class BrandController extends AbstractController<Brand, BrandRepo> {

    public BrandController(BrandRepo repository) {
        super(repository);
    }
}
