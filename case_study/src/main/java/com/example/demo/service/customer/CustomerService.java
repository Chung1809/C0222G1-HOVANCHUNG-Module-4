package com.example.demo.service.customer;

import com.example.demo.model.customer.Customer;
import com.example.demo.repository.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository repository;
    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void update(Customer customer) {
           repository.save(customer);
    }

    @Override
    public void delete(Integer id) {
           repository.deleteCustomer(id);
    }

    @Override
    public Customer findById(Integer id) {
        return repository.findByIdCustomer(id);
    }

    @Override
    public Page<Customer> findAll(String name, Pageable pageable) {
        return repository.findAllCustomer(name,pageable);
    }
}
