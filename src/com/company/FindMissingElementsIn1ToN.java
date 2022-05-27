package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElementsIn1ToN {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 6, 2, 7, 1, 8};
        List<Integer>[] ans = findMissingArray(nums);
        System.out.println("missing");
        System.out.println(ans[0]);
        System.out.println("dups");
        System.out.println(ans[1]);
    }

    private static List<Integer>[] findMissingArray(int[] nums) {
        cycleSort(nums);
        List<Integer> missing = new ArrayList<>();
        List<Integer> dups = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                missing.add(i+1);
                dups.add(nums[i]);
            }
        }
        return new List[]{missing, dups};
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
