package ua.ithillel.genrefl.importer;

import java.io.InputStream;

public interface DataImporter {
    <T> void importData(InputStream inputStream, Class<T[]> clazz);
}