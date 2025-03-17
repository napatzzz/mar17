package org.example.mar17.controllers;

import org.example.mar17.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("")
    public ResponseEntity<Object> getUsers() {
        return ResponseEntity.ok(userRepo.findAll());
    }
}
