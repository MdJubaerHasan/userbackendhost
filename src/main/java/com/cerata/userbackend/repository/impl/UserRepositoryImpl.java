package com.cerata.userbackend.repository.impl;

import com.cerata.userbackend.bean.model.User;
import com.cerata.userbackend.bean.requests.CreateUserRequest;
import com.cerata.userbackend.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserRepositoryImpl implements UserRepository {
    private final ArrayList<User> userList = new ArrayList<>();

    public User createUser(CreateUserRequest createUserRequest) {
        User newUser = User.builder()
                .firstName(createUserRequest.getFirstName())
                .lastName(createUserRequest.getLastName())
                .dateOfBirth(createUserRequest.getDateOfBirth())
                .gender(createUserRequest.getGender())
                .email(createUserRequest.getEmail())
                .phone(createUserRequest.getPhone())
                .city(createUserRequest.getCity())
                .build();
        userList.add(newUser);
        return newUser;
    }

    public List<User> readUsers() {
        return userList;
    }
}
