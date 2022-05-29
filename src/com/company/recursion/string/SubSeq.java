package com.company.recursion.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {
    public static void main(String[] args) {
        String input = "ABC";
        ArrayList<String> ans = subSeq(input);
        System.out.println(ans);
    }

    private static ArrayList<String> subSeq(String input) {
        return helper(input, "");
    }

    private static ArrayList<String> helper(String input, String up) {
        if(input.isEmpty()) {
            ArrayList<String> out = new ArrayList<>();
            out.add(up);
            return out;
        }

        char ch = input.charAt(0);
        ArrayList<String> ansFromLeft = helper(input.substring(1), up+ch);
        ArrayList<String> ansFromRight = helper(input.substring(1), up);

        ansFromLeft.addAll(ansFromRight);


        return ansFromLeft;
    }
}
