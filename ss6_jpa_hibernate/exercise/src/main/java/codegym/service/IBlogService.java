package codegym.service;

import codegym.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void update(Blog blog);

    void delete(Integer id);

    Blog findById(Integer id);


}
