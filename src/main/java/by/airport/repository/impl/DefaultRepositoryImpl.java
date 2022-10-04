package by.airport.repository.impl;

import by.airport.DataSource;
import by.airport.repository.DefaultRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.EntityManager;


public class DefaultRepositoryImpl<T> implements DefaultRepository<T> {

    @Override
    public void save(T entity) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
    }

    @Override
    public void delete(T entity) {
        EntityManager entityManager = DataSource.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
        entityManager.getTransaction().commit();
    }

}
