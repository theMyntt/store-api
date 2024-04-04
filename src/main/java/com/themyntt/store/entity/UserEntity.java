package com.themyntt.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.apache.catalina.User;

@Entity
@Table(name = "USER")
public class UserEntity {
    @Id
    @Column(name = "ID_CLIENT")
    public String id;

    @Column(name = "NAME_CLIENT")
    public String name;

    @Column(name = "CELLPHONE_USER")
    public String cellphone;

    @Column(name = "EMAIL_USER")
    public String email;

    @Column(name = "PASSWORD_USER")
    public String password;

    @Column(name = "COMPANY_NAME_COMPANY")
    public String company;

    public UserEntity() { }

    public UserEntity(String id, String name, String cellphone, String email, String password, String company) {
        this.id = id;
        this.name = name;
        this.cellphone = cellphone;
        this.email = email;
        this.password = password;
        this.company = company;
    }
}
