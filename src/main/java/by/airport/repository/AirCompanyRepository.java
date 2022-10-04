package by.airport.repository;

import by.airport.entity.AirCompany;
import java.util.List;

public interface AirCompanyRepository extends DefaultRepository<AirCompany> {

    AirCompany findById(Integer id);

    List<AirCompany> findAll();
}
