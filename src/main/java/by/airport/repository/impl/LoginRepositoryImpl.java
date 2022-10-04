package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.Login;
import by.airport.repository.LoginRepository;
import org.hibernate.Session;
import javax.persistence.Query;
import java.util.List;

public class LoginRepositoryImpl extends DefaultRepositoryImpl<Login> implements LoginRepository {
    @Override
    public Login findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Login.class, id);
    }

    @Override
    public List<Login> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Login");
        return query.getResultList();
    }
}
