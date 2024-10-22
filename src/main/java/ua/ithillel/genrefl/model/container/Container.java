package ua.ithillel.genrefl.model.container;

// Generic
public class Container<T> {
    private final T value; //
    private T[] arr;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
