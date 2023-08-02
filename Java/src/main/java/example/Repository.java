package example;

public interface Repository<T> {
    void save(T object);
    void find();
}
