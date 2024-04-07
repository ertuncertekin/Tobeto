package com.tobeto.ecommercePair2.services.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCategoryRequest {
    private int id;
    @NotBlank(message = "İsim alanı boş olamaz.")
    private String name;
    private int parentCategoryId;
}
