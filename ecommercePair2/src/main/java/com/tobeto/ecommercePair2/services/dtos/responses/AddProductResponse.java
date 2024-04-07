package com.tobeto.ecommercePair2.services.dtos.responses;

import com.tobeto.ecommercePair2.entities.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductResponse {
    private int id;
    private String name;
    private String description;
    private double unitPrice;
    private int unitInStock;
    private String categoryName;
}
