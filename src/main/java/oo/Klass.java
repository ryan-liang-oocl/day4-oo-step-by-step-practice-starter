package oo;

import java.util.Objects;

public class Klass {
    private int number;

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
            System.out.println("It is not one of us.");
            return;
        }
        this.leader = student;
    }

    public boolean isLeader(Student student) {
        return leader != null && leader.equals(student);
    }
}
