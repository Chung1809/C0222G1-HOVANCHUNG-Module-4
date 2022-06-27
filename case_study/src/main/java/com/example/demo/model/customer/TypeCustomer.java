package com.example.demo.model.customer;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "type_customer")
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeCustomerId;
    private String  typeCustomerName;
    @OneToMany(mappedBy = "typeCustomer")
    private Set<Customer> customer;

    public TypeCustomer(Set<Customer> customer) {
        this.customer = customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }


    public TypeCustomer() {
    }

    public TypeCustomer(Integer typeCustomerId, String typeCustomerName) {
        this.typeCustomerId = typeCustomerId;
        this.typeCustomerName = typeCustomerName;
    }

    public Integer getTypeCustomerId() {
        return typeCustomerId;
    }

    public void setTypeCustomerId(Integer typeCustomerId) {
        this.typeCustomerId = typeCustomerId;
    }

    public String getTypeCustomerName() {
        return typeCustomerName;
    }

    public void setTypeCustomerName(String typeCustomerName) {
        this.typeCustomerName = typeCustomerName;
    }
}
