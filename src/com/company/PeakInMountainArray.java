package com.company;

public class PeakInMountainArray {
    public static void main(String[] args) {
        // write your code here
        int[] arr = {1, 3, 10, 19, 43, 31, 0};
        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start]; // or end both will be equal after loop
    }
}
