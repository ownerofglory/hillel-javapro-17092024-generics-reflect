package ua.ithillel.genrefl.model.school;

import ua.ithillel.genrefl.model.person.Student;

import java.util.List;

public abstract class School {
    private String name;
    protected List<Student> students;

    public abstract boolean enroll(Student student);
}
