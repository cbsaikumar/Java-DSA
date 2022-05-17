package com.company;

public class BinarySearch {
    public static void main(String[] args) {
	// write your code here
        int[] arr = {-99, -32, -19, -2, 10, 39, 56, 81, 94};
        int target = -99;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
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
        return -1;
    }
}
