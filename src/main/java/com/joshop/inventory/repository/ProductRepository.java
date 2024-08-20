package com.joshop.inventory.repository;

import com.joshop.inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query method to find a Product by its productId
    Product findByProductId(UUID productId);
}
