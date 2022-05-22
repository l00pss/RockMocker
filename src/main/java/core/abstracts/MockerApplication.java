package core.abstracts;

public interface MockerApplication {
    default void run(String... args){};
    void run();
}
