package com.example.demo.service.customer;

import com.example.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    void save(Customer customer);

    void update(Customer customer);

    void delete(Integer id);

    Customer findById(Integer id);

    Page<Customer> findAll(String name, Pageable pageable);
}
