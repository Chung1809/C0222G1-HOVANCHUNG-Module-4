package example.demo.service;

import example.demo.model.User;

import java.util.List;

public interface IUserService {
    void save(User user);

    User findByCode(String code);

    void delete(User user);

}
