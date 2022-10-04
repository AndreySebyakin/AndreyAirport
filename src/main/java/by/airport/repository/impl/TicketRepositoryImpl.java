package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.Ticket;
import by.airport.repository.TicketRepository;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class TicketRepositoryImpl extends DefaultRepositoryImpl<Ticket> implements TicketRepository {
    @Override
    public Ticket findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Ticket.class, id);
    }

    @Override
    public List<Ticket> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Ticket");
        return query.getResultList();
    }
}
