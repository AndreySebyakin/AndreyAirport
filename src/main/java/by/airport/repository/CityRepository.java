package by.airport.repository;

import by.airport.entity.City;
import java.util.List;

public interface CityRepository extends DefaultRepository<City>{

    City findById(Integer id);

    List<City> findAll();
}
