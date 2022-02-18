package org.example.generics;

public class Box<T extends Crate> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
