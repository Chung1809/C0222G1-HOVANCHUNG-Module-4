package com.example.demo.repository;

import com.example.demo.model.UserStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserStudent,Integer> {
}
