package com.company.recursion.arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {9, 8, 10, 5, -5, 15, 12};

        sort(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums) {
        helper(nums, 0, nums.length - 1);
    }

    private static void helper(int[] nums, int start, int end) {
        if(start == end || end == 0) return;
        int max = findMax(nums, start, end, start);
        swap(nums, max, end);
        helper(nums, start, end - 1);
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    private static int findMax(int[] nums, int start, int end, int max) {
        if(start == end) return max;
        if(nums[start+1] > nums[max]) return findMax(nums, start+1, end, start+1);
        return findMax(nums, start+1, end, max);
    }
}
