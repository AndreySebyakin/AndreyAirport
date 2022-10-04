package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.Passport;
import by.airport.repository.PassportRepository;
import org.hibernate.Session;
import javax.persistence.Query;
import java.util.List;

public class PassportRepositoryImpl extends DefaultRepositoryImpl<Passport> implements PassportRepository {
    @Override
    public Passport findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Passport.class, id);
    }

    @Override
    public List<Passport> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Passport");
        return query.getResultList();
    }
}
