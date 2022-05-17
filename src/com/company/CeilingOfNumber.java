package com.company;

public class CeilingOfNumber {
    public static void main(String[] args) {
        // write your code here
        int[] arr = {-99, -32, -19, -2, 10, 39, 56, 81, 94};
        int target = 95;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target){
        if(target > arr[arr.length - 1]) return -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
