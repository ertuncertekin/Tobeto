package com.tobeto.ecommercePair2.services.dtos.requests;

import com.tobeto.ecommercePair2.entities.UserRole;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddUserRequest {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String  userRole;

}
