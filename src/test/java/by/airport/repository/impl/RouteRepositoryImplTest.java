package by.airport.repository.impl;

import by.airport.entity.AirCompany;
import by.airport.entity.Airport;
import by.airport.entity.Route;
import by.airport.repository.AirCompanyRepository;
import by.airport.repository.AirportRepository;
import by.airport.repository.RouteRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class RouteRepositoryImplTest {

    @Test
    void findById() {
        AirportRepository airportRepository = new AirportRepositoryImpl();
        Airport airport2 = airportRepository.findById(2);
        Airport airport5 = airportRepository.findById(5);
        AirCompanyRepository airCompanyRepository = new AirCompanyRepositoryImpl();
        AirCompany airCompany2 = airCompanyRepository.findById(2);
        var expected = new Route(3, airport2, airport5, 500, airCompany2);

        RouteRepository routeRepository = new RouteRepositoryImpl();
        var actual = routeRepository.findById(3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        var expected = 13;

        RouteRepository routeRepository = new RouteRepositoryImpl();
        List<Route> routes = routeRepository.findAll();
        var actual = routes.size();

        Assertions.assertEquals(expected, actual);
    }
}
