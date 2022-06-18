package com.cerata.userbackend.controllers;


import com.cerata.userbackend.bean.model.User;
import com.cerata.userbackend.bean.requests.CreateUserRequest;
import com.cerata.userbackend.repository.UserRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "users/v1",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/create-user")
    public List<User> createUser(@RequestBody CreateUserRequest createUserRequest) {
        userRepository.createUser(createUserRequest);
        return userRepository.readUsers();
    }

    @PostMapping("/get-users")
    public List<User> getUsers(){
        return userRepository.readUsers();
    }



}
