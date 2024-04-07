package com.tobeto.ecommercePair2.services.concretes;

import com.tobeto.ecommercePair2.entities.Category;
import com.tobeto.ecommercePair2.repositories.CategoryRepository;
import com.tobeto.ecommercePair2.services.abstracts.CategoryService;
import com.tobeto.ecommercePair2.services.dtos.requests.AddCategoryRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.UpdateCategoryRequest;
import com.tobeto.ecommercePair2.services.dtos.responses.AddCategoryResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.UpdateCategoryResponse;
import com.tobeto.ecommercePair2.services.mappers.CategoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Override
    public AddCategoryResponse add(AddCategoryRequest addCategoryRequest) {

        categoryWithSameNameShouldNotExist(addCategoryRequest.getName());

        Category category = CategoryMapper.INSTANCE.categoryFromAddRequest(addCategoryRequest);
        category = categoryRepository.save(category);
        AddCategoryResponse addCategoryResponse = CategoryMapper.INSTANCE.addResponseFromCategory(category);
        return addCategoryResponse;
    }

    @Override
    public UpdateCategoryResponse update(UpdateCategoryRequest updateCategoryRequest) {
        categoryWithSameNameShouldNotExist(updateCategoryRequest.getName());
        categoryIdMustExist(updateCategoryRequest.getId());
        Category category = CategoryMapper.INSTANCE.categoryFromUpdateRequest(updateCategoryRequest);
        category=categoryRepository.save(category);
        UpdateCategoryResponse updateCategoryResponse = CategoryMapper.INSTANCE.updateResponseFromCategory(category);
        return updateCategoryResponse;
    }

    @Override
    public void delete(int id) {
        categoryIdMustExist(id);
        categoryRepository.deleteById(id);
    }
    private void categoryWithSameNameShouldNotExist(String name){
        Optional<Category> category = categoryRepository.findByNameIgnoreCase(name);
        if (category.isPresent()){
            throw new RuntimeException("Aynı isimde bir kategori mevcuttur.");
        }
    }
    private void categoryIdMustExist(int id){
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isEmpty()){
            throw new RuntimeException("id bulunamadı");
        }
    }
}
