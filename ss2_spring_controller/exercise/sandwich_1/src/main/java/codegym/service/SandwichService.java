package codegym.service;

import org.springframework.stereotype.Service;

@Service
public class SandwichService implements ISandwichService {
    @Override
    public String[] sandwich(String[] sandwich) {
        String[] condimentList;
        if (sandwich != null) {
            condimentList = sandwich;
        } else {
            condimentList = new String[]{"Không có gì"};
        }
        return condimentList;
    }
}
