package com.company;

public class Primes {
    public static void main(String[] args) {
        int n = 53;
//        System.out.println("is n prime? "+isPrime(n));
        sieveOfEratosthenes(40);
    }

    private static boolean isPrime(int n) {
        int c = 2;
        while (c*c < n){
            if(n%c == 0) return false;
            c++;
        }
        return true;
    }

    private static void sieveOfEratosthenes(int n){
        boolean[] checks = new boolean[n];

        int c = 2;
        while(c*c < n){
            if(!checks[c]){
                for(int i = c*2; i<n; i=i+c) checks[i] = true;
            }
            c++;
        }
        for(int j=2;j<n;j++){
            if(!checks[j]){
                System.out.println(j+" ");
            }
        }
    }
}
