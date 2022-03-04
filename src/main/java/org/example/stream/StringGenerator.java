package org.example.stream;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

    private Random random = new Random();
    private char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        return "" + letters[random.nextInt(letters.length)]; // concat empty string to string ensures return is never null
    }
}
