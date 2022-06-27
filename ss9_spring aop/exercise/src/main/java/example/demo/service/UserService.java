package example.demo.service;

import example.demo.model.User;
import example.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository repository;


    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public User findByCode(String code) {
        return repository.findByCodeContaining(code);
    }

    @Override
    public void delete(User user) {
      repository.delete(user);
    }
}
