package com.wigen.algorithm.medium;

import java.util.*;

/**
 * <p>
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * </p>
 *
 * @author wangwq
 */
public class Solution15 {
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            Set<List<Integer>> result = new HashSet<>();
            int len = nums.length;
            for (int i = 0; i < len - 2; i++) {
                if (nums[i] > 0) break;

                int m = i + 1;
                int n = len - 1;
                while (m < n) {
                    if (nums[m] + nums[n] == -nums[i]) {
                        List<Integer> item = new ArrayList<>(3);
                        item.add(nums[i]);
                        item.add(nums[m]);
                        item.add(nums[n]);
                        result.add(item);
                        m++;
                        n--;
                    } else if (nums[m] + nums[n] < -nums[i]) {
                        m++;
                    } else if (nums[m] + nums[n] > -nums[i]) {
                        n--;
                    }
                }
            }
            return new LinkedList<>(result);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,0,1,2,-1,-4};
        long start = System.currentTimeMillis();
        System.out.println(solution.threeSum(nums));
        System.out.println(System.currentTimeMillis() - start);
    }
}
