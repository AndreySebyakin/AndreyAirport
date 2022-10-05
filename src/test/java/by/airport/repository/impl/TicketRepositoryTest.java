package by.airport.repository.impl;

import by.airport.entity.Route;
import by.airport.entity.Ticket;
import by.airport.entity.Customer;
import by.airport.repository.RouteRepository;
import by.airport.repository.TicketRepository;
import by.airport.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TicketRepositoryTest {

    @Test
    void findById() {
        RouteRepository routeRepository = new RouteRepositoryImpl();
        Route route2 = routeRepository.findById(2);
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        Customer customer2 = customerRepository.findById(2);
        var expected = new Ticket(2, 454564, "2022-10-30", route2, customer2);

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
