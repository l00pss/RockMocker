package component;

public interface Stateful {
    default void initState(){};
    default void setState(){};
}
