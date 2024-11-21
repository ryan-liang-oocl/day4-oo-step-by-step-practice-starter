package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    public static final String NOT_BELONG_MSG = "It is not one of us.";
    private int number;

    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public static final String TEACHER_NOTIFY_MSG = "I am %s, teacher of Class %d. I know %s become Leader.";
    public static final String STUDENT_NOTIFY_MSG = "I am %s, student of Class %d. I know %s become Leader.";

    private Student leader;

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object otherKlass) {
        if (this == otherKlass) return true;
        if (otherKlass == null || getClass() != otherKlass.getClass()) return false;
        Klass klass = (Klass) otherKlass;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public void assignLeader(Student student) {
        Klass klass = student.getKlass();
        if (klass == null || klass.getNumber() != number) {
            System.out.println(NOT_BELONG_MSG);
            return;
        }
        this.leader = student;
        notifyMembers(student);
    }

    public boolean isLeader(Student student) {
        return leader != null && leader.equals(student);
    }

    public void attach(Person person) {
        if (person instanceof Student) {
            students.add((Student) person);
        } else if (person instanceof Teacher) {
            teachers.add((Teacher) person);
        }
    }

    private void notifyMembers(Student student) {
        teachers.stream()
                .map(teacher -> String.format(TEACHER_NOTIFY_MSG, teacher.getName(), number, student.getName()))
                .forEach(System.out::println);

        students.stream()
                .map(s -> String.format(STUDENT_NOTIFY_MSG, s.getName(), number, student.getName()))
                .forEach(System.out::println);
    }


}
