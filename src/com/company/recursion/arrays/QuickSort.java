package com.company.recursion.arrays;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start >= end) return;

        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int count = 0;
        int pivotIndex = start;
        int pivot = arr[pivotIndex];
        for(int l = start+1; l<=end; l++){
            if(arr[l] <= pivot) count++;
        }
        pivotIndex = start + count;

        swap(arr, start, pivotIndex);

        int i = start;
        int j = end;

        while (i<pivotIndex && j>pivotIndex){
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;

            if(i<pivotIndex && j>pivotIndex){
                swap(arr, i++, j--);
            }
        }

        return pivotIndex;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
