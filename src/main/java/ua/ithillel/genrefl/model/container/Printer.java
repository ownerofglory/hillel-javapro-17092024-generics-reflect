package ua.ithillel.genrefl.model.container;

import java.util.Collection;

public class Printer {
    public <T> void print(T val) {
        System.out.println(val);
    }

    public <T> T getSample() {
        return null;
    }
}
