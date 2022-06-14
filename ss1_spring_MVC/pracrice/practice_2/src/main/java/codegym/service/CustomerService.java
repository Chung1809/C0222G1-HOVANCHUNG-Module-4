package codegym.service;

import codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    private static List<Customer> customers;
    private static Integer autoIncreaseId = 0;

    static {
        customers.add( new Customer(autoIncreaseId++, "T", "t@codegym.vn", "Da Nang"));
        customers.add( new Customer(autoIncreaseId++, "Nhat", "nhat@codegym.vn", "Da Nang"));
        customers.add( new Customer(autoIncreaseId++, "Trang", "trang@codegym.vn", "Da Nang"));
        customers.add( new Customer(autoIncreaseId++, "Nguyen Binh Son", "son@codegym.vn", "Da Nang"));
        customers.add( new Customer(autoIncreaseId++, "Dang Xuan Hoa", "hoa.dang@codegym.vn", "Da Nang"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers);
    }

    @Override
    public void edit(Customer customer) {

    }
}
