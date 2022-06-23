package com.example.demo.service;

import com.example.demo.model.UserStudent;

import java.util.List;

public interface IUserService {
    List<UserStudent> findAll();
    void save(UserStudent user);
}
