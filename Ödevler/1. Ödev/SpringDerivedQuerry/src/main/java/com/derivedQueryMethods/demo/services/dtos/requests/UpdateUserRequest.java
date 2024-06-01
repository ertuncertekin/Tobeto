package com.derivedQueryMethods.demo.services.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequest {

    @NotNull(message = "ID alanı boş olamaz")
    private int id;
    @NotBlank(message = "İsim alanı boş olamaz.")
    private String firstName;
    @NotBlank(message = "Soyisim alanı boş olamaz.")
    private String lastName;
    @NotNull(message = "Doğum tarihi alanı boş olamaz.")
    private LocalDate birthDate;

}
