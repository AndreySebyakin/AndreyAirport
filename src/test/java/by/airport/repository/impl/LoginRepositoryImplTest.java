package by.airport.repository.impl;

import by.airport.entity.Login;
import by.airport.entity.Visitor;
import by.airport.repository.LoginRepository;
import by.airport.repository.VisitorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class LoginRepositoryImplTest {

    @Test
    void findById() {
        VisitorRepository visitorRepository = new VisitorRepositoryImpl();
        Visitor visitor2 = visitorRepository.findById(2);
        var expected = new Login(2, "SergeyD", "gnbrgn", visitor2);

        LoginRepository loginRepository = new LoginRepositoryImpl();
        var actual = loginRepository.findById(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        var expected = 9;

        LoginRepository loginRepository = new LoginRepositoryImpl();
        List<Login> logins = loginRepository.findAll();
        var actual = logins.size();

        Assertions.assertEquals(expected, actual);
    }
}
