package com.example.demo.repository.customer;

import com.example.demo.model.customer.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<TypeCustomer , Integer> {
}
