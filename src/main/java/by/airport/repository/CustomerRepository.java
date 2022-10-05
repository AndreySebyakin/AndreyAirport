package by.airport.repository;

import by.airport.entity.Customer;
import java.util.List;

public interface CustomerRepository extends DefaultRepository<Customer> {

    Customer findById(Integer id);

    List<Customer> findAll();
}
