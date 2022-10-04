package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.City;
import by.airport.repository.CityRepository;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class CityRepositoryImpl extends DefaultRepositoryImpl<City> implements CityRepository {

    @Override
    public City findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(City.class, id);
    }

    public List<City> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from City");
        return query.getResultList();
    }
}
