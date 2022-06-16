package codegym.repository;

import codegym.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepository implements IEmailRepository {
    private static List<String> languageList = new ArrayList<>();
    private static List<String> pageSizeList = new ArrayList<>();
    private static List<Email> emailList = new ArrayList<>();

    static {
        emailList.add(new Email("English", "5", true, "Abc"));
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Chinese");
        languageList.add("Japanese");

        pageSizeList.add("5");
        pageSizeList.add("10");
        pageSizeList.add("15");
        pageSizeList.add("20");
        pageSizeList.add("25");
        pageSizeList.add("50");
        pageSizeList.add("100");

    }


    @Override
    public List<Email> findAll() {
        return emailList;
    }

    @Override
    public void save(Email email) {
        emailList.add(email);
    }

    @Override
    public List<String> language() {
        return languageList;
    }

    @Override
    public List<String> pageSize() {
        return pageSizeList;
    }
}
