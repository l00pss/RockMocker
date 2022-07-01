package business.abstracts;

import java.util.function.Consumer;
import java.util.function.Function;

public interface Command<P,R,T> {

    default void execute(){};

    default  R execute(P object){return null;};

    default R andThen(Consumer<T> consumer){return null;};

}
