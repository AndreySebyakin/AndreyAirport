package by.airport.repository.impl;

import by.airport.entity.Role;
import by.airport.entity.Customer;
import by.airport.repository.RoleRepository;
import by.airport.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class CustomerRepositoryImplTest {

    @Test
    void findById() {
        RoleRepository roleRepository = new RoleRepositoryImpl();
        Role role1 = roleRepository.findById(1);
        var expected = new Customer(2, "Sergey", "Novik", "EC5456262", role1);

        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        var actual = customerRepository.findById(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        var expected = 9;

        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        List<Customer> customers = customerRepository.findAll();
        var actual = customers.size();

        Assertions.assertEquals(expected, actual);
    }
}
