package com.wigen.algorithm.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int max = 0;
        char[] arr = s.toCharArray();
        List<Character> container = new ArrayList<>(s.length());
        int temp = 0;
        for (int i = temp; i < arr.length; i++) {
            if (!container.contains(arr[i])) {
                container.add(arr[i]);
            } else {
                max = (i - temp) > max ? (i - temp) : max;
                container.clear();
                i = temp;
                temp += 1;
            }
        }
        return Math.max(max, container.size());
    }

    public static void main(String[] args) {
       int i = lengthOfLongestSubstring("pwwkew");
        System.out.println(i);
    }

}
