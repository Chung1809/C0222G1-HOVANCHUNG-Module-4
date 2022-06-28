package example.product.service;

import example.product.model.Product;
import example.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository repository;


    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional findById(Integer id) {
        return repository.findById(id);
    }
}
