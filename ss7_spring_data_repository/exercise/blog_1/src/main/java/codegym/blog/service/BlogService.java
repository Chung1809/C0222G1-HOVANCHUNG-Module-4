package codegym.blog.service;

import codegym.blog.model.Blog;
import codegym.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository repository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return repository.findAllBlog(pageable);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog.getTitle(), blog.getContent(), blog.getDateWrite(), blog.getCategory());
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


    @Override
    public Page<Blog> search(String title, Pageable pageable) {
        return repository.searchBlog(title, pageable);
    }


}
