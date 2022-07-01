package component;

import java.io.IOException;

public interface Loadable {
    default void postConstr(){};

    default void preDestroy(){};
}
