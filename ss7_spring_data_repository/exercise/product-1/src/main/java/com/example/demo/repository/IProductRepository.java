package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IProductRepository extends JpaRepository<Product, Integer> {

//    @Modifying
//    @Query(value = "insert into product(name_product,price,description,producer) values(:name,:price,:description,:producer)", nativeQuery = true)
//    void saveProduct(@Param("name") String name,
//                     @Param("price") Double price,
//                     @Param("description") String description,
//                     @Param("producer") String producer);


    @Modifying
    @Query(value = "update  product set name_product = :name,price = :price, description = :description, producer =:producer where id = :id", nativeQuery = true)
    void updateProduct(@Param("name") String name,
                       @Param("price") Double price,
                       @Param("description") String description,
                       @Param("producer") String producer,
                       @Param("id") Integer id);


    @Query(value = "select * from product where id = :id", nativeQuery = true)
    Product findByIdProduct(@Param("id") Integer id);

    @Modifying
    @Query(value = " update product set status_product = 1 where id = :id", nativeQuery = true)
    void deleteProduct(@Param("id") Integer id);

    @Query(value = "select *from product where status_product = 0 and name_product like :name", nativeQuery = true)
    Page<Product> findAllProduct(@Param("name") String name, Pageable pageable);
}
