package behavioural.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    boolean hasPrevious();
    T previous();
}
