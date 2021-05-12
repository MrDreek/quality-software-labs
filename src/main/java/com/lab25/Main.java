package com.lab25;

public class Main {

    public static void main(String[] args)  {
        System.out.println(reverseString("qwerty"));
        System.out.println(reverseString("asdfg"));
        System.out.println(reverseString("asd321dsa"));
    }

    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        return result.toString();
    }

}