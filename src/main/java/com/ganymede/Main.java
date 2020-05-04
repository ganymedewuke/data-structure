package com.ganymede;

import com.ganymede.arrays.Array02;

import java.util.Date;

/**
 * 数据结构与算法
 */
public class Main {
    public static void main(String[] args) {
        Array02 array = new Array02(20);

        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1,100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeElement(4);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);

    }
}
