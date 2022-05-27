package com.company;

import java.util.Arrays;

public class DuplicateIn1toN {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycleSort(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
