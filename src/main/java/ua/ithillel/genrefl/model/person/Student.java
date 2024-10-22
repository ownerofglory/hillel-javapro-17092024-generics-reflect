package ua.ithillel.genrefl.model.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Student extends Person {
    private double gpa;
}
