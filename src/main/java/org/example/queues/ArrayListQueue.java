package org.example.queues;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

public class ArrayListQueue<E> implements Queue<E> {

    List<E> queue;

    public ArrayListQueue() {
        queue = new ArrayList<>() {

            @Override
            public String toString() {
                Iterator<E> it = iterator();
                if (! it.hasNext())
                    return "";

                StringJoiner joiner = new StringJoiner(", "); // joins strings with a ", " in between each
                while(it.hasNext()) {
                    joiner.add(it.next().toString());
                }
                return joiner.toString();
            } //Override the toString() with your own implementation
        };
    }

    @Override
    public boolean offer(E e) {
        return this.queue.add(e);
    }

    @Override
    public E poll() {
        return this.queue.remove(0);
    }

    @Override
    public E peek() {
        return this.queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty(); // isEmpty() works better for performance than testing the array size
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder()
                .append("ArrayListQueue{")
                .append(queue)
                .append('}');
        return sb.toString();
    }
}
