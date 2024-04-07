package com.tobeto.ecommercePair2.repositories;

import com.tobeto.ecommercePair2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
