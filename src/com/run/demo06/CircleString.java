package com.run.demo06;

public class CircleString {

    public static boolean isCircle(String s) {
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isCircle("levvel"));
    }
}
