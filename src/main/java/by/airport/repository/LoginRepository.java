package by.airport.repository;

import by.airport.entity.Login;
import java.util.List;

public interface LoginRepository extends DefaultRepository<Login>{

    Login findById(Integer id);

    List<Login> findAll();
}
