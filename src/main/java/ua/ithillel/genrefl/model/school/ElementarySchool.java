package ua.ithillel.genrefl.model.school;

import ua.ithillel.genrefl.model.person.Student;

public class ElementarySchool extends School {
    @Override
    public boolean enroll(Student student) {
        if (students.contains(student)) {
            return false;
        }

        students.add(student);
        return true;
    }
}
