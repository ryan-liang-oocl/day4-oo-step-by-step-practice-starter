package oo;

public class Student extends Person {

    public Student(Integer id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a student.";
    }
}
