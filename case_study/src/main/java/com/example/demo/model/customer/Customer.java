package com.example.demo.model.customer;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String customerCode;
    private Integer customerTypeId;
    private String customerName;
    @Column(columnDefinition = "date")
    private String birthDay;
    private Boolean gender;
    private String customerIdCard;
    private String phone;
    private String email;
    private String address;
    private Integer statusCustomer = 0;
    @ManyToOne()
    @JoinColumn(name = "type_customer_id",nullable = false)
    private TypeCustomer typeCustomer;

    public Customer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public Customer() {
    }

    public Customer(Integer customerId, String customerCode, Integer customerTypeId, String customerName,
                    String birthDay, Boolean gender, String customerIdCard, String phone, String email,
                    String address, Integer statusCustomer) {
        this.customerId = customerId;
        this.customerCode = customerCode;
        this.customerTypeId = customerTypeId;
        this.customerName = customerName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.customerIdCard = customerIdCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.statusCustomer = statusCustomer;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatusCustomer() {
        return statusCustomer;
    }

    public void setStatusCustomer(Integer statusCustomer) {
        this.statusCustomer = statusCustomer;
    }
}
