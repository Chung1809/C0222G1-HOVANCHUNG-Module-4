package codegym.blog.service;

import codegym.blog.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
