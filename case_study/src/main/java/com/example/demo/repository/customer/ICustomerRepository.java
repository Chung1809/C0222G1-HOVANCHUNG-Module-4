package com.example.demo.repository.customer;

import com.example.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {



    @Query(value = "select * from customer where customer_id = :id", nativeQuery = true)
    Customer findByIdCustomer(@Param("id") Integer id);

    @Modifying
    @Query(value = " update customer set status_customer = 1 where customer_id = :id", nativeQuery = true)
    void deleteCustomer(@Param("id") Integer id);

    @Query(value = "select *from customer where status_customer = 0 and customer_name like :name", nativeQuery = true)
    Page<Customer> findAllCustomer(@Param("name") String name, Pageable pageable);
}
