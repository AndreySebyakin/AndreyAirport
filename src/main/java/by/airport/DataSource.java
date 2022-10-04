package by.airport;

import org.hibernate.Session;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataSource {

    private static DataSource dataSource = new DataSource();
    private static EntityManagerFactory entityManagerFactory;

    private DataSource() {
        entityManagerFactory = Persistence.createEntityManagerFactory("by.airport");
    }

    public static DataSource getInstance() {
        return dataSource;
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public Session getSession() {
        return getEntityManager().unwrap(Session.class);
    }
}
