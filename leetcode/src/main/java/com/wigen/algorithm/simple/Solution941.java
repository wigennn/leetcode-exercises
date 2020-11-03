package com.wigen.algorithm.simple;

/**
 * <p>
 *941. 有效的山脉数组
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 *
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 *
 * A.length >= 3
 * 在 0 < i < A.length - 1 条件下，存在 i 使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 *
 * 示例 1：
 *
 * 输入：[2,1]
 * 输出：false
 * 示例 2：
 *
 * 输入：[3,5,5]
 * 输出：false
 * 示例 3：
 *
 * 输入：[0,3,2,1]
 * 输出：true
 * </p>
 *
 * @author wangwq
 */
public class Solution941 {
    static class Solution {
        public boolean validMountainArray(int[] A) {
            if (A.length < 3) return false;

            int left = 0;
            int right = A.length - 1;

            while (A[left] < A[left + 1] && left < A.length - 2) left++;
            while (A[right] < A[right - 1] && right > 1) right--;

            System.out.println(left == right);
            return left == right;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
/*        int[] A = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = i;
        }*/

        int[] A = new int[3];
        A[0] = 3;
        A[1] = 5;
        A[2] = 5;
        solution.validMountainArray(A);
    }
}
