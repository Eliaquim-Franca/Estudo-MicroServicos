package com.micro.user_api.services.impl;

import com.micro.user_api.domain.User;
import com.micro.user_api.repository.UserRepository;
import com.micro.user_api.services.UserService;
import com.micro.user_api.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final Environment env;
    private final UserRepository repository;


    @Override
    public User findById(Long id) {
        log.info("PAYROLL_SERVICE ::: Get request on " + env.getProperty("local.server.port") + "  port" );
        return repository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
