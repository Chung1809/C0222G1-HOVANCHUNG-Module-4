package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository repository;

    @Override
    public void save(Product product) {
//        repository.saveProduct(product.getNameProduct(), product.getPrice(), product.getDescription(),
//                product.getProducer());
        repository.save(product);
    }

    @Override
    public void update(Product product) {
        repository.updateProduct(product.getNameProduct(), product.getPrice(), product.getDescription(),
                product.getProducer(), product.getId());
    }

    @Override
    public void delete(Integer id) {
        repository.deleteProduct(id);
    }

    @Override
    public Product findById(Integer id) {
        return repository.findByIdProduct(id);
    }

    @Override
    public Page<Product> findAll(String name, Pageable pageable) {
        return repository.findAllProduct("%"+name+"%", pageable);
    }
}
