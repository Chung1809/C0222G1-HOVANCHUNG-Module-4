package com.example.demo.model.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity(name = "user")
public class User {
    @Id
    private String userName;
    private String password;
    @ManyToMany(mappedBy = "users")
    @JsonManagedReference
    private Set<Role> roleId;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(Set<Role> roleId) {
        this.roleId = roleId;
    }

    public Set<Role> getRoleId() {
        return roleId;
    }

    public void setRoleId(Set<Role> roleId) {
        this.roleId = roleId;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
