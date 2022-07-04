package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    void save(Blog blog);

    void update(Blog blog);

    void delete(Integer id);

    Optional<Blog> findById(Integer id);

    List<Blog> search(String title);


}
