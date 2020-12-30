package com.ganymede.arrays;

/**
 * 主要元素
 * 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,5,9,5,9,5,5,5]
 * 输出：5
 *  
 * <p>
 * 示例 2：
 * <p>
 * 输入：[3,2]
 * 输出：-1
 *  
 * <p>
 * 示例 3：
 * <p>
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 */
public class MajorityElementCalc {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 7, 5, 9, 5, 5, 5};
        int res = magjorityElement(nums);
        System.out.println(res);
    }

    public static int magjorityElement(int[] nums) {
        //投票算法
        int temp = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                temp = nums[i];
                count = 1;
            }
        }

        //验证是否满足要求
        int t = nums.length / 2 + 1;
        count = 0;
        for (int num : nums) {
            if (num == temp)
                count++;
            if (count == t)
                return temp;
        }
        return -1;
    }

}
