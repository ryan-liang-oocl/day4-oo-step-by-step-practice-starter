package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private List<Klass> klassList;

    public Teacher(Integer id, String name, int age) {
        super(id, name, age);
        klassList = new ArrayList<>();
    }

    @Override
    public String introduce() {
        String classes = "Class " + klassList.stream()
                .map(klass -> String.valueOf(klass.getNumber()))
                .collect(Collectors.joining(", "));
        return String.format("%s I am a teacher. I teach %s.", super.introduce(), classes);
    }

    public void assignTo(Klass klass) {
        klassList.add(klass);
    }


    public boolean belongsTo(Klass klass) {
        return klassList.contains(klass);
    }

    public boolean isTeaching(Student student) {
        Klass klass = student.getKlass();
        return klass != null && klassList.contains(klass);
    }
}
