package com.company.recursion.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {7, 3, -9, 10, 4, 0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums) {
        helper(nums, 0, nums.length - 1);
    }

    private static void helper(int[] nums, int start, int end) {
        if(end <= 0) return;
        if(start == end) {
            helper(nums, 0, end - 1);
        } else {
            if(nums[start] > nums[start + 1]) {
                swap(nums, start, start+1);
            }
            helper(nums, start+1, end);
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
