package com.ganymede.arrays;

/**
 * Array Basic
 */
public class Array01 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] scores = new int[]{100, 99, 66};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        for (int score : scores)
            System.out.println(score);

        scores[0] = 98;

        for (int score : scores)
            System.out.println(score);

    }
}
