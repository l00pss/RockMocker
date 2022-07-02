package service.abstracts;

public interface AbstractMemento<T> {
    T undo();
    T redo();

    void push(T obj);
}
