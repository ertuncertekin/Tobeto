package com.derivedQueryMethods.demo.repository;

import com.derivedQueryMethods.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByNameIgnoreCase(String name);
    Optional<User> findById(int id);
}
