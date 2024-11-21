package oo;

public class Student extends Person {

    private Klass klass;

    public Student(Integer id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + String.format(" I am a student. I am in class %s.", klass.getNumber());
    }

    public boolean isIn(Klass klass) {
        if (klass == null || this.klass == null) {
            return false;
        }
        return this.klass.equals(klass);
    }

    public void join(Klass klass) {
        this.klass = klass;
    }
}
