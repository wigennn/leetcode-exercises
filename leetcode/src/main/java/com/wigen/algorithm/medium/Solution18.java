package com.wigen.algorithm.medium;

import java.util.*;

/**
 * <p>
 *
 * </p>
 *
 * @author wangwq
 */
public class Solution18 {

    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            Set<List<Integer>> result = new HashSet<>();

            int len = nums.length;

            for (int i = 0; i < len - 3; i++) {
                for (int j = i + 1; j < len - 2; j++) {
                    for (int k = j + 1; k < len - 1; k++) {
                        for (int m = k + 1; m < len; m++) {
                            if (nums[i] + nums[j] + nums[k] + nums[m] == target) {
                                result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));
                            }
                        }
                    }
                }
            }
            return new ArrayList<>(result);
        }
    }

    public static void main(String[] args) {
        byte[] bytes = new byte[365];
        Arrays.asList(bytes).stream().forEach(System.out::println);
    }
}
