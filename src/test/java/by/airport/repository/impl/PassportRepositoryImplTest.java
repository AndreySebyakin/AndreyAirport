package by.airport.repository.impl;

import by.airport.entity.Passport;
import by.airport.repository.PassportRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class PassportRepositoryImplTest {

    @Test
    void findById() {
        var expected = new Passport(1, "AB6464644");

        PassportRepository passportRepository = new PassportRepositoryImpl();
        var actual = passportRepository.findById(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        var expected = 9;

        PassportRepository passportRepository = new PassportRepositoryImpl();
        List<Passport> passports = passportRepository.findAll();
        var actual = passports.size();

        Assertions.assertEquals(expected, actual);
    }
}
