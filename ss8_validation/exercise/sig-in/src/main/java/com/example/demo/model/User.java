package com.example.demo.model;

import com.example.demo.ultis.EmailConstraint;
import com.example.demo.ultis.FirstNameConstraint;
import com.example.demo.ultis.LastNameConstraint;
import com.example.demo.ultis.PhoneNumberConstraint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @FirstNameConstraint
    private String firstName;
    @LastNameConstraint
    private String lastName;
    @Min(value = 18,message = "Tuổi lớn hơn hoặc bằng 18 tuổi")
    private Integer old;
    @PhoneNumberConstraint
    private String phone;
    @EmailConstraint
    private String email;

    public User() {
    }

    public User(Integer id, String firstName, String lastName,
                @Min(value = 18, message = "Tuổi lớn hơn hoặc bằng 18 tuổi") Integer old, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.old = old;
        this.phone = phone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
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
}
