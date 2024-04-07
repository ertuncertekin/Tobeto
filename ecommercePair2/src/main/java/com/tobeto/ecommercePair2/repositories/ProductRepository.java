package com.tobeto.ecommercePair2.repositories;

import com.tobeto.ecommercePair2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Optional<Product> findByNameIgnoreCase(String name);
    Optional<Product> findById(int id);
}
