package com.tobeto.ecommercePair2.services.dtos.requests;

import com.tobeto.ecommercePair2.entities.Category;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {
    @NotBlank(message = "İsim alanı boş olamaz.")
    private String name;
    @NotBlank(message = "Açıklama alanı boş olamaz.")
    private String description;
    @NotNull(message = "Fiyat alanı boş olamaz.")
    @PositiveOrZero(message = "Fiyat Sıfırdan Küçük Olamaz")
    private double unitPrice;
    @NotNull(message = "Stok alanı boş olamaz.")
    @PositiveOrZero(message = "Stok Sıfırdan Küçük Olamaz")
    private int unitInStock;
    private int categoryId;

}
