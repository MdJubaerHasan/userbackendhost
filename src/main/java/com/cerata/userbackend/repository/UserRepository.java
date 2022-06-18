package com.cerata.userbackend.repository;

import com.cerata.userbackend.bean.model.User;
import com.cerata.userbackend.bean.requests.CreateUserRequest;

import java.util.List;

public interface UserRepository {
    User createUser(CreateUserRequest createUserRequest);
    List<User> readUsers();
}
