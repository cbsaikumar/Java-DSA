package com.company;

public class BinarySearch {
    public static void main(String[] args) {
	// write your code here
        int[] arr = {-99, -32, -19, -2, 10, 39, 56, 81, 94};
        int target = 940;
        System.out.println(searchWithRec(arr, target, 0, arr.length - 1));
    }

    // without recursion
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

    // with recursion
    static int searchWithRec(int[] arr, int target, int start, int end){
        int mid = start + (end-start)/2;

        if(start > end) return -1;

        if(arr[mid] == target) return mid;

        if(target < arr[mid]) return searchWithRec(arr, target, 0, mid-1);

        return searchWithRec(arr, target, mid+1, end);
    }
}
