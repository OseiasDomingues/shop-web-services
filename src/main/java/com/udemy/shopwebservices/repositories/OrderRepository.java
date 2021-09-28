package com.udemy.shopwebservices.repositories;

import com.udemy.shopwebservices.entities.Order;
import com.udemy.shopwebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
