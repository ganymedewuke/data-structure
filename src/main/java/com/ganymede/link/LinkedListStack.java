package com.ganymede.link;

import com.ganymede.stack.IStack;

public class LinkedListStack<E> implements IStack<E> {

    private MyLinkedList<E> list;

    public LinkedListStack() {
        list = new MyLinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack : top ");
        res.append(list);
        return res.toString();
    }
}
