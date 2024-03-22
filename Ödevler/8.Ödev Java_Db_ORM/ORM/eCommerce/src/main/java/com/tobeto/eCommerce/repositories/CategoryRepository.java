package com.tobeto.eCommerce.repositories;

import com.tobeto.eCommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category,Integer>
{
}
