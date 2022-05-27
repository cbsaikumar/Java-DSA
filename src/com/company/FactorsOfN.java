package com.company;

import java.util.ArrayList;

public class FactorsOfN {
    public static void main(String[] args) {
        int n = 110;
        factors(n);
    }

    private static void factors(int n) {
        ArrayList remaining = new ArrayList();
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.print(i+" ");
                remaining.add(n/i);
            }
        }
        for(int i = remaining.size() - 1; i>=0; i--){
            System.out.print(remaining.get(i)+" ");
        }
    }
}
