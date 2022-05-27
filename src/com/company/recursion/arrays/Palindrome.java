package com.company.recursion.arrays;

public class Palindrome {
    public static void main(String[] args) {
        String str = "333";
        boolean ans = palin(str, 0, str.length()-1);
        System.out.println(ans);
    }

    private static boolean palin(String str, int start, int end) {
        if(end <= start) return true;

        return str.charAt(start) == str.charAt(end) && palin(str, start+1, end - 1);
    }
}
