package com.company.recursion.string;

public class SkipAChar {
    public static void main(String[] args) {
        String str = "naccerpoacuic3";
        String ans = skipAChar(str, 'a');
        System.out.println(str);
        System.out.println(ans);
    }

    private static String skipAChar(String str, char c) {
        return helper(str, c, "");
    }

    private static String helper(String str, char c, String ans) {
        if(str == "") return ans;

        char current = str.charAt(0);
        if(current != c) return helper(str.substring(1), c, ans+current);

        return helper(str.substring(1), c, ans);
    }
}
