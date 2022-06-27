package example.demo.service;

import example.demo.model.Book;
import example.demo.model.User;
import example.demo.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository repository;
    @Override
    public Page<Book> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void save(Book book) {
       repository.save(book);
    }

    @Override
    public Book findById(Integer id) {
        return repository.findById(id).get();
    }
}
