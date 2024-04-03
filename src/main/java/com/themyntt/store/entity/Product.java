package com.themyntt.store.entity;

public class Product {
    public String id;
    public String name;
    public String desc;
    public double value;

    public Product(String id, String email, String desc, double value) {
        this.id = id;
        this.name = email;
        this.desc = desc;
        this.value = value;
    }
}
