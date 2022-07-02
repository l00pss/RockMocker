package model;


import trigger.abstracts.Stateful;
import trigger.abstracts.Initializer;

import java.util.Objects;

public class State<T> implements Stateful<T> {

    private T stateAsEntity;
    private final Initializer initializer;

    public State(Initializer initializer,T stateAsEntity){
        this.initializer = initializer;
        this.stateAsEntity = stateAsEntity;
    }

    @Override
    public void initState() {
        this.initializer.init();
    }

    @Override
    public void setState(T stateOfEntity ) {
        if (Objects.nonNull(stateAsEntity))
            this.initState();
    }
}
