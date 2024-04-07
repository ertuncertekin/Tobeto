package com.tobeto.ecommercePair2.services.concretes;

import com.tobeto.ecommercePair2.entities.UserRole;
import com.tobeto.ecommercePair2.services.abstracts.UserService;
import com.tobeto.ecommercePair2.services.dtos.requests.AddUserRequest;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void add() {

    }
    public static void addUser(AddUserRequest request) {
        // Kullanıcı girişi bilgilerini al ve işlemleri gerçekleştir
        UserRole userRole = UserRole.fromString(request.getUserRole());

        // Kullanıcının rolünü kontrol et
        if (userRole == UserRole.ADMIN) {
            // ADMIN ise gerekli işlemleri gerçekleştir
            // Örneğin, kullanıcı ekleme işlemi
        } else {
            // ADMIN değilse yetki hatası fırlat veya uygun işlemi yap
            throw new SecurityException("Only admins can perform this action.");
        }
    }
}
