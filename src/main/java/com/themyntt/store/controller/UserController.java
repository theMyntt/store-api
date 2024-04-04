package com.themyntt.store.controller;

import com.themyntt.store.entity.UserEntity;
import com.themyntt.store.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.themyntt.store.repository.UserRepo;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    private UserRepo userRepo;
    private Utils utils = new Utils();

    @PostMapping("/get/")
    UserEntity getUser(@RequestBody UserEntity userInfo) {
        String email = userInfo.email;
        String password = userInfo.password;

        return this.userRepo.getUser(email, password);
    }

    @PostMapping("/set/")
    String setUser(@RequestBody UserEntity userInfo) {
        String id = utils.createId();
        String name = userInfo.name;
        String cellphone = userInfo.cellphone;
        String email = userInfo.email;
        String password = userInfo.password;
        String company = userInfo.company;

        try {
            this.userRepo.setUser(id,name,cellphone,email,password,company);
            return "OK";
        } catch (Exception e) {
            return "Erro ao criar o usuário: " + e;
        }
    }
}
