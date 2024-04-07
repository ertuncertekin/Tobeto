package com.tobeto.ecommercePair2.controllers;

import com.tobeto.ecommercePair2.services.abstracts.CategoryService;
import com.tobeto.ecommercePair2.services.dtos.requests.AddCategoryRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.UpdateCategoryRequest;
import com.tobeto.ecommercePair2.services.dtos.responses.AddCategoryResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.UpdateCategoryResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddCategoryResponse add(@RequestBody @Valid AddCategoryRequest request){
        return categoryService.add(request);
    }
    @PutMapping
    public UpdateCategoryResponse update(@RequestBody @Valid UpdateCategoryRequest request){
        return categoryService.update(request);
    }
    @DeleteMapping
    public void delete(@RequestParam int id){
        categoryService.delete(id);
    }


}
