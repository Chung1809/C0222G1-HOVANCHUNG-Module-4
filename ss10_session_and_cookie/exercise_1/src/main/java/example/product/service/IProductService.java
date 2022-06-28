package example.product.service;

import example.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional findById(Integer id);
}
