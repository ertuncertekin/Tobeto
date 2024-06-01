package com.derivedQueryMethods.demo.controllers;

import com.derivedQueryMethods.demo.entities.User;
import com.derivedQueryMethods.demo.services.abstracts.UserService;
import com.derivedQueryMethods.demo.services.dtos.requests.AddUserRequest;
import com.derivedQueryMethods.demo.services.dtos.requests.UpdateUserRequest;
import com.derivedQueryMethods.demo.services.dtos.responses.AddUserResponse;
import com.derivedQueryMethods.demo.services.dtos.responses.UpdateUserResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<User> getAllList() {
        return userService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddUserResponse add(@RequestBody @Valid AddUserRequest addUserRequest) {
        return userService.add(addUserRequest);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UpdateUserResponse update(@RequestBody @Valid UpdateUserRequest updateUserRequest) {
        return userService.update(updateUserRequest);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void delete(@RequestParam int id) {
        userService.delete(id);
    }
}
