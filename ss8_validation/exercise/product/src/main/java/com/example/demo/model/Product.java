package com.example.demo.model;

import com.example.demo.ultis.DescriptionConstraint;
import com.example.demo.ultis.NameProductConstraint;
import com.example.demo.ultis.PriceConstraint;
import com.example.demo.ultis.ProducerConstraint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NameProductConstraint
    private String name;
    @PriceConstraint
    private String price;
    @DescriptionConstraint
    private String description;
    @ProducerConstraint
    private String producer;

    public Product() {
    }

    public Product(Integer id, String name, String price, String description, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.producer = producer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
}
