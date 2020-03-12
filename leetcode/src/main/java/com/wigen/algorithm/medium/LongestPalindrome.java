package com.wigen.algorithm.medium;

/**
 * 5. 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        if (isPalindrome(s)) return s;

        int len = s.length();
        int distance = 1;
        int max = 0;
        String result = null;

        while (distance < len) {
            for (int i = 0; i <= (len - distance); i++) {
                String subStr = s.substring(i, i + distance);
                if (isPalindrome(subStr) && subStr.length() > max) { // 是回文子串
                    max = subStr.length();
                    result = subStr;
                    break;
                }
            }
            distance++;
        }

        return result;
    }

    /**
     * 判断是否回文子串
     */
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int rightLoc = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[rightLoc]) {
                return false;
            } else {
                rightLoc--;
            }
        }
        return true;
    }

    /**
     * 提交超出时间限制
     */
    public static void main(String[] args) {
        long curr = System.currentTimeMillis();
        String s = longestPalindrome("slvafhpfjpbqbpcuwxuexavyrtymfydcnvvbvdoitsvumbsvoayefsnusoqmlvatmfzgwlhxtkhdnlmqmyjztlytoxontggyytcezredlrrimcbkyzkrdeshpyyuolsasyyvxfjyjzqksyxtlenaujqcogpqmrbwqbiaweacvkcdxyecairvvhngzdaujypapbhctaoxnjmwhqdzsvpyixyrozyaldmcyizilrmmmvnjbyhlwvpqhnnbausoyoglvogmkrkzppvexiovlxtmustooahwviluumftwnzfbxxrvijjyfybvfnwpjjgdudnyjwoxavlyiarjydlkywmgjqeelrohrqjeflmdyzkqnbqnpaewjdfmdyoazlznzthiuorocncwjrocfpzvkcmxdopisxtatzcpquxyxrdptgxlhlrnwgvee");
        System.out.println(System.currentTimeMillis() - curr);
        System.out.println(s);
    }
}
