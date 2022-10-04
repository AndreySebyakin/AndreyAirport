package by.airport.repository.impl;

import by.airport.entity.Role;
import by.airport.repository.RoleRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class RoleRepositoryImplTest {

    @Test
    void findById() {
        var expected = new Role(1, "passenger");

        RoleRepository roleRepository = new RoleRepositoryImpl();
        var actual = roleRepository.findById(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAll() {
        var expected = 3;

        RoleRepository roleRepository = new RoleRepositoryImpl();
        List<Role> roles = roleRepository.findAll();
        var actual = roles.size();

        Assertions.assertEquals(expected, actual);
    }
}
