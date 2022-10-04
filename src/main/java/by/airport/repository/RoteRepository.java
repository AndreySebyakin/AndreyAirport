package by.airport.repository;

import by.airport.entity.Rote;
import java.util.List;

public interface RoteRepository extends DefaultRepository<Rote> {

    Rote findById(Integer id);

    List<Rote> findAll();
}
