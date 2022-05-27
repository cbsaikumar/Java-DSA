package com.company.recursion.arrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {8, 3, 4, 12, 5, 6};

        int[] nums2 = {5, 4, 3, 2, 1};

        int[] ans = sort(nums);

        int[] ans2 = sort(nums2);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
    }

    private static int[] sort(int[] nums) {
        if (nums.length == 1) return nums;
        int mid = nums.length / 2;

        int[] left = sort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[left.length + right.length];

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                mergedArray[k] = left[i];
                i++;
            } else {
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }
        // append the remaining elements if any
        while(i<left.length){
            mergedArray[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mergedArray[k] = right[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}
