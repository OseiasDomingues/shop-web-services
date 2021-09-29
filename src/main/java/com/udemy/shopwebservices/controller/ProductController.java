package com.udemy.shopwebservices.controller;

import com.udemy.shopwebservices.entities.Product;
import com.udemy.shopwebservices.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServices services;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = services.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product product = services.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
