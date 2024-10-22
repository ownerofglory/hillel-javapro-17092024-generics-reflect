package ua.ithillel.genrefl.model.school;

import ua.ithillel.genrefl.model.person.Student;

public class MiddleSchool extends School {
    @Override
    public boolean enroll(Student student) {
        if (!students.contains(student) && student.getGpa() > 0) {
            students.add(student);
            return true;
        }

        return false;
    }
}
