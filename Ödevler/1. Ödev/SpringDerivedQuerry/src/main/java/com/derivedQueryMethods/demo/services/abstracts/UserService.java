package com.derivedQueryMethods.demo.services.abstracts;

import com.derivedQueryMethods.demo.entities.User;
import com.derivedQueryMethods.demo.services.dtos.requests.AddUserRequest;
import com.derivedQueryMethods.demo.services.dtos.requests.UpdateUserRequest;
import com.derivedQueryMethods.demo.services.dtos.responses.AddUserResponse;
import com.derivedQueryMethods.demo.services.dtos.responses.UpdateUserResponse;

import java.util.List;

public interface UserService {
    AddUserResponse add(AddUserRequest addUserRequest);
    UpdateUserResponse update(UpdateUserRequest updateUserRequest);
    void delete(int id);
    List<User> getAll();
}
