package by.airport.repository.impl;

import by.airport.entity.AirCompany;
import by.airport.repository.AirCompanyRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class AirCompanyRepositoryImplTest {

    @Test
    void findById() {
        var expected = new AirCompany(3, "LOT");

        AirCompanyRepository airCompanyRepository = new AirCompanyRepositoryImpl();
        var actual = airCompanyRepository.findById(3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        var expected = 4; //TODO заменить на 4

        AirCompanyRepository airCompanyRepository = new AirCompanyRepositoryImpl();
        List<AirCompany> airCompanies = airCompanyRepository.findAll();
        var actual = airCompanies.size();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void save() {
        var expected = new AirCompany(5, "J7"); //TODO заменить на 5

        AirCompanyRepository airCompanyRepository = new AirCompanyRepositoryImpl();
        AirCompany airCompanyAdd = AirCompany.builder()
                .airCompanyName("J7")
                .build();
        airCompanyRepository.save(airCompanyAdd);
        var actual = airCompanyRepository.findById(5);   //TODO заменить на 5
    }
}

