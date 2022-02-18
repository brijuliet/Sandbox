package org.example.generics;

public class Crate {

    // Not actually cloning anything
    public <T> T clone(T t) {
        System.out.println(t.getClass().getName());
        return t;
    }

}
