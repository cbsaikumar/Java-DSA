package com.company;

import java.util.Arrays;

public class SmallestMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 0, 4, 3}; // 2 is missing which is smallest +ve

        int ans = findMissingNumber(arr);
        System.out.println(ans);
    }

    private static int findMissingNumber(int[] arr) {
        //lets ignore -ve nums
        cycleSort(arr);
        // after sort {1, -1, 3, 4, 5}
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return arr.length;
    }

    private static void cycleSort(int[] arr) {
        int i = 0;
        while(i<arr.length){
            if(arr[i] > 0){
                if(arr[i] != i+1){
                    int correctIdx = arr[i] - 1;
                    swap(arr, i, correctIdx);
                } else{
                    i++;
                }
            } else{
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
