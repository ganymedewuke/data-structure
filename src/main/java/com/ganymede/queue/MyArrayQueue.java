package com.ganymede.queue;

import com.ganymede.arrays.Array;

public class MyArrayQueue<E> implements IQueue<E> {

    private Array<E> array;

    public MyArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public MyArrayQueue() {
        array = new Array<>();
    }

    /**
     * O(1)
     *
     * @return
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * 数组实现的队列，出队的的消耗比较大
     * O(1)
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    /**
     * O(1) 均摊
     *
     * @param e
     */
    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    /**
     * O(n)
     *
     * @return
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /**
     * O(1)
     *
     * @return
     */
    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}
