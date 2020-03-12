package com.wigen.algorithm.medium;

import java.util.regex.Pattern;

public class MyAtoi {
    public int myAtoi(String str) {
        str = str.trim();
        int temp = 0;
        String result = null;

        for (int i = 0; i < str.length(); i++) {
            if (isNum(str.substring(temp, i))) {
                result = str.substring(temp, i);
            } else {
                temp++;
            }
        }
        return 0;
    }

    public static boolean isNum(String s) {
        return Pattern.matches("^[\\+\\-]?\\d+$", s);
    }

    public static void main(String[] args) {
        boolean b = isNum("-123");
        System.out.println(b);
    }
}
