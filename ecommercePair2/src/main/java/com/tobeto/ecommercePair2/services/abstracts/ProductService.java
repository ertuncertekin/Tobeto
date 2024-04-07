package com.tobeto.ecommercePair2.services.abstracts;

import com.tobeto.ecommercePair2.entities.Product;
import com.tobeto.ecommercePair2.services.dtos.requests.AddProductRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.UpdateProductRequest;
import com.tobeto.ecommercePair2.services.dtos.responses.AddProductResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.UpdateProductResponse;

import java.util.List;

public interface ProductService {
    AddProductResponse add(AddProductRequest addProductRequest);
    UpdateProductResponse update(UpdateProductRequest updateProductRequest);
    void delete(int id);

    List<Product> getAll();
}
