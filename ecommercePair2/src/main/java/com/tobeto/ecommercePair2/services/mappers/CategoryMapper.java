package com.tobeto.ecommercePair2.services.mappers;

import com.tobeto.ecommercePair2.entities.Category;
import com.tobeto.ecommercePair2.entities.Product;
import com.tobeto.ecommercePair2.services.dtos.requests.AddCategoryRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.AddProductRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.UpdateCategoryRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.UpdateProductRequest;
import com.tobeto.ecommercePair2.services.dtos.responses.AddCategoryResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.AddProductResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.UpdateCategoryResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.UpdateProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    //
    @Mapping(target = "parentCategory.id", source = "parentCategoryId")
    Category categoryFromAddRequest(AddCategoryRequest addCategoryRequest);
    @Mapping(target = "parentCategory.id", source = "parentCategoryId")
    Category categoryFromUpdateRequest(UpdateCategoryRequest updateCategoryRequest);
    AddCategoryResponse addResponseFromCategory(Category category);
    UpdateCategoryResponse updateResponseFromCategory(Category category);


}
