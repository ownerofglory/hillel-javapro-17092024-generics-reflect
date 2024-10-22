package ua.ithillel.genrefl.model.address;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {
    private String street;
    private String number;
    private String city;
    private String state;
    private String zip;
    private String country;
}
