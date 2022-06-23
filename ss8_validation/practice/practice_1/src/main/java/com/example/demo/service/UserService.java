package com.example.demo.service;

import com.example.demo.model.UserStudent;
import com.example.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository repository;
    @Override
    public List<UserStudent> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(UserStudent user) {
       repository.save(user);
    }
}
