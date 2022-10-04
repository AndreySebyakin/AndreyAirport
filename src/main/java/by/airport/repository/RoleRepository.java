package by.airport.repository;

import by.airport.entity.Role;
import java.util.List;

public interface RoleRepository extends DefaultRepository<Role>{

    Role findById(Integer id);

    List<Role> findAll();
}
