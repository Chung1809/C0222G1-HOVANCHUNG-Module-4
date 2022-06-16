package codegym.service;

import codegym.model.Email;
import codegym.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService implements IEmailService {
    @Autowired
    private IEmailRepository emailRepository;

    @Override
    public List<Email> findAll() {
        return emailRepository.findAll();
    }

    @Override
    public void save(Email email) {
        emailRepository.save(email);
    }

    @Override
    public List<String> language() {
        return emailRepository.language();
    }

    @Override
    public List<String> pageSize() {
        return emailRepository.pageSize();
    }
}
