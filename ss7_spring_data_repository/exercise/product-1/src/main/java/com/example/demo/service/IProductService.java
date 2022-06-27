package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {

    void save(Product product);

    void update(Product product);

    void delete(Integer id);

    Product findById(Integer id);

    Page<Product> findAll(String name, Pageable pageable);
}
