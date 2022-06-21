package codegym.repository;

import codegym.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

//@Transactional
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = "select * from customer" , nativeQuery = true)
    List<Customer> findAllCustomer();
}
