package by.airport.repository.impl;
import by.airport.entity.City;
import by.airport.repository.CityRepository;
import org.junit.jupiter.api.*;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CityRepositoryImplTest {

    @Order(1)
    @Test
    void findById() {
        var expected = new City(2, "Minsk");

        CityRepository cityRepository = new CityRepositoryImpl();
        var actual = cityRepository.findById(2);

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)
    @Test
    void findAll() {
        var expected = 9; //TODO заменить на 9

        CityRepository cityRepository = new CityRepositoryImpl();
        List<City> cities = cityRepository.findAll();
        var actual = cities.size();

        Assertions.assertEquals(expected, actual);
    }

    @Order(3)
    @Test
    void save() {
        var expected = new City(10, "Vladivostok"); //TODO заменить на 10

        CityRepository cityRepository = new CityRepositoryImpl();
        City insertCity = City.builder()
                .cityName("Vladivostok")
                .build();
        cityRepository.save(insertCity);
        var actual = cityRepository.findById(10); //TODO заменить на 10

        Assertions.assertEquals(expected, actual);
        cityRepository.delete(actual);
    }

    @Order(4)
    @Test
    void delete() {
        CityRepository cityRepository = new CityRepositoryImpl();
        City testCity = City.builder()
                .cityName("Slonim")
                .build();
        cityRepository.save(testCity);
        testCity = cityRepository.findById(11); //TODO заменить на 11
        cityRepository.delete(testCity);

        var actual = cityRepository.findById(11); //TODO заменить на 11

        Assertions.assertNull(actual);
    }
}
