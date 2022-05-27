package com.company.recursion.arrays;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {2, 10, 8};
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    private static boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int index) {
        if(index >= arr.length - 1) return true;

        if(arr[index] < arr[index+1]) return helper(arr, index+1);

        return false;
    }
}

