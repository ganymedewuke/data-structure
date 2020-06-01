package com.ganymede.queue;

public class HelloQueue {
    public static void main(String[] args) {
        MyArrayQueue<Integer> queue = new MyArrayQueue<>();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
