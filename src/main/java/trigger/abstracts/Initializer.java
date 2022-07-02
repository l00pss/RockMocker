package trigger.abstracts;

import javax.swing.*;

@FunctionalInterface
public interface Initializer {
    void init();
    default <T> void init(T... args){};
}
