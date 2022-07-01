package com.example.demo.service;

import com.example.demo.model.SmartPhone;
import com.example.demo.repository.SmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartPhoneService implements ISmartPhoneService {
    @Autowired
    private SmartPhoneRepository repository;

    @Override
    public Iterable<SmartPhone> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<SmartPhone> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(SmartPhone smartPhone) {
        repository.save(smartPhone);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void update(SmartPhone smartPhone ) {
      repository.save(smartPhone);
    }
}
