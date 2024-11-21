package oo;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }

    public void startSchool() {
        teachers.forEach(teacher -> System.out.println(teacher.introduce()));
        students.forEach(student -> System.out.println(student.introduce()));
    }
}
