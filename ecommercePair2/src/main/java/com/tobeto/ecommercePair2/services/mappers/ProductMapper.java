package com.tobeto.ecommercePair2.services.mappers;

import com.tobeto.ecommercePair2.entities.Product;
import com.tobeto.ecommercePair2.services.dtos.requests.AddProductRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.UpdateProductRequest;
import com.tobeto.ecommercePair2.services.dtos.responses.AddProductResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.UpdateProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "category.id", source = "categoryId")
    Product productFromAddRequest(AddProductRequest addProductRequest);

    @Mapping(target = "category.id", source = "categoryId")
    Product productFromUpdateRequest(UpdateProductRequest updateProductRequest);

    @Mapping(target = "categoryName", source = "category.name")
    AddProductResponse addResponseFromProduct(Product product);

    @Mapping(target = "categoryName", source = "category.name")
    UpdateProductResponse updateResponseFromProduct(Product product);


}
