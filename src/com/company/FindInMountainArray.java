package com.company;

public class FindInMountainArray {
    public static void main(String[] args) {
        // array in ascending order
        int[] arr = {1, 10, 15, 44, 67, 33, 20, 0};
        int target = 20;

        System.out.println(findInMountain(arr, target));
    }

    static int findInMountain(int[] arr, int target){
        int peak = findPeak(arr);

        int ans = orderAgnosticBS(arr, target, 0, peak);
        if(ans == -1){
            ans = orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
        }
        return ans;
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
        return start; // or end both will be equal after loop -> index
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }
            boolean isAsc = arr[start] < arr[end];
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
