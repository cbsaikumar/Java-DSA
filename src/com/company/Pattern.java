package com.company;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int row= 1; row<=n; row++){
            for(int col = 1; col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row= 1; row<=n; row++){
            for(int col = 1; col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

        for(int row= 1; row<=2*n - 1; row++){
            int totalColumns = row > n ? 2*n - row : row;
            int totalSpaces = n-totalColumns;
            for(int s = 1; s<=totalSpaces; s++){
                System.out.print(" ");
            }
            for(int col = 1; col<=totalColumns;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
