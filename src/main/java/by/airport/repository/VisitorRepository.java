package by.airport.repository;

import by.airport.entity.Visitor;
import java.util.List;

public interface VisitorRepository extends DefaultRepository<Visitor> {

    Visitor findById(Integer id);

    List<Visitor> findAll();
}
