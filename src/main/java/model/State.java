package model;


import component.Stateful;
import utility.Initializer;

import java.util.Objects;

public class State<T> implements Stateful<T> {

    private T stateAsEntity;
    private Initializer initializer;

    public State(Initializer initializer,T stateAsEntity){
        this.initializer = initializer;
        this.stateAsEntity = stateAsEntity;
    }

    @Override
    public void initState() {
        this.initializer.init();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void setState(Object stateAsEntity ) {
        if (Objects.nonNull(stateAsEntity))
            this.stateAsEntity = (T) stateAsEntity;
        initState();
    }
}
