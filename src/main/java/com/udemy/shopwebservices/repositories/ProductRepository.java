package com.udemy.shopwebservices.repositories;

import com.udemy.shopwebservices.entities.Category;
import com.udemy.shopwebservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
