package com.derivedQueryMethods.demo.services.mappers;

import com.derivedQueryMethods.demo.entities.User;
import com.derivedQueryMethods.demo.services.dtos.requests.AddUserRequest;
import com.derivedQueryMethods.demo.services.dtos.requests.UpdateUserRequest;
import com.derivedQueryMethods.demo.services.dtos.responses.AddUserResponse;
import com.derivedQueryMethods.demo.services.dtos.responses.UpdateUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userFromAddRequest(AddUserRequest addUserRequest);

    User userFromUpdateRequest(UpdateUserRequest updateUserRequest);

    AddUserResponse addResponseFromUser(User user);

    UpdateUserResponse updateResponseFromUser(User user);

}
