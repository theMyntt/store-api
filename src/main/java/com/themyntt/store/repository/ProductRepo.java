package com.themyntt.store.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.themyntt.store.entity.ProductEntity;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, String> {
    @Query("SELECT p FROM ProductEntity p")
    List<ProductEntity> getAllProducts();

    @Query("SELECT p FROM ProductEntity p WHERE name = :name AND company = :company")
    ProductEntity getProduct(String name, String company);

    @Modifying
    @Transactional
    @Query("INSERT INTO ProductEntity(id, name, desc, company, value) VALUES (:id, :name, :desc, :company, :value)")
    void setProduct(String id, String name, String desc, String company, double value);
}
