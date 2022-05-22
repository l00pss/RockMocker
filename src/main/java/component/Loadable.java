package component;

import java.io.IOException;

public interface Loadable {
    void postConstr();

    void preDestroy();
}
