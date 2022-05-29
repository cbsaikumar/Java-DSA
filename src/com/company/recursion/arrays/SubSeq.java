package com.company.recursion.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        String input = "ABC";
        ArrayList<String> ans = subSeq(input);
        System.out.println(ans);
    }

    private static ArrayList<String> subSeq(String input) {
        return helper(input, 0, new ArrayList<String>());
    }

    private static ArrayList<String> helper(String input, int start, ArrayList<String> out) {
        if(start == input.length()) {
            return out;
        }
        for(int i = start; i <input.length(); i++){
            return helper(input, start+1, out);
        }

        return out;
    }
}
