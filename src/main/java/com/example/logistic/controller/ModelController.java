package com.example.logistic.controller;

import com.example.logistic.entity.Model;
import com.example.logistic.repository.ModelRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/model")
public class ModelController extends AbstractController<Model, ModelRepo>{

    public ModelController(ModelRepo repository) {
        super(repository);
    }
}
