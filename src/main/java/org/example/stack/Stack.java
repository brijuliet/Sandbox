package org.example.stack;

public interface Stack<E extends Comparable> {

    // FIXME finish class

    boolean empty();
    E peek();
    E pop();
    void push(E element);
    int search(E e);
}
