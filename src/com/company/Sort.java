package com.company;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {30, 2, 5, 100, 1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{4, 5, 1, 2, 3};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{4, 50, -11, 200, -32};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{5, 4, 3, 2, 1}; // when elements are from 1 to n only
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
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

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length - 1 - i;
            int maxIndex = findMaxIndex(arr, start, end);
            swap(arr, maxIndex, end);
        }
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    swapped = true;
                }
            }
            // if no element is swapped for a particular iteration, it means the array is sorted, and we can break
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
