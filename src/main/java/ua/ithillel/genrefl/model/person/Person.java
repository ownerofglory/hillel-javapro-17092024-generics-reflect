package ua.ithillel.genrefl.model.person;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.ithillel.genrefl.model.anno.DataValue;

import java.time.LocalDateTime;

@DataValue(name = "Person information")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @DataValue(name = "FIRST_NAME")
    private String firstName;
    @DataValue(name = "LAST_NAME")
    private String lastName;
    @DataValue(name = "DATE_OF_BIRTH")
    private LocalDateTime dateOfBirth;

}
