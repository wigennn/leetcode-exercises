package com.wigen.algorithm.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 *349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 *
 *
 * 说明：
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * </p>
 *
 * 6ms
 * @author wangwq
 */
public class Solution394 {

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums1.length; i++) {
                set.add(nums1[i]);
            }

            Set<Integer> result = new HashSet<>();
            for (int j = 0; j < nums2.length; j++) {
                if (set.contains(nums2[j])) {
                    result.add(nums2[j]);
                }
            }
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {

    }
}
