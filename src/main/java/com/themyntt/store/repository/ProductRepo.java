package com.themyntt.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.themyntt.store.entity.ProductEntity;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, String> {
    @Query("SELECT p FROM ProductEntity p")
    List<ProductEntity> findAll();
}
