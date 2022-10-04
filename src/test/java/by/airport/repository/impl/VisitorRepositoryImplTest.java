package by.airport.repository.impl;

import by.airport.entity.Passport;
import by.airport.entity.Role;
import by.airport.entity.Visitor;
import by.airport.repository.PassportRepository;
import by.airport.repository.RoleRepository;
import by.airport.repository.VisitorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class VisitorRepositoryImplTest {

    @Test
    void findById() {
        PassportRepository passportRepository = new PassportRepositoryImpl();
        Passport passport2 = passportRepository.findById(2);
        RoleRepository roleRepository = new RoleRepositoryImpl();
        Role role1 = roleRepository.findById(1);
        var expected = new Visitor(2, "Sergey", "Novik", passport2, role1);

        VisitorRepository visitorRepository = new VisitorRepositoryImpl();
        var actual = visitorRepository.findById(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        var expected = 9;

        VisitorRepository visitorRepository = new VisitorRepositoryImpl();
        List<Visitor> visitors = visitorRepository.findAll();
        var actual = visitors.size();

        Assertions.assertEquals(expected, actual);
    }
}
