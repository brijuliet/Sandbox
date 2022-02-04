package org.example.inheritance.composition;

import java.util.*;

public class Composition {

    List<String> names;
    Set<String> values;
    Queue<String> items;
    String name;

    // default or no-arg constructor
    public Composition(List names, Set<String> values) {
        this.names = names; // aggregation
        this.values = values; // aggregation
        this.items = new LinkedList<>(); // composition
        this.name = "Ray"; // composition
    }
    // variables use variable shadowing and muse use this. to specify which variable
    // this. is used for clarity and readability on variables that don't require this.
}
