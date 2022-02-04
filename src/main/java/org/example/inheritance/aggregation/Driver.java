package org.example.inheritance.aggregation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Driver {

    public static void main(String[] args) {

        Aggregation agg = new Aggregation(new ArrayList<>(),new HashSet<>(), new LinkedList<>()); //anonymous instantiation

    }
}
