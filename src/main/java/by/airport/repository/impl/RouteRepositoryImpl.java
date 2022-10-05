package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.Route;
import by.airport.repository.RouteRepository;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class RouteRepositoryImpl extends DefaultRepositoryImpl<Route> implements RouteRepository {
    @Override
    public Route findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Route.class, id);
    }

    @Override
    public List<Route> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Route");
        return query.getResultList();
    }
}
