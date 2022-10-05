package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.Customer;
import by.airport.repository.CustomerRepository;
import org.hibernate.Session;
import javax.persistence.Query;
import java.util.List;

public class CustomerRepositoryImpl extends DefaultRepositoryImpl<Customer> implements CustomerRepository {
    @Override
    public Customer findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Customer.class, id);
    }

    @Override
    public List<Customer> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Customer");
        return query.getResultList();
    }
}
