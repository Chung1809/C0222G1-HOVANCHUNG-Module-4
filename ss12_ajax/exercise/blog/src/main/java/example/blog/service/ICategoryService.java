package example.blog.service;

import example.blog.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
