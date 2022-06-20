package codegym.repository;

import codegym.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;
@Repository
public class CustomerRepository implements ICustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = BaseRepository.entityManager.createQuery("select c from customer c",Customer.class).getResultList();
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        EntityTransaction entityTransaction =BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(customer);
        entityTransaction.commit();
    }
}
