package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.AirCompany;
import by.airport.entity.Rote;
import by.airport.repository.RoteRepository;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class RoteRepositoryImpl extends DefaultRepositoryImpl<Rote> implements RoteRepository {
    @Override
    public Rote findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Rote.class, id);
    }

    @Override
    public List<Rote> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Rote");
        return query.getResultList();
    }
}
