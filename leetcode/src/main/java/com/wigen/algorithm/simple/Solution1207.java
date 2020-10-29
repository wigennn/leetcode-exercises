package com.wigen.algorithm.simple;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * <p>
 * 1207. 独一无二的出现次数
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * <p>
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [1,2,2,1,1,3]
 * 输出：true
 * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
 * 示例 2：
 * <p>
 * 输入：arr = [1,2]
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * 输出：true
 * </p>
 *
 * @author wangwq
 */
public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int i : arr) {
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }

        return counter.values().size() == new HashSet<Integer>(counter.values()).size();
    }
}
