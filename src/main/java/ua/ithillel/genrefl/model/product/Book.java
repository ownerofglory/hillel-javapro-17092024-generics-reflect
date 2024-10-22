package ua.ithillel.genrefl.model.product;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String id;
    private String name;
    private String description;
    private String author;
    private String publisher;
    private String category;
    private String type;
}
