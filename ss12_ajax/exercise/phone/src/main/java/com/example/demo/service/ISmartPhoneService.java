package com.example.demo.service;

import com.example.demo.model.SmartPhone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ISmartPhoneService {
    Iterable<SmartPhone> findAll();

    Optional<SmartPhone> findById(Integer id);

    void save(SmartPhone smartPhone);

    void remove(Integer id);

    void update(SmartPhone smartPhone);
}
