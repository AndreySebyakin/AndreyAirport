package by.airport.repository;

import by.airport.entity.Airport;
import java.util.List;

public interface AirportRepository extends DefaultRepository<Airport> {

    Airport findById(Integer id);

    List<Airport> findAll();
}
