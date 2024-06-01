package com.derivedQueryMethods.demo.services.concretes;

import com.derivedQueryMethods.demo.entities.User;
import com.derivedQueryMethods.demo.repository.UserRepository;
import com.derivedQueryMethods.demo.services.abstracts.UserService;
import com.derivedQueryMethods.demo.services.dtos.requests.AddUserRequest;
import com.derivedQueryMethods.demo.services.dtos.requests.UpdateUserRequest;
import com.derivedQueryMethods.demo.services.dtos.responses.AddUserResponse;
import com.derivedQueryMethods.demo.services.dtos.responses.UpdateUserResponse;
import com.derivedQueryMethods.demo.services.mappers.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public AddUserResponse add(AddUserRequest addUserRequest) {
        userWithSameNameShouldNotExist(addUserRequest.getFirstName());
        userWithSameNameShouldNotExist(addUserRequest.getLastName());

        User user = UserMapper.INSTANCE.userFromAddRequest(addUserRequest);
        user = userRepository.save(user);
        AddUserResponse addUserResponse = UserMapper.INSTANCE.addResponseFromUser(user);

        return addUserResponse;
    }

    @Override
    public UpdateUserResponse update(UpdateUserRequest updateUserRequest) {
        userIdMustExist(updateUserRequest.getId());
        userWithSameNameShouldNotExist(updateUserRequest.getFirstName());
        userWithSameNameShouldNotExist(updateUserRequest.getLastName());

        User user = UserMapper.INSTANCE.userFromUpdateRequest(updateUserRequest);
        user = userRepository.save(user);
        UpdateUserResponse updateUserResponse = UserMapper.INSTANCE.updateResponseFromUser(user);

        return updateUserResponse;
    }

    @Override
    public void delete(int id) {
        userIdMustExist(id);
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    private void userWithSameNameShouldNotExist(String name) {
        Optional<User> user = userRepository.findByNameIgnoreCase(name);
        if (user.isPresent()) {
            throw new RuntimeException("Aynı isimle iki kullanıcı eklenemez");
        }
    }

    private void userIdMustExist(int id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()) {
            throw new RuntimeException("ID bulunamadı");
        }
    }
}
