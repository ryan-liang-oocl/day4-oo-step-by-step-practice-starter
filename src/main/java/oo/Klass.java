package oo;

import java.util.Objects;

public class Klass {
    private int number;

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
}
