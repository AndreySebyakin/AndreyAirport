package by.airport.repository;

import by.airport.entity.Ticket;
import java.util.List;

public interface TicketRepository extends DefaultRepository<Ticket> {

    Ticket findById(Integer id);

    List<Ticket> findAll();
}
