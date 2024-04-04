package com.themyntt.store.repository;

import com.themyntt.store.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, String> {
    @Query("SELECT u FROM UserEntity u WHERE u.email = :email AND u.password = :password")
    UserEntity getUser(@Param("email") String email, @Param("password") String password);

    @Modifying
    @Transactional
    @Query("INSERT INTO UserEntity(id,name,cellphone,email,password,company) VALUES (:id,:name,:cellphone,:email,:password,:company)")
    void setUser(@Param("id") String id, @Param("name") String name, @Param("cellphone") String cellphone, @Param("email") String email, @Param("password") String password, @Param("company") String company);
}

