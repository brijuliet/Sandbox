package org.example.exceptions;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        // cannot have a try block by itself

        // try-catch (control flow structure, happy and unhappy path)
        try {
            // do something
        } catch (Exception e) {
            // handle exception
            e.printStackTrace(); //generally not used outside of school
        }
        // continue doing something

        // try-catch-catch-(catch)
        try {

        } catch (NullPointerException npe) { // handles specific exception

        } catch (Exception e) { // handles all other exceptions
            // must follow hierarchy of exceptions with the most specific at the top
        }

        // try-catch-finally
        Scanner scanner = new Scanner(System.in);
        try {
            scanner.next();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // always executed
            scanner.close();
        }

        // try-finally
        try {

        } finally {

        }

        // try-multi-catch
        try {

        } catch (ArithmeticException | NullPointerException e) { // exceptions must be disjoint
            // if either exception is thrown, they will be handled the same way
            e.printStackTrace();
        }

        // single pipe "|" is a Java bitwise OR operator ( || is algebraic OR operator)

        // try-with-resources
        try (Scanner scanner2 = new Scanner(System.in);
             Scanner scanner3 = new Scanner(System.in);) { // logically equivalent to try-finally

            //syntactic sugar: some structure in a language that does the same thing as some other, but looks cleaner
        } catch (Exception e) { //can have catch block, but not required

        }

    }
}
