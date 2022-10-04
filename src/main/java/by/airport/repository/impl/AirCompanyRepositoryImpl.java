package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.AirCompany;
import by.airport.entity.City;
import by.airport.repository.AirCompanyRepository;
import org.hibernate.Session;
import javax.persistence.Query;
import java.util.List;

public class AirCompanyRepositoryImpl extends DefaultRepositoryImpl<AirCompany> implements AirCompanyRepository {

    @Override
    public AirCompany findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(AirCompany.class, id);
    }

    public List<AirCompany> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from AirCompany");
        return query.getResultList();
    }
}
