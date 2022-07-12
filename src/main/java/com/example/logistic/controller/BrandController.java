package com.example.logistic.controller;

import com.example.logistic.entity.Brand;
import com.example.logistic.repository.BrandRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brand")
public class BrandController extends AbstractController<Brand, BrandRepo> {

    public BrandController(BrandRepo repository) {
        super(repository);
    }
}
