package com.tobeto.ecommercePair2.controllers;

import com.tobeto.ecommercePair2.services.abstracts.ProductService;
import com.tobeto.ecommercePair2.services.dtos.requests.AddProductRequest;
import com.tobeto.ecommercePair2.services.dtos.requests.UpdateProductRequest;
import com.tobeto.ecommercePair2.services.dtos.responses.AddProductResponse;
import com.tobeto.ecommercePair2.services.dtos.responses.UpdateProductResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddProductResponse add(@RequestBody @Valid AddProductRequest request)
    {
        return productService.add(request);
    }
    @PutMapping
    public UpdateProductResponse update(@RequestBody @Valid UpdateProductRequest request)
    {
        return productService.update(request);
    }
    @DeleteMapping
    public void delete(@RequestParam int id){
        productService.delete(id);
    }


}
