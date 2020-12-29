package com.ganymede.arrays;

/**
 * 转置矩阵
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * <p>
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 * 示例 2：
 * <p>
 * 输入：[[1,2,3],[4,5,6]]
 * 输出：[[1,4],[2,5],[3,6]]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 1000
 * 1 <= A[0].length <= 1000
 */
public class TransposeMatrix {
    public static int[][] transpose(int[][] a) {
        int r = a.length, c = a[0].length;
        int[][] ans = new int[c][r];
        for (int j = 0; j < r; j++) {
            for (int k = 0; k < c; k++) {
                ans[k][j] = a[j][k];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};
        printMatrix(matrix);
        System.out.println("转置矩阵：");
        int[][] res = transpose(matrix);
        printMatrix(res);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] a : matrix) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
