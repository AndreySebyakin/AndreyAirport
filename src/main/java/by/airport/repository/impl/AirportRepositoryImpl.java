package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.AirCompany;
import by.airport.entity.Airport;
import by.airport.repository.AirportRepository;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class AirportRepositoryImpl extends DefaultRepositoryImpl<Airport> implements AirportRepository {
    @Override
    public Airport findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Airport.class, id);
    }

    @Override
    public List<Airport> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Airport");
        return query.getResultList();
    }
}
