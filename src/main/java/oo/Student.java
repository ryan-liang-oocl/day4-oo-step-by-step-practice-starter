package oo;

public class Student extends Person {

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(Integer id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        if (klass != null && this.equals(klass.getLeader())) {
            return String.format("%s I am a student. I am the leader of class %s.", super.introduce(), klass.getNumber());
        }
        return String.format("%s I am a student. I am in class %s.", super.introduce(), klass.getNumber());
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
