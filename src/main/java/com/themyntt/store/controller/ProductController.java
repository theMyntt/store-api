package com.themyntt.store.controller;

import com.themyntt.store.entity.ProductEntity;
import com.themyntt.store.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product/")
public class ProductController {
    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/get/")
    public List<ProductEntity> getProducts() {
        return productRepo.findAll();
    }
}
