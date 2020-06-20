package com.ganymede.queue;

import com.ganymede.link.LinkedListQueue;

import java.util.Random;

public class Main {

    /**
     * 测试使用queue运行opCount个enqueue和dequeue操作所需要的时间，单位：纳秒
     *
     * @param q
     * @param opCount
     * @return
     */
    private static double testQueue(IQueue<Integer> q, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();

        //入队
        for (int i = 0; i < opCount; i++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));

        //出队
        for (int i = 0; i < opCount; i++)
            q.dequeue();

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000_000_000.0;
    }

    /**
     * 100万的测试对比
     * ArrayQueue,time: 417.890205362 s
     * LoopQueue,time: 0.072618518 s
     *
     * @param args
     */
    public static void main(String[] args) {
        int opCount = 10_0000;

        MyArrayQueue arrayQueue = new MyArrayQueue();


        //数组队列，由于需要不断地移动，是 O(n)
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println("ArrayQueue,time: " + time1 + " s");

        //循环队列用与链表都是O(1)的复杂度
        LoopQueue loopQueue = new LoopQueue();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("LoopQueue,time: " + time2 + " s");

        LinkedListQueue linkedListQueue = new LinkedListQueue();
        double time3 = testQueue(linkedListQueue, opCount);
        System.out.println("linkedListQueue,time: " + time3 + " s");


    }
}
