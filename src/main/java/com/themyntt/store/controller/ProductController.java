package com.themyntt.store.controller;

import com.themyntt.store.entity.ProductEntity;
import com.themyntt.store.repository.ProductRepo;
import com.themyntt.store.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/product/")
public class ProductController {
    @Autowired
    private ProductRepo productRepo;
    private Utils utils = new Utils();

    @GetMapping("/get/all/")
    public List<ProductEntity> getProducts() {
        return productRepo.getAllProducts();
    }

    @PostMapping("/get/")
    public ProductEntity getOneProduct(@RequestBody ProductEntity productInfo) {
        String name = productInfo.name;
        String company = productInfo.company;

        return this.productRepo.getProduct(name,company);
    }

    @PostMapping("/set/")
    public String setProduct(@RequestBody ProductEntity productInfo) {
        String id = utils.createId();
        String name = productInfo.name;
        String desc = productInfo.desc;
        String company = productInfo.company;
        double value = productInfo.value;

        try {
            productRepo.setProduct(id, name, desc, company, value);
            return "OK";
        } catch (Exception e) {
            return "Erro ao inserir";
        }

    }
}
