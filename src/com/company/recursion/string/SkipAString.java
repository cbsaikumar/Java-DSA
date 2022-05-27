package com.company.recursion.string;

public class SkipAString {
    public static void main(String[] args) {
        String str = "noaccerpoacuic3";
        String ans = skipAString(str, "oa");
        System.out.println(str);
        System.out.println(ans);
    }

    private static String skipAString(String str, String c) {
        return helper(str, c, "");
    }

    private static String helper(String str, String c, String ans) {
        if(str.length() < c.length()) return ans;

        String current = str.substring(0, c.length());
        if(current.equals(c)) return helper(str.substring(current.length()), c, ans);

        return helper(str.substring(1), c, ans+str.charAt(0));
    }
}
