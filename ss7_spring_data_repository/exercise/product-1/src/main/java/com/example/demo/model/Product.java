package com.example.demo.model;

import javax.persistence.*;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_product")
    private String nameProduct;
    private Double price;
    private String description;
    private String producer;
    private Integer statusProduct = 0;

    public Product() {
    }

    public Product(Integer id, String nameProduct, Double price, String description, String producer, Integer statusProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.producer = producer;
        this.statusProduct = statusProduct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(Integer statusProduct) {
        this.statusProduct = statusProduct;
    }
}
