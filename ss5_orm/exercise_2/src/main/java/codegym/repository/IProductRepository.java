package codegym.repository;

import codegym.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    void update(Product product);

    void delete(int id);

    Product findById(int id);

    List<Product> search(String name);
}
