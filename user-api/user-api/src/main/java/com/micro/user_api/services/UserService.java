package com.micro.user_api.services;

import com.micro.user_api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();

}
