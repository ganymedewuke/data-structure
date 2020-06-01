package com.ganymede.queue;

public interface IQueue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();
}
