package by.airport.repository;

import by.airport.entity.Passport;
import java.util.List;

public interface PassportRepository extends DefaultRepository<Passport> {

    Passport findById(Integer id);

    List<Passport> findAll();
}
