package business.abstracts;

public interface Stateful<T> {
    void initState();
    void setState(T stateAsEntity);
}
