package codegym.repository;

import codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {

    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone", 50000d, "Iphone 14", "Iphone"));
        productList.add(new Product(2, "Vivo", 60000d, "Vivo x80", "Vivo"));
        productList.add(new Product(3, "Samsung", 70000d, "Samsung A53", "Samsung"));
        productList.add(new Product(4, "Oppo", 80000d, "Oppo Reno6Z 5G", "Oppo"));
        productList.add(new Product(5, "Huawei", 90000d, "Huawei Pro", "Huawei"));

    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void update(Product product) {
        int id = product.getId();
        for (Product item : productList) {
            if (item.getId() == id) {
                item.setName(product.getName());
                item.setPrice(product.getPrice());
                item.setDescription(product.getDescription());
                item.setProducer(product.getProducer());
            }
        }
    }

    @Override
    public void delete(int id) {
        productList.removeIf(item -> item.getId() == id);
    }

    @Override
    public Product findById(int id) {
        for (Product item : productList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> list = new ArrayList<>();
        for (Product item : productList) {
            if (item.getName().toUpperCase().contains(name.toUpperCase())) {
                list.add(item);
            }
        }
        return list;
    }
}
