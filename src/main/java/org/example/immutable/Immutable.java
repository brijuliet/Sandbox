package org.example.immutable;

public class Immutable {

    public static void main(String[] args) {
        String test = "test"; // string class is immutable
        test = test + "String";
        System.out.println(test);
    }
}
