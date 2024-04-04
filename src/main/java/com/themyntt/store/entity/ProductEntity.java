package com.themyntt.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class ProductEntity {
    @Id
    @Column(name = "ID_PRODUCT")
    public String id;

    @Column(name = "NAME_PRODUCT")
    public String name;

    @Column(name = "DESC_PRODUCT")
    public String desc;

    @Column(name = "COMPANY_NAME_COMPANY")
    public String company;

    @Column(name = "VALUE_PRODUCT")
    public double value;

    public ProductEntity() { }

    public ProductEntity(String id, String email, String desc, String company, double value) {
        this.id = id;
        this.name = email;
        this.desc = desc;
        this.company = company;
        this.value = value;
    }
}
