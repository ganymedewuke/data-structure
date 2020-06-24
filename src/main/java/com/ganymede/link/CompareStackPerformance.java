package com.ganymede.link;

import com.ganymede.stack.ArrayStack;
import com.ganymede.stack.IStack;

import java.util.Random;

public class CompareStackPerformance {

    /**
     * 测试使用stack运行opCount个push和pop操作所需要的时间，单位：秒
     *
     * @param stack
     * @param opCount
     * @return
     */
    private static double testStack(IStack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }

        long endTime = System.nanoTime();

        //纳秒转换成秒
        return (endTime - startTime) / 1000_000_000.0;
    }

    public static void main(String[] args) {
        int opCount = 10_000_000;

        // 数组涉及扩容与考备数据，因此会比较耗时，但是算法复杂度是一致的
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("ArrayStack , time " + time1 + " s");


        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("LinkedListStack , time " + time2 + " s");

        //其实这个时间比较很复杂，因为 LinkedListStack中包含更多的new操作

    }
}
