package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.entity.Role;
import by.airport.repository.RoleRepository;
import org.hibernate.Session;
import javax.persistence.Query;
import java.util.List;

public class RoleRepositoryImpl extends DefaultRepositoryImpl<Role> implements RoleRepository {
    @Override
    public Role findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Role.class, id);
    }

    @Override
    public List<Role> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Role");
        return query.getResultList();
    }
}
