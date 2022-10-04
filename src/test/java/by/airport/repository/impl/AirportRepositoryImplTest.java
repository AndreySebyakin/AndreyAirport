package by.airport.repository.impl;

import by.airport.entity.Airport;
import by.airport.entity.City;
import by.airport.repository.AirportRepository;
import by.airport.repository.CityRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class AirportRepositoryImplTest {

    @Test
    void findById() {
        CityRepository cityRepository = new CityRepositoryImpl();
        City city = cityRepository.findById(1);
        var expected = new Airport(2, "MOW", "Russia", city);

        AirportRepository airportRepository = new AirportRepositoryImpl();
        var actual = airportRepository.findById(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        var expected = 11;

        AirportRepository airportRepository = new AirportRepositoryImpl();
        List<Airport> airports = airportRepository.findAll();
        var actual = airports.size();

        Assertions.assertEquals(expected, actual);
    }

}
