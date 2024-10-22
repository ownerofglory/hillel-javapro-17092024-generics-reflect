package ua.ithillel.genrefl.model.container;

public class NumberContainer<T extends Number> {
    private final T value;

    public NumberContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
