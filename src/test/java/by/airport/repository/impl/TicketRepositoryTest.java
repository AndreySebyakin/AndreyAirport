package by.airport.repository.impl;

import by.airport.entity.Rote;
import by.airport.entity.Ticket;
import by.airport.entity.Visitor;
import by.airport.repository.RoleRepository;
import by.airport.repository.RoteRepository;
import by.airport.repository.TicketRepository;
import by.airport.repository.VisitorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TicketRepositoryTest {

    @Test
    void findById() {
        RoteRepository roteRepository = new RoteRepositoryImpl();
        Rote rote2 = roteRepository.findById(2);
        VisitorRepository visitorRepository = new VisitorRepositoryImpl();
        Visitor visitor2 = visitorRepository.findById(2);
        var expected = new Ticket(2, 454564, "2022-10-30", rote2, visitor2);

        TicketRepository ticketRepository = new TicketRepositoryImpl();
        var actual = ticketRepository.findById(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        var expected = 18;

        TicketRepository ticketRepository = new TicketRepositoryImpl();
        List<Ticket> tickets = ticketRepository.findAll();
        var actual = tickets.size();

        Assertions.assertEquals(expected, actual);
    }
}
