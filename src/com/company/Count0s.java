package com.company;

public class Count0s {
    public static void main(String[] args) {
        int n = 1090333038;
        System.out.println(count(n));
    }

    private static int count(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int count){
        if(n == 0) return count;

        if(n%10 == 0) return helper(n/10, count+1);

        return helper(n/10, count);
    }
}
