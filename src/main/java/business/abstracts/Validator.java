package business.abstracts;

@FunctionalInterface
public interface Validator<T> {
    boolean isValid(T object);
}
