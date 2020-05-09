package com.ganymede;

import com.ganymede.arrays.Array;
import com.ganymede.arrays.Student;

/**
 * 数据结构与算法
 */
public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();

        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeElement(4);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);

        System.out.println("------------------------------------------");

        Array<Student> stuArr = new Array<>();
        stuArr.addLast(new Student("Alice", 100));
        stuArr.addLast(new Student("Bob", 69));
        stuArr.addLast(new Student("Charlie", 88));

        System.out.println(stuArr);


    }
}
