package com.tobeto.ecommercePair2.services.concretes;

import com.tobeto.ecommercePair2.entities.Product;
import com.tobeto.ecommercePair2.repositories.ProductRepository;
import com.tobeto.ecommercePair2.services.abstracts.ProductService;
import com.tobeto.ecommercePair2.services.dtos.requests.AddProductRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.UpdateProductRequest;
import com.tobeto.ecommercePair2.services.dtos.responses.AddProductResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.UpdateProductResponse;
import com.tobeto.ecommercePair2.services.mappers.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public AddProductResponse add(AddProductRequest addProductRequest) {

        productWithSameNameShouldNotExist(addProductRequest.getName());
        Product product = ProductMapper.INSTANCE.productFromAddRequest(addProductRequest);
        product= productRepository.save(product);
        AddProductResponse addProductResponse = ProductMapper.INSTANCE.addResponseFromProduct(product);
        return addProductResponse;

    }

    @Override
    public UpdateProductResponse update(UpdateProductRequest updateProductRequest) {
        productIdMustExist(updateProductRequest.getId());
        productWithSameNameShouldNotExist(updateProductRequest.getName());
        Product product = ProductMapper.INSTANCE.productFromUpdateRequest(updateProductRequest);
        product= productRepository.save(product);
        UpdateProductResponse updateProductResponse = ProductMapper.INSTANCE.updateResponseFromProduct(product);
        return updateProductResponse;
    }

    @Override
    public void delete(int id) {
        productIdMustExist(id);
        productRepository.deleteById(id);

    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    private void productWithSameNameShouldNotExist(String name){
        Optional<Product> product = productRepository.findByNameIgnoreCase(name);
        if (product.isPresent()){
            throw new RuntimeException("Aynı isimle iki ürün eklenemez.");
        }
    }
    private void productIdMustExist(int id){
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()){
            throw new RuntimeException("id bulunamadı.");
        }
    }
}
