package by.airport.repository;

import by.airport.entity.Route;
import java.util.List;

public interface RouteRepository extends DefaultRepository<Route> {

    Route findById(Integer id);

    List<Route> findAll();
}
