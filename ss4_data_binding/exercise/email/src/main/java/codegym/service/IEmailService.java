package codegym.service;

import codegym.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> findAll();

    void save(Email email);

    List<String> language();

    List<String> pageSize();
}
