package com.tobeto.ecommercePair2.services.abstracts;

import com.tobeto.ecommercePair2.services.dtos.requests.AddCategoryRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.UpdateCategoryRequest;
import com.tobeto.ecommercePair2.services.dtos.responses.AddCategoryResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.UpdateCategoryResponse;

public interface CategoryService {
    AddCategoryResponse add(AddCategoryRequest addCategoryRequest);
    UpdateCategoryResponse update(UpdateCategoryRequest updateCategoryRequest);
    void delete(int id);


}
