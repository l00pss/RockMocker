package component;

public interface Stateful<T> {
    void initState();
    void setState(T stateAsEntity);
}
