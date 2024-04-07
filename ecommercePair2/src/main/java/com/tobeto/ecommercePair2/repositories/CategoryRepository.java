package com.tobeto.ecommercePair2.repositories;

import com.tobeto.ecommercePair2.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Optional<Category> findByNameIgnoreCase(String name);

    Optional<Category> findById(int id);
}
