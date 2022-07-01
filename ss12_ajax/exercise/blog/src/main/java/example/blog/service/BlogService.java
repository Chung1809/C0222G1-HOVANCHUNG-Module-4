package example.blog.service;

import example.blog.model.Blog;
import example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository repository;

    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteBlog(id);
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<Blog> search(String title) {
        return repository.findByTitleContaining(title);
    }


}
