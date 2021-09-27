package com.udemy.shopwebservices.resources;

import com.udemy.shopwebservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Paulo", "paulo@gmail.com", "9858585", "123");
        return ResponseEntity.ok().body(u);
    }
}
