package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.Visitor;
import by.airport.repository.VisitorRepository;
import org.hibernate.Session;
import javax.persistence.Query;
import java.util.List;

public class VisitorRepositoryImpl extends DefaultRepositoryImpl<Visitor> implements VisitorRepository {
    @Override
    public Visitor findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Visitor.class, id);
    }

    @Override
    public List<Visitor> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Visitor");
        return query.getResultList();
    }
}
