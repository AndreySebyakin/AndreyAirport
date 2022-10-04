package by.airport.repository;

public interface DefaultRepository<T> {

    void save(T entity);

    void delete(T entity);

}
