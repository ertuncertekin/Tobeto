package com.tobeto.eCommerce.controllers;

import com.tobeto.eCommerce.entities.Category;
import com.tobeto.eCommerce.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    private CategoryRepository categoryRepository;
    // Ctor Injection
    // Dependency Injection
    public CategoriesController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

   @GetMapping
    public List<Category> getAll() {
        // İşlevi yerine getirebilmek için başka bir nesneye (CategoryRepository) ihtiyaç duyuyor ise
        // Dependency denir.
        return categoryRepository.findAll();
    }

    @PostMapping
    public String add(@RequestBody Category category)
    {
        // TODO: Doğru noktaya taşı.

        categoryRepository.save(category);
        return "Başarıyla Eklendi.";
    }



}
