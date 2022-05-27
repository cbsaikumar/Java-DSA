package com.company.recursion.arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 10, 8, 7, 1, 2, 0, 7, 9};
        int target = 7;
        int index = findIndex(arr, target);

        System.out.println(index);

        ArrayList<Integer> indices = findAllIndex(arr, 7, 0);
        System.out.println(indices);
    }


    private static int findIndex(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    private static int helper(int[] arr, int target, int idx) {
        if (arr[idx] == target) return idx;

        if (idx == arr.length - 1) return -1;

        return helper(arr, target, idx+1);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int start) {
        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length) return list;

        if(arr[start] == target) {
            list.add(start);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, start+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
