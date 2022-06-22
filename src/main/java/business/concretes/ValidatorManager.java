package business.concretes;

import business.abstracts.Validator;
import business.abstracts.ValidatorService;
import model.State;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ValidatorManager<T> implements ValidatorService<T> {
    private final List<State<T>> states;
    private  List<Consumer<State<T>>> consumers;
    private Consumer<State<T>> consumer;



    public ValidatorManager(List<State<T>> states, List<Consumer<State<T>>> validators){
        this.states = states;
        this.consumers = validators;
    }

    public ValidatorManager(List<State<T>> states, Consumer<State<T>> validator){
        this.states = states;
        this.consumer = validator;
    }




    @Override
    public void valid() {
        //Stream.of(states).forEach(e);
    }
}
