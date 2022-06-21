package codegym.service;

import codegym.model.Blog;
import codegym.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository repository;

    @Override
    public List<Blog> findAll() {
        return repository.findAllBlog();
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog.getTitle(), blog.getContent(), blog.getDateWrite());
    }

    @Override
    public void update(Blog blog) {
        repository.updateBlog(blog.getTitle(), blog.getContent(), blog.getDateWrite(), blog.getId());
    }

    @Override
    public void delete(Integer id) {
        repository.deleteBlog(id);
    }

    @Override
    public Blog findById(Integer id) {
        return repository.findByIdBlog(id);
    }


}
