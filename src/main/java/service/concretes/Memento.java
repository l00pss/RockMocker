package service.concretes;

import service.abstracts.AbstractMemento;

import java.util.*;

public class Memento<T> implements AbstractMemento<T>  {
    private final Queue<T> memento = new PriorityQueue<>();

    private final Queue<T> cache = new PriorityQueue<>();


    public Memento(){
    }

    public Memento(T object){
        this.memento.add(object);
    }

    /**
     * <--
     * @return
     */
    @Override
    public T undo() {
        T obj = this.memento.poll();
        if (Objects.nonNull(obj))this.cache.add(obj);
        return obj;
    }

    /**
     * -->
     * @return
     */
    @Override
    public T redo() {
        T obj = this.cache.poll();
        if (Objects.nonNull(obj))this.memento.add(obj);
        return obj;
    }

    @Override
    public void push(T obj) {
        if (!this.cache.isEmpty())
            this.cache.clear();
        this.memento.add(obj);
    }

    public void preDestroy() {

    }


}
