package com.example.demo.service.customer;

import com.example.demo.model.customer.TypeCustomer;
import com.example.demo.repository.customer.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository repository;
    @Override
    public List<TypeCustomer> findAll() {
        return repository.findAll();
    }
}
