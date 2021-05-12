package com.lab23;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)  {
        System.out.println(isPalindrome("qwertyytrewq") ? "Yes" : "No");
        System.out.println(isPalindrome("qwerty") ? "Yes" : "No");
        System.out.println(isPalindrome("qqqwqqq") ? "Yes" : "No");
    }

    public static boolean isPalindrome(String text) {
        String temp  = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
}