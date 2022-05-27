package com.company;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;

        double ans = sqrt(n, precision);
        System.out.println(ans);
    }

    private static double sqrt(int n, int p) {
        double root = 0.0;
        int start = 0;
        int end = n;

        while (start <= end){
            int mid = start + (end-start)/2;
            if(mid*mid == n) {
                return mid;
            }

            if(mid*mid > n) {
                end = mid-1;
            }

            else {
                start = mid + 1;
            }
        }
        double incr = 0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr= incr/10;
        }

        return root;
    }
}
