package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // array in ascending order
        int[] arr = {-66, -20, 0, 13, 29, 51, 88, 101};
        int target = 101;

        System.out.println(orderAgnosticBS(arr, target));

        // array in descending order
        int[] anotherArr = {63, 49, 20, 1, -17, -42, -99};
        int anotherTarget = 20;

        System.out.println(orderAgnosticBS(anotherArr, anotherTarget));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
