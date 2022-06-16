package codegym.repository;

import codegym.model.Email;

import java.util.List;

public interface IEmailRepository {
    List<Email> findAll();

    void save(Email email);

    List<String> language();

    List<String> pageSize();
}
