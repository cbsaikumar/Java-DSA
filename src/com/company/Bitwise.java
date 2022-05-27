package com.company;

import java.util.Arrays;

public class Bitwise {
    public static void main(String[] args) {
        // all numbers repeats n times in array except one num
        int[] arr = {1,2,3,1,2,3,5,1,2,3,1,2,3};
        int n = 3;
        int out = 0;
        for(int i: arr){
            out^=i;
        }
        System.out.println(out);
        System.out.println(out%n);

        System.out.println("power "+power(2,6));
    }

    static int power(int base, int power){
        int ans = 1;
        while(power>0){
            int last = power & 1;
            if(last == 1){
                ans*=base;
            }
            base*=base;
            power>>=1;
        }
        return ans;
    }
}
